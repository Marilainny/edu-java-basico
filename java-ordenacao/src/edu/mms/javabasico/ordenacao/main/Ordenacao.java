package edu.mms.javabasico.ordenacao.main;

import java.util.Arrays;

import edu.mms.javabasico.ordenacao.RadixSort;

public class Ordenacao {

	public static void main(String[] args) {
		
		    int[] dados = { 121, 432, 564, 23, 1, 45, 788 };
		    System.out.println("Imprimindo os dados antes da ordenação: ");
		    System.out.println(Arrays.toString(dados));
		    
		    int size = dados.length;
		    
		    RadixSort resultado = new RadixSort();
		    
		    resultado.radixSort(dados, size);
		    
		    System.out.println("Imprimindo os dados ordenados: ");
		    System.out.println(Arrays.toString(dados));
		  
	}

	

}
