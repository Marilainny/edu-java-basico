package edu.mms.javabasico.objectenum;
/*
 * A classe Data 
 * uma forma de usar o enum, quando este,
 *  vai ser utilizado apenas para uma classe especifica.
 *   
 * @author  	 Marilainny Martins da Silva
 * @version 	 1.0
 * @since     18.05.2022
 * @implNote  Vídeo Aula Lorrane.			 
 */
public class Formulario {
	
	enum Genero{
		FEMININO('F'), MASCULINO('M');
		
		private char valor;
		
		Genero(char valor){
			this.valor = valor;
		}
	}
	
	private String nome;
	private Genero genero;

}
