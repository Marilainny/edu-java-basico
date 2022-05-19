package edu.mms.javabasico.heranca;

import java.util.Arrays;

/**
* A classe Aluno é usada como um exemplo de herança com classe Pessoa.
*   
* @author  Marilainny Martins da Silva
* @version 1.0
* @since   11.04.2022 
*/

public class Aluno extends Pessoa{
	
	private String cursos[];
	
	private double[] notas;

	
	public Aluno() {
		super();
	}

	public String[] getCursos() {
		return cursos;
	}

	public void setCursos(String[] cursos) {
		this.cursos = cursos;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	@Override
	public String obterEtiquetaEndereco() {
		String etiqueta = "Endereço do Aluno: ";
		etiqueta+= super.getEndereco();
		return etiqueta;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(cursos);
		result = prime * result + Arrays.hashCode(notas);
		return result;
	}

	@Override
	public void imprimirEtiquetaEndereço() {
		System.out.println(this.obterEtiquetaEndereco()+" Nome do Professor: "+super.getNome());
	}

	

}
