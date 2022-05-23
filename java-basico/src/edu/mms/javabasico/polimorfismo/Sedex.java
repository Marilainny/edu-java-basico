package edu.mms.javabasico.polimorfismo;

public class Sedex implements Entrega {

	@Override
	public void entregar(String pacote) {
		System.out.println("Entrega via SEDEX "+ pacote +" 24 horas.");
	}

}
