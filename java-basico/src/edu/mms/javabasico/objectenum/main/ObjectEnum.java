package edu.mms.javabasico.objectenum.main;

import edu.mms.javabasico.objectenum.Formatador;
import edu.mms.javabasico.objectenum.FormatadorDeCnpj;
import edu.mms.javabasico.objectenum.TipoDeDocumento;

public class ObjectEnum {

	public static void main(String[] args) {
		
		String cnpj = "14572457000185";
		String numero = "00569893186";
						
		if (FormatadorDeCnpj.isCNPJ(cnpj) == true) {
			System.out.printf("%s\n", FormatadorDeCnpj.imprimeCNPJ(cnpj));
		}else {
			System.out.printf("Erro, CNPJ inválido !!!\n");
		}
		
		Formatador formatador = new Formatador();
		
		if (formatador.isCPF(numero) == true) {
			System.out.printf("%s\n", formatador.imprimeCPF(numero));
		}else {
			System.out.printf("Erro, CPF inválido !!!\n");
		}

	}
}
