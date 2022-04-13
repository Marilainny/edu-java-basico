package edu.mms.javabasico.heranca.main;

import edu.mms.javabasico.heranca.Aluno;
import edu.mms.javabasico.heranca.Pessoa;
import edu.mms.javabasico.heranca.Professor;

// importação das classes


/**
 * A classe TesteHeranca é usada para testar os códigos.
 *   
 * @author  Marilainny Martins da Silva
 * @version 1.0
 * @since   2020.04.11 
 */

public class TesteHeranca {

	public static void main(String[] args) {

		//Instancias das classes Pessoa, Aluno e Professor;
		
		Pessoa pessoa = new Pessoa();
		Aluno aluno = new Aluno();
		Professor professor = new Professor();


		//Setar valores
		
		pessoa.setNome("Mariana A. Souza");
		pessoa.setEndereco("Rua Pessoa");
		pessoa.setTelefone("3232-3232");
		
		System.out.println(pessoa.obterEtiquetaEndereco());
		
		aluno.setNome("José Carlos");
		aluno.setEndereco("Rua Aluno");
		aluno.setTelefone("555-55555");
		
		System.out.println(aluno.obterEtiquetaEndereco());
		
		professor.setNome("José Carlos");
		professor.setEndereco("Rua Aluno");
		professor.setTelefone("555-55555");
		
		System.out.println(professor.obterEtiquetaEndereco());


	}

}
