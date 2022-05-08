package edu.mms.javabasico.objectenum;

import java.util.InputMismatchException;

/**
* Classe fomartador de CPF e CNPJ
* método para verificar se o cpf e o cnpj é valido, e método para imprime os valores formato;
* 
* @author  	 Marilainny Martins da Silva
* @version 	 1.0
* @since     07.05.2022
* @implNote  Validando o CNPJ e CPF em uma Aplicação Java
* {@link https://www.devmedia.com.br/validando-o-cnpj-em-uma-aplicacao-java/22374} 
* {@link https://www.devmedia.com.br/validando-o-cpf-em-uma-aplicacao-java/22097}			 
*/
public class Formatador {
		

	public boolean isCNPJ(String CNPJ) {

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
	
	public String imprimeCNPJ(String CNPJ) {
		// máscara do CNPJ: 99.999.999.9999-99
		return(CNPJ.substring(0, 2) + "." + CNPJ.substring(2, 5) + "." +
				CNPJ.substring(5, 8) + "." + CNPJ.substring(8, 12) + "-" +
				CNPJ.substring(12, 14));
	}	
	
	public boolean isCPF(String CPF) {
		// considera-se erro CPF's formados por uma sequencia de numeros iguais
		if (CPF.equals("00000000000") ||
				CPF.equals("11111111111") ||
				CPF.equals("22222222222") || CPF.equals("33333333333") ||
				CPF.equals("44444444444") || CPF.equals("55555555555") ||
				CPF.equals("66666666666") || CPF.equals("77777777777") ||
				CPF.equals("88888888888") || CPF.equals("99999999999") ||
				(CPF.length() != 11))
			return(false);

		char dig10, dig11;
		int sm, i, r, num, peso;

		// "try" - protege o codigo para eventuais erros de conversao de tipo (int)
		try {
			// Calculo do 1o. Digito Verificador
			sm = 0; 
			peso = 10;
			for (i=0; i<9; i++) {
				
				/*  converte o i-esimo caractere do CPF em um numero:
				 *  por exemplo, transforma o caractere '0' no inteiro 0,
				 *  (48 eh a posicao de '0' na tabela ASCII)
				 */ 
				num = (int)(CPF.charAt(i) - 48);
				sm = sm + (num * peso); 
				peso = peso - 1;
			}

			r = 11 - (sm % 11);
			if ((r == 10) || (r == 11))
				dig10 = '0';
			else dig10 = (char)(r + 48); // converte no respectivo caractere numerico

			/* Calculo do 2o. Digito Verificador
			 * Cada um dos dez primeiros números do CPF, considerando-se aqui o primeiro DV, 
			 * é multiplicado por um peso que começa de 11 e que vai sendo diminuido.
			 */
			sm = 0; 
			peso = 11;
			for(i=0; i<10; i++) {
				num = (int)(CPF.charAt(i) - 48);
				sm = sm + (num * peso); //sm = (5*11)+(4*10)+(6*9)+(4*8)+(7*7)+(1*6)+(4*5)+(2*4)+(9*3)+(4*2) = 299; 
				peso = peso - 1;
			}
			
			/* Se o resto da divisão (operador %) for 10 ou 11, 
			 * o dígito verificador será 0; 
			 * nos outros casos, o dígito verificador é o próprio resto.
			 */
			r = 11 - (sm % 11); //11 - (sm % 11) = 11 - (299 % 11) = 11 - 2 = 9
			if ((r == 10) || (r == 11))
				dig11 = '0';
			else dig11 = (char)(r + 48);

			// Verifica se os digitos calculados conferem com os digitos informados.
			if ((dig10 == CPF.charAt(9)) && (dig11 == CPF.charAt(10)))
				return(true);
			else return(false);
		} catch (InputMismatchException erro) {
			return(false);
		}
	}

	public String imprimeCPF(String CPF) {
		return(CPF.substring(0, 3) + "." + CPF.substring(3, 6) + "." +
				CPF.substring(6, 9) + "-" + CPF.substring(9, 11));
	}
}
