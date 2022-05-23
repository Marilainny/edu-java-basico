package edu.mms.javabasico.refatoracao;

public class Forno {
	
	public void fabricar(PizzaCalabresa calabresa) {
		calabresa.preparar();
		calabresa.assar();
		calabresa.cobrar();
	}
	
	/*
	 * Repeti��o de c�digo para criar uma nova pizza,
	 * sem padrao de m�todos.
	 * dificil manuten��o
	 * introdu��o de bug no sistema
	 */
	public void fabricar(PizzaNapolitana napolitana) {
		napolitana.prepara��o();
		napolitana.assamento();
		napolitana.valor();
	}
	
	public void fabricar(PizzaPortuguesa portuguesa) {
		portuguesa.prepara��o();
		portuguesa.assamento();
		portuguesa.valor();
	}

}
