package edu.mms.javabasico.classe.abstrata;

public class Gato extends Mamifero{
	
	private String ra�a;
	
	
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
	public void emitirSom() {
		SomDoAnimal som = new SomDoAnimal();
		System.out.println(som.MIAR);		
	}

	@Override
	public String toString() {
		return "Gato [ra�a=" + ra�a + "]";
	}
	
}
