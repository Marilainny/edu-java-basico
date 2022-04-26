package edu.mms.javabasico.classe.abstrata;

public class Gato extends Mamifero{
	
	private String raça;
	
	
	public String getRaça() {
		return raça;
	}

	public void setRaça(String raça) {
		this.raça = raça;
	}

	@Override
	public void amamentar() {
		System.out.println("Horário de alimentar o filhote");		
	}

	@Override
	public void emitirSom() {
		SomDoAnimal som = new SomDoAnimal();
		System.out.println(som.MIAR);		
	}

	@Override
	public String toString() {
		return "Gato [raça=" + raça + "]";
	}
	
}
