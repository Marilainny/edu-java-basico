package edu.mms.javabasico.objectenum;

/*
 * A classe Data 
 *  com uma variável DiaSemana;
 *   
 * @author  	 Marilainny Martins da Silva
 * @version 	 1.0
 * @since     18.05.2022
 * @implNote  Vídeo Aula Lorrane.			 
 */

public class Data {
	
	private int dia;
	private int mes;
	private int ano;
	private DiaSemana diaSemana;
	
	
	
	public Data() {
		super();
	}

	public Data(int dia, int mes, int ano, DiaSemana diaSemana) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		this.diaSemana = diaSemana;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public DiaSemana getDiaSemana() {
		return diaSemana;
	}

	public void setDiaSemana(DiaSemana diaSemana) {
		this.diaSemana = diaSemana;
	}
	
}
