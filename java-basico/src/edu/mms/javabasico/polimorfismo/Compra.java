package edu.mms.javabasico.polimorfismo;

public class Compra {
	
	private Entrega entrega;
	
	//construtor
	public Compra(Entrega entrega) {
		this.entrega = entrega;
	}
	
	//Método 
	public void Comprar(String produto) {
		this.entrega.entregar(produto);
	}

}
