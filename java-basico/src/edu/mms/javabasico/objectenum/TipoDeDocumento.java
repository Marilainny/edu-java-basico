package edu.mms.javabasico.objectenum;
/**
 * Classe enum exemplificando o objeto, estado, comportamentos, polimorfismo.
 * @author  	 Marilainny Martins da Silva
 * @version 	 1.0
 * @since     07.05.2022
 * @implNote  modelo exemplo.* 			 
 */
public enum TipoDeDocumento {


	CPF {
		@Override
		public String geraCpfCnpj() {
			return GeraCpfCnpj.cpf();
		}
	}, CNPJ {
		@Override
		public String geraCpfCnpj() {
			return GeraCpfCnpj.cnpj();
		}
	};
	
	public abstract String geraCpfCnpj();

}
