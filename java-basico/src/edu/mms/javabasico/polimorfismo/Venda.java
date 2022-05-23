package edu.mms.javabasico.polimorfismo;
/*
 * Classe que usa a estrutura do polimorfismo.
 * TipoDePagamento, e através desta terá acesso as FormaDePagamentos (boleto, cartão, dinheiro);
 * 
 * @author Marilainny Martins da Silva
 * @nota Modelo polimorfismo estudo de caso.
 * @date 22/05/22
 */
public class Venda {
	
	public void vender(TipoDePagamento formaDePagamento, double valorPagamento){
		
		formaDePagamento.pagar(valorPagamento);		
	}

}
