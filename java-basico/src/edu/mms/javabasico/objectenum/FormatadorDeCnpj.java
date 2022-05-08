package edu.mms.javabasico.objectenum;

import java.util.InputMismatchException;

public class FormatadorDeCnpj {

	public static boolean isCNPJ(String CNPJ) {

		// considera-se erro CNPJ's formados por uma sequência de números iguais
		if (CNPJ.equals("00000000000000") || CNPJ.equals("11111111111111") ||
				CNPJ.equals("22222222222222") || CNPJ.equals("33333333333333") ||
				CNPJ.equals("44444444444444") || CNPJ.equals("55555555555555") ||
				CNPJ.equals("66666666666666") || CNPJ.equals("77777777777777") ||
				CNPJ.equals("88888888888888") || CNPJ.equals("99999999999999") ||
				(CNPJ.length() != 14))
			       return(false); 
			
			char dig13, dig14;
			int sm, i, r, num, peso;

			// "try" - protege o código para eventuais erros de conversao de tipo (int)
			try { 
				// Calculo do 1o. Digito Verificador
				sm = 0;
				peso = 2;

				/*converte o i-ésimo caractere do CNPJ em um número:
				 * por exemplo, transforma o caractere '0' no inteiro 0,
				 * (48 é a posição de '0' na tabela ASCII)
				 * 12 primeiros números do CNPJ, 
				 * é multiplicado por um peso que começa de 2 
				 * e vai sendo incrementado, somando-se as parcelas calculadas,
				 * Sempre que o peso atingir o valor 10, deve receber o valor inicial 2:
				 */
				for (i=11; i>=0; i--) {
					num = (int)(CNPJ.charAt(i) - 48);
					sm = sm + (num * peso); 
					peso = peso + 1;
					if (peso == 10)
						peso = 2;
				}
				
				/*
				 * Se o resto da divisão (operador %) calculado for 0 ou 1, 
				 * O dígito verificador será 0; nos outros casos, 
				 * o dígito verificador é definido pela expressão: 11 - 3 = 8
				 */
				r = sm % 11;
				if ((r == 0) || (r == 1))
					dig13 = '0';
				else dig13 = (char)((11-r) + 48);

				/*
				 * Calculo do 2o. Digito Verificador
				 * Cada um dos treze primeiros números do CNPJ, a partir do primeiro DV (13º número) até o 1º, 
				 * é multiplicado por um peso que começa de 2 e que vai sendo incrementado, 
				 * somando-se as parcelas calculadas. 
				 * Sempre que o peso atingir o valor 10 ele deve novamente receber o valor inicial 2:
				 */
				sm = 0;
				peso = 2;
				for (i=12; i>=0; i--) {
					num = (int)(CNPJ.charAt(i) - 48);
					sm = sm + (num * peso);
					peso = peso + 1;
					if (peso == 10)
						peso = 2;
				}
				
				/*
				 * Se o resto da divisão for 0 ou 1, 
				 * o dígito verificador será 0; 
				 * nos outros casos, o dígito verificador é definido pela expressão: 11 - 6 = 5
				 */
				r = sm % 11;
				if ((r == 0) || (r == 1))
					dig14 = '0';
				else dig14 = (char)((11-r) + 48);

				// Verifica se os dígitos calculados conferem com os dígitos informados.
				if ((dig13 == CNPJ.charAt(12)) && (dig14 == CNPJ.charAt(13)))
					return(true);
				else return(false);
			} catch (InputMismatchException erro) {
				return(false);
			}
	}

	
	public static String imprimeCNPJ(String CNPJ) {
		// máscara do CNPJ: 99.999.999.9999-99
		return(CNPJ.substring(0, 2) + "." + CNPJ.substring(2, 5) + "." +
				CNPJ.substring(5, 8) + "." + CNPJ.substring(8, 12) + "-" +
				CNPJ.substring(12, 14));
	}


}

