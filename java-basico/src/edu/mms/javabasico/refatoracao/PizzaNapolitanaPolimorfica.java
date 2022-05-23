package edu.mms.javabasico.refatoracao;
/*
 * Classe implementa a interface e seus métodos.
 */
public class PizzaNapolitanaPolimorfica implements PizzaPolimorfica {

	@Override
	public void preparar() {
		System.out.println("molho, presunto, queijo, tomate e oregano.");

	}

	@Override
	public void assar() {
		System.out.println("19 minutos");

	}

	@Override
	public void cobrar() {
		System.out.println("R$: 25,00 reais");

	}

}
