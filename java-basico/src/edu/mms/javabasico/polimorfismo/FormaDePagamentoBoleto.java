package edu.mms.javabasico.polimorfismo;
/*
 * Classe que implementa a interface TipoDePagamento
 * 
 * @author Marilainny Martins da Silva
 * @nota Modelo polimorfismo estudo de caso.
 * @date 22/05/22
 */
public class FormaDePagamentoBoleto implements TipoDePagamento {

	public FormaDePagamentoBoleto() {
		
	}

	@Override
	public void pagar(double valorPagamento) {
		double taxa = valorPagamento * 0.2;
		System.out.println("Pagamento do valorPagamento + taxa de boleto");
	}

}
