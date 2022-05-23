package edu.mms.javabasico.refatoracao;
/*
 * Nesta classe vai ter como argumento a interface.
 */
public class FornoPolimorfico {
	
	//Pizza é uma referência polimorfica.
	public void fabricar(PizzaPolimorfica pizza) {		
		pizza.preparar();
		pizza.assar();
		pizza.cobrar();
	}

}
