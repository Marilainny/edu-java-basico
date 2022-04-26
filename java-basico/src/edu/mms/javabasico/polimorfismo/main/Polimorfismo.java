package edu.mms.javabasico.polimorfismo.main;

import edu.mms.javabasico.polimorfismo.ContaBancaria;
import edu.mms.javabasico.polimorfismo.ContaEspecial;
import edu.mms.javabasico.polimorfismo.ContaPoupanca;

public class Polimorfismo {

	public static void main(String[] args) {

		System.out.println("****Teste Polimorfismo - Conta Bancária***********");

		//Criar objeto conta 
		ContaBancaria poupanca = new ContaBancaria();
		ContaPoupanca contaPoupanca = new ContaPoupanca();
		ContaEspecial contaEspecial = new ContaEspecial();

		//setar valores na conta
		poupanca.setNomeCliente("Juliano Cardoso dos Santos");
		poupanca.setNumeroContaBancaria("67899");
		poupanca.setSaldoContaBancaria(0);

		//imprimir dados da conta com toString				
		System.out.println(poupanca.toString());

		//teste depositar e sacar valores conta Bancaria
		poupanca.depositarValor(100);
		System.out.println("Deposito contaBancaria: "+poupanca.visualizarSaldo());

		poupanca.sacarValor(70);
		System.out.println("Saldo atual R$: "+poupanca.visualizarSaldo());

		poupanca.sacarValor(100);
		System.out.println("Saldo atual R$: "+poupanca.visualizarSaldo());
		System.out.println("****************************************************************** Fim");

		//setar valores na contaPoupanca
		contaPoupanca.setNomeCliente("Juliano Cardoso dos Santos");
		contaPoupanca.setNumeroContaBancaria("67899");
		contaPoupanca.setSaldoContaBancaria(0);

		System.out.println(contaPoupanca.toString());

		//teste depositar e sacar valores conta Poupança		
		contaPoupanca.depositarValor(200);
		System.out.println("Deposito contaPoupanca: "+contaPoupanca.visualizarSaldo());

		contaPoupanca.sacarValor(100);
		contaPoupanca.sacarValor(100);		
		contaPoupanca.sacarValor(100);

		contaPoupanca.depositarValor(200);
		System.out.println("Deposito contaPoupanca: "+contaPoupanca.visualizarSaldo());

		contaPoupanca.setDiaRecebimento(26);
		System.out.println("taxa de recebiemnto R$: "+contaPoupanca.calcularTaxa(10));

		double saldoAtualizado = contaPoupanca.calcularSaldoPoupanca(10);
		System.out.println("Saldo atualizado R$:"+saldoAtualizado);

		System.out.println("****************************************************************** Fim");

		//setar valores na contaEspecial
		contaEspecial.setNomeCliente("Lucas Alves");
		contaEspecial.setNumeroContaBancaria("222298");
		contaEspecial.setSaldoContaBancaria(200);
		contaEspecial.setValorLimite(300);

		System.out.println(contaEspecial.toString());

		//teste depositar e sacar valores conta Especial

		contaEspecial.depositarValor(100);
		System.out.println(contaEspecial.verificarLimite());

		contaEspecial.sacarValor(400);
		System.out.println(contaEspecial.verificarLimite());

		contaEspecial.sacarValor(300);
		System.out.println(contaEspecial.verificarLimite());

	}

}
