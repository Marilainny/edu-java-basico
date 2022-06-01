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
		
		//estrutura Lambda
		FornoLambda pizzaLambda = new FornoLambda();
		pizzaLambda.assar(() -> System.out.println("molho, presunto, queijo, tomate e oregano."));		
		pizzaLambda.assar(() -> System.out.println("molho tradicional, frango, queijo, tomate e oregano."));
		
		pizzaLambda.assar(() -> {
			System.out.println("molho tradicional, frango, queijo, tomate e oregano.");
			System.out.println("borda extra.");			
		});

	}

}
