package edu.mms.javabasico.heranca;

/**
* A classe Pessoa especifica funcionalidades para outras classes.
* 		uma classe abstrata não pode ser instanciada, apenas estendida.
* 
* @author  	 Marilainny Martins da Silva
* @version 	 1.1
* @since     14.04.2022
* @implNote  Release 15.04.2022  			 
*/


public abstract class Pessoa {
	
	private String nome;
	
	private String endereco;
	
	private String telefone;
	
	private String cpf;

	/*
	 * Construtor Vazio 
	 *  O construtor é unicamente invocado no momento da criação do objeto através do operador new. 
	 */
	public Pessoa() {
		
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	/*
	 * Método que se extends para as classes filhas.
	 */
	public String obterEtiquetaEndereco() {
		return endereco;
	}
	
	/*
	 * Método abstrato para ser implementado nas classes filhas.
	 */
	public abstract void imprimirEtiquetaEndereço();
	
}
