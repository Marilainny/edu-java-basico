package edu.mms.javabasico.polimorfismo;
/*
 * Classe que implementa a interface TipoDePagamento
 *
 * @author Marilainny Martins da Silva
 * @nota Modelo polimorfismo estudo de caso.
 * @date: 22/05/22
 */
public class FormaDePagamentoCartao implements TipoDePagamento {

	public FormaDePagamentoCartao() {
		
	}

	@Override
	public void pagar(double valorPagamento) {
		double taxa = valorPagamento * 0.32;
		System.out.println("Pagamento do valorPagamento + taxa cartão");
	}

}
