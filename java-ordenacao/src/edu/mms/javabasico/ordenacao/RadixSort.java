package edu.mms.javabasico.ordenacao;

/**
* Classe RadixSort ordenação 
* Usando contagem de classificação 
* para classificar elementos com base no lugar da unidade;
* 
* @author  	 Marilainny Martins da Silva
* @version 	 1.0
* @since     07.05.2022
* @implNote  Radix sort Java implementation
* {@link https://www.programiz.com/dsa/radix-sort} 			 
*/

public class RadixSort {

	/*
	 * Usando contagem de classificação,
	 *  para classificar os elementos com base em lugares significativos.
	 */
	void countingSort(int array[], int size, int localDoValor) {
		int[] output = new int[size + 1];
		int maximo = array[0];

		for (int i = 1; i < size; i++) {
			if (array[i] > maximo)
				maximo = array[i];
		}
		int[] count = new int[maximo + 1];

		for (int i = 0; i < maximo; ++i)
			count[i] = 0;

		// Calcular contagem de elementos
		for (int i = 0; i < size; i++)
			count[(array[i] / localDoValor) % 10]++;

		// Calcular contagem cumulativa
		for (int i = 1; i < 10; i++)
			count[i] += count[i - 1];

		// Ordenar os elementos
		for (int i = size - 1; i >= 0; i--) {
			output[count[(array[i] / localDoValor) % 10] - 1] = array[i];
			count[(array[i] / localDoValor) % 10]--;
		}

		for (int i = 0; i < size; i++)
			array[i] = output[i];
	}

	// Função para obter o maior elemento de um array
	int getMax(int array[], int n) {
		int maximo = array[0];
		for (int i = 1; i < n; i++)
			if (array[i] > maximo)
				maximo = array[i];
		return maximo;
	}

	// Função principal para implementar radix sort
	public void radixSort(int array[], int size) {
		// Obter elemento máximo
		int maximo = getMax(array, size);

		// Apply counting sort to sort elements based on place value.
		for (int place = 1; maximo / place > 0; place *= 10)
			countingSort(array, size, place);
	}

}

