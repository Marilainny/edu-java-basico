package edu.mms.javabasico.refatoracao;

public class Forno {
	
	public void fabricar(PizzaCalabresa calabresa) {
		calabresa.preparar();
		calabresa.assar();
		calabresa.cobrar();
	}
	
	/*
	 * Repetição de código para criar uma nova pizza,
	 * sem padrao de métodos.
	 * dificil manutenção
	 * introdução de bug no sistema
	 */
	public void fabricar(PizzaNapolitana napolitana) {
		napolitana.preparação();
		napolitana.assamento();
		napolitana.valor();
	}
	
	public void fabricar(PizzaPortuguesa portuguesa) {
		portuguesa.preparação();
		portuguesa.assamento();
		portuguesa.valor();
	}

}
