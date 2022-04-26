package edu.mms.javabasico.heranca;

/**
 * A classe Professor � usada como um exemplo de heran�a com classe Pessoa.
 *   
 * @author  Marilainny Martins da Silva
 * @version 1.0
 * @since   11.04.2022
 */

public class Professor extends Pessoa{

	/*
	 * Manter os atributos privados;
	 * Acessar os atributos por gets e sets;
	 */
	private String departamento;

	private String nomeCurso;

	private double salario;

	public Professor() {
		super();
		// Construtor da super classe.
	}

	public Professor(String departamento, String nomeCurso, double salario) {
		super();
		this.departamento = departamento;
		this.nomeCurso = nomeCurso;
		this.salario = salario;
		// Construtor da classe com filtros
	}

	/*
	 * Encapsulamento: m�todos getters e setters.
	 */
	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double calcularSalarioLiquido(){
		return 0;
	}
	/*
	 * M�todo da classe Pai 
	 * 	heran�a da classe Pessoa;
	 *  Polimorfismo: sobrecarga de m�todos.
	 */
	public String obterEtiquetaEndereco() {
		String etiqueta = "Endere�o do Professor: ";
		etiqueta+= super.getEndereco();
		return etiqueta;
	}

	/*
	 * O m�todo toString retorna uma representa��o string de um objeto.
	 */
	@Override
	public String toString() {
		return "Professor [departamento=" + departamento + ", nomeCurso=" + nomeCurso + ", salario=" + salario + "]";
	}

	/*
	 * M�todo abstrato para ser implementado nas classes filhas.
	 */
	@Override
	public void imprimirEtiquetaEndere�o() {
		System.out.println(this.obterEtiquetaEndereco()+" Nome do Professor: "+super.getNome());
	}

}
