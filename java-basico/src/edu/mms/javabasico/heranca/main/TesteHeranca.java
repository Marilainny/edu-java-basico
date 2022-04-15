package edu.mms.javabasico.heranca.main;

import edu.mms.javabasico.heranca.Aluno;
import edu.mms.javabasico.heranca.Professor;

/**
 * A classe TesteHeranca � usada para testar os c�digos.
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
		aluno.setNome("Jos� Carlos");
		aluno.setEndereco("Rua Aluno");
		aluno.setTelefone("555-55555");
		
		System.out.println(aluno.obterEtiquetaEndereco());
		
		professor.setNome("Jos� Carlos");
		professor.setEndereco("Rua Aluno");
		professor.setTelefone("555-55555");
		
		System.out.println(professor.obterEtiquetaEndereco());
		
		aluno.setNome("Marcos Carlos");
		aluno.setEndereco("Rua Aluno");
		aluno.setTelefone("666-55555");
		
		professor.setNome("Julia Carlos");
		professor.setEndereco("Rua Aluno");
		professor.setTelefone("999-55555");
		
		aluno.imprimirEtiquetaEndere�o();
		professor.imprimirEtiquetaEndere�o();

	}

}
