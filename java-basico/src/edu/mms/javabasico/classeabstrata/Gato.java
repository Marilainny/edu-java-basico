package edu.mms.javabasico.classeabstrata;
/**
* A classe Gato extende um grupo de classes abstrata; herdando certas funcionalidades.
*   implementa interfaces implementando seus m�todos.*   
*   
* @author  	 Marilainny Martins da Silva
* @version 	 1.0
* @since     14.04.2022
* @implNote  Release 28.04.2022 
* 			 
*/
public class Gato extends Mamifero implements AnimalDomesticado, AnimalEstimacao{
	
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

	@Override
	public void brincar() {
		System.out.println("Brincar!");		
	}

	@Override
	public void levarPassear() {
		System.out.println("Passear");
		
	}

	@Override
	public void levarVeterinario() {
		System.out.println("Vacinado");
		
	}

	@Override
	public void alimentar() {
		System.out.println("Comer!");
		
	}
	
}
