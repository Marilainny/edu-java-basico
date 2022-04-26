package edu.mms.javabasico.classe.abstrata;

public class Cachorro extends Mamifero{
	
	private double tamanho;
	private String ra�a;
	

	public double getTamanho() {
		return tamanho;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}

	public String getRa�a() {
		return ra�a;
	}

	public void setRa�a(String ra�a) {
		this.ra�a = ra�a;
	}

	@Override
	public void amamentar() {
		System.out.println("Hor�rio de alimentar o filhote");
		
	}

	@Override
	public final void emitirSom() {
		SomDoAnimal som = new SomDoAnimal();
		System.out.println(som.LATIR);		
	}

	@Override
	public String toString() {
		return "Cachorro [tamanho=" + tamanho + ", ra�a=" + ra�a + "]";
	}
	
}
