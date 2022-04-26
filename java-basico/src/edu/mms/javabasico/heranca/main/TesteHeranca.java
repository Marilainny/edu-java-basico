package edu.mms.javabasico.heranca.main;

import edu.mms.javabasico.heranca.Aluno;
import edu.mms.javabasico.heranca.Professor;
import edu.mms.javabasico.polimorfismo.ContaBancaria;

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
		professor.setEndereco("Rua Professor");
		professor.setTelefone("9999-55555");
		
		System.out.println(professor.obterEtiquetaEndereco());
		
		aluno.setNome("Marcos Carlos");
		aluno.setEndereco("Rua Aluno");
		aluno.setTelefone("666-55555");
		
		professor.setNome("Julia Carlos");
		professor.setEndereco("Rua Aluno");
		professor.setTelefone("999-55555");
		
		aluno.imprimirEtiquetaEndereço();
		professor.imprimirEtiquetaEndereço();
		
		//método toString
		String[] cursos = {"Português", "Matematica", "Geografia", "História"};
		double[] notas = {7.0, 7.0, 7.0, 7.0};
		
		aluno.setCursos(cursos);
		aluno.setNotas(notas);
		
		System.out.println(aluno);
		
		System.out.println(aluno.equals(cursos));
								
	}

}
