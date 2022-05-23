package edu.mms.javabasico.polimorfismo;
/*
 * Interface que será implementado nas classes que fazem pagamentos.
 */
public interface TipoDePagamento {
	//método a ser implementodo em todas as classes.
	void pagar(double valorPagamento);
}
