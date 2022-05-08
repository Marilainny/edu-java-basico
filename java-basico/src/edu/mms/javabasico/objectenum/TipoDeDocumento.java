package edu.mms.javabasico.objectenum;
/**
 * Classe enum exemplificando o objeto, estado, comportamentos, polimorfismo.
 * @author  	 Marilainny Martins da Silva
 * @version 	 1.0
 * @since     07.05.2022
 * @implNote  modelo exemplo.* 			 
 */
public enum TipoDeDocumento {

	/*
	 * Exemplo sem enum:
	 * public class TiposDeDocumento {
	 *
	 * public static final int DOCUMENTO_RG    = 0;
	 * public static final int DOCUMENTO_CPF   = 1;
	 * public static final int DOCUMENTO_CNPJ  = 2;
	 * 
	 * }
	 */

	RG("RG - Registro Geral"),
	CPF("CPF - Cadastro de Pessoas Físicas"),
	CNPJ("CNPJ - Cadastro Nacional da Pessoa Jurídica");

	private String descricao;
	
	

	private TipoDeDocumento() {
		
	}

	TipoDeDocumento(String descricao) {
		this.descricao = descricao;

	}

	public String getDescricao() {
		return descricao;
	}


}
