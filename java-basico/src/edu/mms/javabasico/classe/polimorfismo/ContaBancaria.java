package edu.mms.javabasico.classe.polimorfismo;
/**
 * A ContaBancaria onde encontra-se os métodos principais para uma conta,
 * outras classes extends esta classe.
 *   
 * @author  	 Marilainny Martins da Silva
 * @version 	 1.0
 * @since     26.04.2022
 * @implNote  polimorfismo.			 
 */
public class ContaBancaria {

	private String nomeCliente;
	private String numeroContaBancaria;
	private double saldoContaBancaria;

	public ContaBancaria() {
	}

	public ContaBancaria(String nomeCliente, String numeroContaBancaria, double saldoContaBancaria) {
		this.nomeCliente = nomeCliente;
		this.numeroContaBancaria = numeroContaBancaria;
		this.saldoContaBancaria = saldoContaBancaria;
	}
	/*
	 * Método para visualizar saldo
	 */
	public double visualizarSaldo() {
		return this.getSaldoContaBancaria();		
	}
	/*
	 * Método soma o valorDeposito a saldoContaBancaria;
	 */
	public void depositarValor(double valorDeposito) {
		this.saldoContaBancaria = this.saldoContaBancaria + valorDeposito;
	}

	/*
	 * Método verifica se o saldoContaBancaria tem valor disponível para saque; 
	 */
	public boolean verificarSaldoDisponivel() {
		if(this.saldoContaBancaria > 0) {
			return true;
		}
		return false;
	}
	/*
	 * Método para sacar valor do saldoContaBancario
	 * caso o saldo for maior de zero e maior ou igual valor do Saque.
	 */
	public void sacarValor(double valorSaque) {
		if(verificarSaldoDisponivel() == true && saldoContaBancaria >= valorSaque) {
			this.saldoContaBancaria -= valorSaque;
		} else {
			System.out.println("Saldo insuficiente para saque! Valor disponível para saque: "+this.visualizarSaldo());
		}		
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getNumeroContaBancaria() {
		return numeroContaBancaria;
	}

	public void setNumeroContaBancaria(String numeroContaBancaria) {
		this.numeroContaBancaria = numeroContaBancaria;
	}

	public double getSaldoContaBancaria() {
		return saldoContaBancaria;
	}

	public void setSaldoContaBancaria(double saldoContaBancaria) {
		this.saldoContaBancaria = saldoContaBancaria;
	}

	@Override
	public String toString() {
		return "ContaBancaria [nomeCliente=" + nomeCliente + ", numeroContaBancaria=" + numeroContaBancaria
				+ ", saldoContaBancaria=" + saldoContaBancaria + "]";
	}

}
