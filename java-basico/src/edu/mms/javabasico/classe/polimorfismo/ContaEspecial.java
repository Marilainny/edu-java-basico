package edu.mms.javabasico.classe.polimorfismo;
/**
 * A ContaPoupanca extends da ContaEspecial e sobrescreve o toString,
 * e atualiza o saldo da ContaBancaria através de limite.
 *   
 * @author  	 Marilainny Martins da Silva
 * @version 	 1.0
 * @since     26.04.2022
 * @implNote  polimorfismo.			 
 */
public class ContaEspecial extends ContaBancaria {

	private double valorLimite;


	public ContaEspecial() {

	}

	public ContaEspecial(double valorLimite) {
		this.valorLimite = valorLimite;
	}

	public ContaEspecial(String nomeCliente, String numeroContaBancaria, double saldoContaBancaria, double valorLimite) {
		super(nomeCliente, numeroContaBancaria, saldoContaBancaria);
		this.valorLimite = valorLimite;
	}

	/*
	 * Método para verificar o limete total da contaBancaria com valorLimite.
	 */
	public double verificarLimite() {
		double saldoLimite = super.getSaldoContaBancaria() + this.valorLimite;
		return saldoLimite;
	}

	/*
	 * Método para sacar valor do saldoContaBancario somando com o limite da ContaEspecial.
	 * caso o saldo for maior de zero e maior ou igual valor do saque.
	 */
	public void sacarValor(double valorSaque) {
		if(verificarSaldoDisponivel() == true && this.verificarLimite() >= valorSaque) {
			super.setSaldoContaBancaria(super.getSaldoContaBancaria() - valorSaque);
		} else {
			System.out.println("Saldo insuficiente para saque! Valor disponível para saque: "+this.verificarLimite());
		}		
	}		

	public double getValorLimite() {
		return valorLimite;
	}

	public void setValorLimite(double valorLimite) {
		this.valorLimite = valorLimite;
	}

	@Override
	public String toString() {
		return "ContaEspecial [valorLimite=" + valorLimite +" "+super.toString()+ "]";
	}
}
