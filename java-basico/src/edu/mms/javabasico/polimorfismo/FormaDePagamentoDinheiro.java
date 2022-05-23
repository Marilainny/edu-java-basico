package edu.mms.javabasico.polimorfismo;
/*
 * Classe que implementa a interface TipoDePagamento
 * 
 * @author Marilainny Martins da Silva
 * @nota Modelo polimorfismo estudo de caso.
 * @date: 22/05/22
 */
public class FormaDePagamentoDinheiro implements TipoDePagamento {

	public FormaDePagamentoDinheiro() {
		
	}

	@Override
	public void pagar(double valorPagamento) {
		System.out.println("Pagamento do valor em Dinheiro");
	}

}
