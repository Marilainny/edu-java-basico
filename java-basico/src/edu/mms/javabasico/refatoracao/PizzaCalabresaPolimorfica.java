package edu.mms.javabasico.refatoracao;
/*
 * Classe implementa a interface e seus métodos.
 */
public class PizzaCalabresaPolimorfica implements PizzaPolimorfica {

	@Override
	public void preparar() {		
		System.out.println("molho, queijo, cebola e tomate");
		
	}

	@Override
	public void assar() {
		System.out.println("15 minutos");

	}

	@Override
	public void cobrar() {
		System.out.println("R$: 12,00 reais");

	}

}
