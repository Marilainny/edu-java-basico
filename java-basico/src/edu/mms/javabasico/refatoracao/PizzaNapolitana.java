package edu.mms.javabasico.refatoracao;

public class PizzaNapolitana {
	
	/*
	 * Aqui temos repeti��o de c�digo,
	 * falta padr�o nomenclatura dos m�todos: PizzaCalabresa = preparar();
	 */
	public void prepara��o() {
		System.out.println("molho, presunto, queijo, tomate e oregano.");
	}
	
	public void assamento() {
		System.out.println("19 minutos");
	}
	
	public void valor() {
		System.out.println("R$: 25,00 reais");
	}

}
