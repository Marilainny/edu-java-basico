package edu.mms.javabasico.polimorfismo;

public class Pac implements Entrega {

	@Override
	public void entregar(String pacote) {
		System.out.println("Entrega via PAC "+ pacote +" 15 dias de prazo.");
	}

}
