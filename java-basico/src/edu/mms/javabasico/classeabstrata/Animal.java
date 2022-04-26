package edu.mms.javabasico.classeabstrata;

/**
* A classe Animal especifica funcionalidades para outras classes.
* 		uma classe abstrata não pode ser instanciada, apenas estendida.
*   
* @author  	 Marilainny Martins da Silva
* @version 	 1.0
* @since     14.04.2022
* @implNote  Release 15.04.2022  			 
*/
public abstract class Animal {
	
	private String nome;
	
	
	public String getNome() {
		return nome;
	}

	public abstract void emitirSom();

}
