package edu.mms.javabasico.heranca.main;

import edu.mms.javabasico.heranca.Aluno;
import edu.mms.javabasico.heranca.Professor;

/**
 * A classe TesteHeranca é usada para testar os códigos.
 *   
 * @author  Marilainny Martins da Silva
 * @version 1.0
 * @since   2020.04.11 
 */

public class TesteHeranca {

	public static void main(String[] args) {
			
		//Instancias das classes: Aluno, Professor.
		Aluno aluno = new Aluno();
		Professor professor = new Professor();

		//Setar valores
		aluno.setNome("José Carlos");
		aluno.setEndereco("Rua Aluno");
		aluno.setTelefone("555-55555");
		
		System.out.println(aluno.obterEtiquetaEndereco());
		
		professor.setNome("José Carlos");
		professor.setEndereco("Rua Aluno");
		professor.setTelefone("555-55555");
		
		System.out.println(professor.obterEtiquetaEndereco());
		
		aluno.setNome("Marcos Carlos");
		aluno.setEndereco("Rua Aluno");
		aluno.setTelefone("666-55555");
		
		professor.setNome("Julia Carlos");
		professor.setEndereco("Rua Aluno");
		professor.setTelefone("999-55555");
		
		aluno.imprimirEtiquetaEndereço();
		professor.imprimirEtiquetaEndereço();

	}

}
