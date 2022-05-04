package edu.mms.javabasico.excecao.main;

public class ExceptionTest {

	public static void main(String[] args) {

		try {

			System.out.println("Antes");
			int[] vetor = new int[4];

			vetor[4] = 1; //vai ocorrer uma exception

			System.out.println("Esse texto não será impresso.");

			//captura a exceção
		}catch(ArrayIndexOutOfBoundsException exception){
			//tratamento da exceção.
			System.out.println("Exceção ao acessar um índice do vetor que não exite");
		}	

		System.out.println("Esse texto será impresso após a exception.");


		//Múltiplas exceção
		int[] numeros = {4,8, 16, 32, 64, 128};
		int[] denominador = {2, 0, 4, 8, 0};

		for(int i=0; i < numeros.length; i++ ) {

			try {
				System.out.println(numeros[i] + " / " +denominador[i]+ " = "+(numeros[i] / denominador[i]));
			} catch (Exception e) {
				System.out.println("Erro ao dividir por zero");
			}
			catch(Throwable exc) {
				System.out.println("Aconteceu um erro!");
			}finally {
				System.out.println("Esta linha é impressa sempre após o try ou catch.");
			}
		}

	}

}
