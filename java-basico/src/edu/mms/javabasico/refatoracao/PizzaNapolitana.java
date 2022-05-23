package edu.mms.javabasico.refatoracao;

public class PizzaNapolitana {
	
	/*
	 * Aqui temos repetição de código,
	 * falta padrão nomenclatura dos métodos: PizzaCalabresa = preparar();
	 */
	public void preparação() {
		System.out.println("molho, presunto, queijo, tomate e oregano.");
	}
	
	public void assamento() {
		System.out.println("19 minutos");
	}
	
	public void valor() {
		System.out.println("R$: 25,00 reais");
	}

}
