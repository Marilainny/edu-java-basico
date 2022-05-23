package edu.mms.javabasico.refatoracao;
/*
 * Classe implementa a interface e seus m�todos.
 */
public class PizzaPortuguesaPolimorfica implements PizzaPolimorfica {

	@Override
	public void preparar() {
		System.out.println("molho, cebola, piment�o, presunto, queijo, tomate e oregano.");

	}

	@Override
	public void assar() {
		System.out.println("30 minutos");

	}

	@Override
	public void cobrar() {
		System.out.println("R$: 30,00 reais");

	}

}
