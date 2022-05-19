package edu.mms.javabasico.testeestrutura;

import java.util.Scanner;

import edu.mms.javabasico.estruturabasica.Account;

public class TesteEstrutura {

	public static void main(String[] args) {

		//criar o objeto da classe Account
		Account account1 = new Account("Jane Green", 50.00);
		Account account2 = new Account("Jhon Blue", -7.53);

		//exibir saldo inicial de cada objeto
		System.out.printf("%s balance: $%.2f %n",
				account1.getName(),
				account1.getBalance());

		System.out.printf("%s balance: $%.2f %n",
				account2.getName(),
				account2.getBalance());

		//Criar um objeto Scanner para obter entrada a partir da janela de comando.
		Scanner input = new Scanner(System.in);

		//fazer deposito na conta 1
		System.out.println("Enter deposit amount for account1: "); //prompt
		double depositAmount = input.nextDouble(); //obter a entrada do usuário.

		//fazer deposito na conta 2		
		System.out.println("Enter deposit amount for account2: "); //prompt
		double depositAmount2 = input.nextDouble(); //obter a entrada do usuário.

		//imprimir mensagem
		System.out.printf("%nadding %.2f to account1 balance%n%n",
				depositAmount);

		System.out.printf("%nadding %.2f to account2 balance%n%n",
				depositAmount2);

		//adiciona o saldo de account
		account1.deposit(depositAmount);
		account2.deposit(depositAmount2);

		//exibe os saldos
		System.out.printf("%s balance: $%.2f %n",
				account1.getName(), account1.getBalance());

		System.out.printf("%s balance: $%.2f %n",
				account2.getName(), account2.getBalance());

	}

}
