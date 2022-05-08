package edu.mms.javabasico.objectenum;

import java.util.InputMismatchException;

public class FormatadorDeCnpj {

	public static boolean isCNPJ(String CNPJ) {

		// considera-se erro CNPJ's formados por uma sequ�ncia de n�meros iguais
		if (CNPJ.equals("00000000000000") || CNPJ.equals("11111111111111") ||
				CNPJ.equals("22222222222222") || CNPJ.equals("33333333333333") ||
				CNPJ.equals("44444444444444") || CNPJ.equals("55555555555555") ||
				CNPJ.equals("66666666666666") || CNPJ.equals("77777777777777") ||
				CNPJ.equals("88888888888888") || CNPJ.equals("99999999999999") ||
				(CNPJ.length() != 14))
			       return(false); 
			
			char dig13, dig14;
			int sm, i, r, num, peso;

			// "try" - protege o c�digo para eventuais erros de conversao de tipo (int)
			try { 
				// Calculo do 1o. Digito Verificador
				sm = 0;
				peso = 2;

				/*converte o i-�simo caractere do CNPJ em um n�mero:
				 * por exemplo, transforma o caractere '0' no inteiro 0,
				 * (48 � a posi��o de '0' na tabela ASCII)
				 * 12 primeiros n�meros do CNPJ, 
				 * � multiplicado por um peso que come�a de 2 
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
				 * Se o resto da divis�o (operador %) calculado for 0 ou 1, 
				 * O d�gito verificador ser� 0; nos outros casos, 
				 * o d�gito verificador � definido pela express�o: 11 - 3 = 8
				 */
				r = sm % 11;
				if ((r == 0) || (r == 1))
					dig13 = '0';
				else dig13 = (char)((11-r) + 48);

				/*
				 * Calculo do 2o. Digito Verificador
				 * Cada um dos treze primeiros n�meros do CNPJ, a partir do primeiro DV (13� n�mero) at� o 1�, 
				 * � multiplicado por um peso que come�a de 2 e que vai sendo incrementado, 
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
				 * Se o resto da divis�o for 0 ou 1, 
				 * o d�gito verificador ser� 0; 
				 * nos outros casos, o d�gito verificador � definido pela express�o: 11 - 6 = 5
				 */
				r = sm % 11;
				if ((r == 0) || (r == 1))
					dig14 = '0';
				else dig14 = (char)((11-r) + 48);

				// Verifica se os d�gitos calculados conferem com os d�gitos informados.
				if ((dig13 == CNPJ.charAt(12)) && (dig14 == CNPJ.charAt(13)))
					return(true);
				else return(false);
			} catch (InputMismatchException erro) {
				return(false);
			}
	}

	
	public static String imprimeCNPJ(String CNPJ) {
		// m�scara do CNPJ: 99.999.999.9999-99
		return(CNPJ.substring(0, 2) + "." + CNPJ.substring(2, 5) + "." +
				CNPJ.substring(5, 8) + "." + CNPJ.substring(8, 12) + "-" +
				CNPJ.substring(12, 14));
	}


}

