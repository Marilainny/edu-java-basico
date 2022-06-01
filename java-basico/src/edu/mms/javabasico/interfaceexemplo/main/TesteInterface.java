package edu.mms.javabasico.interfaceexemplo.main;

import edu.mms.javabasico.classeabstrata.Animal;
import edu.mms.javabasico.classeabstrata.AnimalEstimacao;
import edu.mms.javabasico.classeabstrata.Cachorro;
import edu.mms.javabasico.classeabstrata.Cavalo;
import edu.mms.javabasico.classeabstrata.Gato;
import edu.mms.javabasico.classeabstrata.Mamifero;
import edu.mms.javabasico.heranca.Aluno;
import edu.mms.javabasico.heranca.Pessoa;

public class TesteInterface {

	public static void main(String[] args) {
		
		/*
		 * O uptype casting, upcasting ou coer��o para supertipo � a opera��o dispon�vel na orienta��o a objetos,
		 * permite que uma refer�ncia de superclasse utilize a por��o correspondente nos objetos descendentes de sua hierarquia. 
		 */
		
		Aluno aluno = new Aluno();
		
		Pessoa pessoaAluno = aluno; //upcasting
		
		Pessoa alunoPessoa = (Pessoa) new Aluno();
		
		Object obj = obterString();//downcasting
		String s1 = (String) obj;
		
		Object objNew = "Minha String";
		String s2 = (String) objNew;
		
		//Instanceof		
		Cavalo cavalo = new Cavalo();
		Gato gato = new Gato();
		Cachorro cachorro = new Cachorro();
		
		if(cavalo instanceof Mamifero) {
			System.out.println("Cavalo � um mamifero");
		}
		
		if(gato instanceof AnimalEstimacao) {
			System.out.println("Gato � um animal de estima��o");
		}
		
		if(cachorro instanceof Animal) {
			System.out.println("Cachorro � um animal");
		}		

	}
	public static String obterString() {
		return "minha String";		
	}

}
