package edu.mms.javabasico.classe.abstrata;

public class Cachorro extends Mamifero{
	
	private double tamanho;
	private String raça;
	

	public double getTamanho() {
		return tamanho;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}

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
	public final void emitirSom() {
		SomDoAnimal som = new SomDoAnimal();
		System.out.println(som.LATIR);		
	}

	@Override
	public String toString() {
		return "Cachorro [tamanho=" + tamanho + ", raça=" + raça + "]";
	}
	
}
