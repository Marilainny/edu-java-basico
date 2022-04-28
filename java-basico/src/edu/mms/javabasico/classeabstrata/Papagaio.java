package edu.mms.javabasico.classeabstrata;
/**
* A classe Gato extende um grupo de classes abstrata; herdando certas funcionalidades.
*      
* @author  	 Marilainny Martins da Silva
* @version 	 1.0
* @since     14.04.2022
* @implNote  Release 28.04.2022 
* 			 
*/
public class Papagaio extends Ave{
	
	public void voar(boolean evento) {
		
	}
	
	@Override
	public void voar() {
		System.out.println("Papagaio está voando");			
	}

	@Override
	public void emitirSom() {
		SomDoAnimal som = new SomDoAnimal();
		System.out.println(som.PARLAR);		
	}

}
