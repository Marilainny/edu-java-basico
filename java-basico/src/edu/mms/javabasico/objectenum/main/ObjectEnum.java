package edu.mms.javabasico.objectenum.main;


import edu.mms.javabasico.objectenum.Data;
import edu.mms.javabasico.objectenum.DiaSemana;
import edu.mms.javabasico.objectenum.Formatador;
import edu.mms.javabasico.objectenum.FormatadorDeCnpj;
import edu.mms.javabasico.objectenum.TipoDeDocumento;
import edu.mms.javabasico.objectenum.Usuario;


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

		/*
		 * atribuição de Enum
		 * não pode ser instanciado com new.
		 */
		DiaSemana segunda = DiaSemana.SEGUNDA;

		System.out.println(segunda.getValor()+" - "+segunda.toString());


		/*
		 * Usar o enum a partir de uma classe
		 */
		Data data = new Data(01, 04, 2022, DiaSemana.SEXTA);

		/*
		 * Usar o array com enum
		 */
		DiaSemana[] dias = DiaSemana.values();

		//primeira forma de ler 
		for(int i = 0; i < dias.length; i++) {
			System.out.println(dias[i]);
		}
		//segunda forma de ler
		for (DiaSemana dia : DiaSemana.values()) {
			System.out.println(dia);
		}

		//obter o valor a partir de uma string
		System.out.println(Enum.valueOf(DiaSemana.class, "DOMINGO"));

		//atribuir o valor enum para uma variavél.
		DiaSemana dia = Enum.valueOf(DiaSemana.class, "DOMINGO");

		System.out.println(dia);

		//gerar um número de cpf a partir do enum TipoDeDocumento.
		for(TipoDeDocumento documento : TipoDeDocumento.values()) {
			System.out.println(documento + " - "+ documento.geraCpfCnpj());			
		}

		Usuario fisico = new Usuario();
		Usuario juridico = new Usuario();

		fisico.setTipoDocumento(Enum.valueOf(TipoDeDocumento.class, "CPF"));
		fisico.setNumeroDocumento(fisico.getTipoDocumento().geraCpfCnpj());
		System.out.println(fisico.toString());

		juridico.setTipoDocumento(Enum.valueOf(TipoDeDocumento.class, "CNPJ"));
		juridico.setNumeroDocumento(juridico.getTipoDocumento().geraCpfCnpj());
		System.out.println(juridico.toString());		

	}

}


