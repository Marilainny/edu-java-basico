package edu.mms.javabasico.classe.abstrata;

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
