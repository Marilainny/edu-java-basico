package edu.mms.javabasico.string;
/**
* A PrintfMain mostra exemplos de como utilizar a formatação na saída.
*   
* @author  	 Marilainny Martins da Silva
* @version 	 1.0
* @since     01.06.2022
* @implNote  Exemplo didatico na programação utiliza-se Java.util.Formater;
* 
* %s -> String
* %S -> String upperCase
* %n -> Quebra de linha	
* %c -> imprime o conteúdo da variável com representação ASCII;	
* %d -> imprime o conteúdo da variável com representação decimal com sinal;	
* %f -> imprime o conteúdo da variável com representação com ponto decimal; 
*/
public class PrintfMain {

	public static void main(String[] args) {
		
		/*
		 * Primeiro argumento é uma string informando a formatação.
		 * O segundo parametro é um args;
		 */
		System.out.printf("%s %n", "Hello World");
		System.out.printf("%S %n", "Hello World");
		
		/*
		 * Adicionar espaçamento inicial, em caracteres a direita;
		 * também pode ser colocado a esquerda.
		 */
		System.out.printf("%15s%n", "Espaçamento a direita");
		System.out.printf("%-30s", "Espaçamento a esquerda");
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
		
		//total de caracteres que será completados com zero.
		int valorFormatado = 123;
		System.out.printf("%08d%n", valorFormatado);
		
		//separar as casas decimais por virgula (no Brasil pontos).
		int casasDecimais = 1000000000;
		System.out.printf("%,d%n", casasDecimais);
		
		//espaço antes do valor, caso negativo não dar espaço.
		int valorEspaco = 123456;
		System.out.printf("% d%n", valorEspaco);
		System.out.printf("% d%n", valorNegativo);
		
		
		exemploPratico();
		
	}
	
	//Exemplo prático
	public static void exemploPratico() {
		
		double[] precos = { 1000, 3, 500, 456.23, 2.5, 78.99, 45.98};
		
		for(int i = 0; i < precos.length; i++) {
			System.out.printf("%s %02d valor de R$:%,10.2f%n", "Item", i+1, precos[i]);
		}
	}

}
