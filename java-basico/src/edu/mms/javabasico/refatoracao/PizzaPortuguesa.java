package edu.mms.javabasico.refatoracao;

public class PizzaPortuguesa {
	
	/*
	 * Aqui temos repeti��o de c�digo,
	 * falta padr�o nomenclatura dos m�todos: PizzaCalabresa = preparar();
	 */
	public void prepara��o() {
		System.out.println("molho, cebola, piment�o, presunto, queijo, tomate e oregano.");
	}
	
	public void assamento() {
		System.out.println("30 minutos");
	}
	
	public void valor() {
		System.out.println("R$: 30,00 reais");
	}

}
