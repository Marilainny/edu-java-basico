package edu.mms.javabasico.polimorfismo;
/**
 * A ContaPoupanca extends da ContaPoupanca e sobrescreve o toString,
 * atualiza o saldo da ContaBancaria através de taxa de rendimento.
 *   
 * @author  	 Marilainny Martins da Silva
 * @version 	 1.0
 * @since     26.04.2022
 * @implNote  polimorfismo.			 
 */

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria{

	private int diaRecebimento;


	public ContaPoupanca() {

	}

	public ContaPoupanca(int diaRecebimento) {
		this.diaRecebimento = diaRecebimento;
	}

	public ContaPoupanca(String nomeCliente, String numeroContaBancaria, double saldoContaBancaria, int diaRecebimento) {
		super(nomeCliente, numeroContaBancaria, saldoContaBancaria);
		this.diaRecebimento = diaRecebimento;
	}
	/*
	 * Método para pegar a data atual e retornar a data.
	 */
	public Integer verificarDataAtual() {
		Calendar dataAtual = Calendar.getInstance();
		int dia = dataAtual.get(Calendar.DAY_OF_MONTH);	
		return dia;
	}

	public double calcularTaxa(double taxaRendimento) {		
		double valorTaxa = ((super.getSaldoContaBancaria() * taxaRendimento)/100);		
		return valorTaxa;		
	}

	public double calcularSaldoPoupanca(double valorRecebimento) {

		if(this.diaRecebimento == this.verificarDataAtual()) {			
			this.setSaldoContaBancaria(this.getSaldoContaBancaria()+this.calcularTaxa(valorRecebimento));				
		}else {
			System.out.println("Calculo de recebiemnto somente no dia "+this.diaRecebimento);
		}
		return this.getSaldoContaBancaria();
	}

	public int getDiaRecebimento() {
		return diaRecebimento;
	}

	public void setDiaRecebimento(int diaRecebimento) {
		this.diaRecebimento = diaRecebimento;
	}
	//sobreposição método toString
	@Override
	public String toString() {
		return "ContaPoupanca [diaRecebimento=" + diaRecebimento+" " + super.toString()+ " ]";
	}









}
