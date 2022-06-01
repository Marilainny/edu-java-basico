package edu.mms.javabasico.exception;

import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {

		try {

			System.out.println("Antes");
			int[] vetor = new int[4];

			vetor[4] = 1; //vai ocorrer uma exception

			System.out.println("Esse texto n�o ser� impresso.");

			//captura a exce��o
		}catch(ArrayIndexOutOfBoundsException exception){
			//tratamento da exce��o.
			System.out.println("Exce��o ao acessar um �ndice do vetor que n�o exite");
		}	

		System.out.println("Esse texto ser� impresso ap�s a exception.");


		//M�ltiplas exce��o
		int[] numeros = {4,8, 16, 32, 64, 128};
		int[] denominador = {2, 0, 4, 8, 0};

		//exemplo didatico
		for(int i=0; i < numeros.length; i++ ) {

			try {
				System.out.println(numeros[i] + " / " +denominador[i]+ " = "+(numeros[i] / denominador[i]));
			} catch (Exception e) {
				System.out.println("Erro ao dividir por zero");
			}
			catch(Throwable exc) {
				System.out.println("Aconteceu um erro!");
			}finally {
				System.out.println("Esta linha � impressa sempre ap�s o try ou catch.");
			}
		}

		//exemplo pr�tico � amarzenado em Logs de erro.
		for(int i=0; i < numeros.length; i++ ) {

			try {
				System.out.println(numeros[i] + " / " +denominador[i]+ " = "+(numeros[i] / denominador[i]));
			} catch (Exception e) {
				System.out.println(e.getMessage());
				e.printStackTrace();				
			}

		}
		
		System.out.println("Entre com um n�mero!");
		try {
			double numero = lerNumero();
			System.out.println("N�mero digitado: "+numero);
		} catch (Exception e) {
			System.out.println("Entrada Inv�lida");
			e.printStackTrace();
		}

	}
	// usar o throws Exception na assinatura do m�todo
	public static double lerNumero() throws Exception{
		
		Scanner scan = new Scanner(System.in);
		double num = scan.nextDouble();
		return num;
		
	}
}
