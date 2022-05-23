package edu.mms.javabasico.refatoracao;

public class PizzaPortuguesa {
	
	/*
	 * Aqui temos repetição de código,
	 * falta padrão nomenclatura dos métodos: PizzaCalabresa = preparar();
	 */
	public void preparação() {
		System.out.println("molho, cebola, pimentão, presunto, queijo, tomate e oregano.");
	}
	
	public void assamento() {
		System.out.println("30 minutos");
	}
	
	public void valor() {
		System.out.println("R$: 30,00 reais");
	}

}
