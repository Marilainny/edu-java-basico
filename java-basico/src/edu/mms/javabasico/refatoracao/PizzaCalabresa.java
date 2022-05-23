package edu.mms.javabasico.refatoracao;
/*
 * Classe sem o poliformismo 
 */
public class PizzaCalabresa {
	
	public void preparar() {
		System.out.println("molho, queijo, cebola e tomate");
	}
	
	public void assar() {
		System.out.println("15 minutos");
		
	}
	
	public void cobrar() {
		System.out.println("R$: 12,00 reais");
		
	}

}
