package edu.mms.javabasico.string;
/**
* A PrintfMain mostra exemplos de como utilizar a formata��o na sa�da.
*   
* @author  	 Marilainny Martins da Silva
* @version 	 1.0
* @since     01.06.2022
* @implNote  Exemplo didatico na programa��o utiliza-se Java.util.Formater;
* 
* %s -> String
* %S -> String upperCase
* %n -> Quebra de linha	
* %c -> imprime o conte�do da vari�vel com representa��o ASCII;	
* %d -> imprime o conte�do da vari�vel com representa��o decimal com sinal;	
* %f -> imprime o conte�do da vari�vel com representa��o com ponto decimal; 
*/
public class PrintfMain {

	public static void main(String[] args) {
		
		/*
		 * Primeiro argumento � uma string informando a formata��o.
		 * O segundo parametro � um args;
		 */
		System.out.printf("%s %n", "Hello World");
		System.out.printf("%S %n", "Hello World");
		
		/*
		 * Adicionar espa�amento inicial, em caracteres a direita;
		 * tamb�m pode ser colocado a esquerda.
		 */
		System.out.printf("%15s%n", "Espa�amento a direita");
		System.out.printf("%-30s", "Espa�amento a esquerda");
		System.out.printf("%s%n", " do texto");
		
		//usar aspa simples
		System.out.printf("%c%n", 'w');
		System.out.printf("%C%n", 'w');
		
		int valor = 123456;
		System.out.printf("%d%n", valor);
		
		//flutuante
		double flutuante = 3.14394949;
		System.out.printf("%f%n", flutuante);
		
		//casas decimais ponto flutuante
		System.out.printf("%.3f%n", flutuante);
		System.out.printf("%.2f%n", flutuante);
		
		//valores monetarios
		System.out.printf("R$:%.3f%n", flutuante);
		System.out.printf("R$:%10.3f%n", flutuante);
		
		//valor negativo
		int valorNegativo = -898;
		System.out.printf("%d%n", valorNegativo);
		
		//valor positivo
		int valorPositivo = +898;
		System.out.printf("%+d%n", valorPositivo);
		
		//total de caracteres que ser� completados com zero.
		int valorFormatado = 123;
		System.out.printf("%08d%n", valorFormatado);
		
		//separar as casas decimais por virgula (no Brasil pontos).
		int casasDecimais = 1000000000;
		System.out.printf("%,d%n", casasDecimais);
		
		//espa�o antes do valor, caso negativo n�o dar espa�o.
		int valorEspaco = 123456;
		System.out.printf("% d%n", valorEspaco);
		System.out.printf("% d%n", valorNegativo);
		
		
		exemploPratico();
		
	}
	
	//Exemplo pr�tico
	public static void exemploPratico() {
		
		double[] precos = { 1000, 3, 500, 456.23, 2.5, 78.99, 45.98};
		
		for(int i = 0; i < precos.length; i++) {
			System.out.printf("%s %02d valor de R$:%,10.2f%n", "Item", i+1, precos[i]);
		}
	}

}
