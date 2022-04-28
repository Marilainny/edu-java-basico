package edu.mms.javabasico.classeabstrata;
/**
* A classe Cavalo extende um grupo de classes abstrata; herdando certas funcionalidades.
*   implementa interface e seus m�todos.
*   
*   
* @author  	 Marilainny Martins da Silva
* @version 	 1.0
* @since     14.04.2022
* @implNote  implementa��o. 
* 			 
*/
public class Cavalo extends Mamifero implements AnimalDomesticado {

	@Override
	public void amamentar() {
		System.out.println("Hor�rio de alimentar o filhote");	
	}

	@Override
	public void emitirSom() {
		SomDoAnimal som = new SomDoAnimal();
		System.out.println(som.RELINCHAR);
	}

	@Override
	public void levarVeterinario() {
		System.out.println("Vacinado.");
		
	}

	@Override
	public void alimentar() {
		System.out.println("Dar comida.");		
	}
	
	

}
