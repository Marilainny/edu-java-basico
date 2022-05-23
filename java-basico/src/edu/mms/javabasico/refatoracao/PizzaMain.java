package edu.mms.javabasico.refatoracao;

public class PizzaMain {

	public static void main(String[] args) {
		
		//estrutura sem polimorfismo
		Forno forno = new Forno();
		PizzaCalabresa calabresa = new PizzaCalabresa();
		forno.fabricar(calabresa);
		
		PizzaNapolitana napolitana = new PizzaNapolitana();
		forno.fabricar(napolitana);
		
		PizzaPortuguesa portuguesa = new PizzaPortuguesa();
		forno.fabricar(portuguesa);
		
		//estrutura polimorfica
		FornoPolimorfico fornoPolimorfico = new FornoPolimorfico();
		
		PizzaCalabresaPolimorfica calabrezaPolimorfica = new PizzaCalabresaPolimorfica();
		PizzaNapolitanaPolimorfica napolitanaPolimorfica = new PizzaNapolitanaPolimorfica();
		PizzaPortuguesaPolimorfica portuguesaPolimorfica = new PizzaPortuguesaPolimorfica();
		
		fornoPolimorfico.fabricar(calabrezaPolimorfica);
		fornoPolimorfico.fabricar(napolitanaPolimorfica);
		fornoPolimorfico.fabricar(portuguesaPolimorfica);
		

	}

}
