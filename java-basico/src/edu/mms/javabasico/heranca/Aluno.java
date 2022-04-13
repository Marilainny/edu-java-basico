package edu.mms.javabasico.heranca;

import java.util.Arrays;

/**
* A classe Aluno � usada como um exemplo de heran�a com classe Pessoa.
*   
* @author  Marilainny Martins da Silva
* @version 1.0
* @since   2020.04.11 
*/

public class Aluno extends Pessoa{
	
	private String cursos[];
	
	private double[][] notas;

	
	public Aluno() {
		super();
	}


	public String[] getCursos() {
		return cursos;
	}


	public void setCursos(String[] cursos) {
		this.cursos = cursos;
	}


	public double[][] getNotas() {
		return notas;
	}


	public void setNotas(double[][] notas) {
		this.notas = notas;
	}
	
	public String obterEtiquetaEndereco() {
		String etiqueta = "Endere�o do Aluno: ";
		etiqueta+= super.getEndereco();
		return etiqueta;
	}

	@Override
	public String toString() {
		return "Aluno [cursos=" + Arrays.toString(cursos) + ", notas=" + Arrays.toString(notas) + "]";
	}

}
