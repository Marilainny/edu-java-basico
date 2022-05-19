package edu.mms.javabasico.estruturabasica;

/**
 * A classe Account 
 *  com uma variável de intância balance do tipo double;
 *   e um construtor e método deposit que executa a validação;
 *   
 * @author  	 Marilainny Martins da Silva
 * @version 	 1.0
 * @since     16.05.2022
 * @implNote  Livro Java 8 Como programar 10ª edição.			 
 */
public class Account {

	//variável de instância
	private String name; 
	private double balance;

	//construtor de Account que recebe dois parâmetros
	public Account(String name, double balance) 
	{
		this.name = name; //atribui name a variável name;

		/*
		 * Validar que o balance é maior que 0.0; se não for, 
		 * a variável de instância balance mantém seu valor inicial padrão 0.0;
		 * se o saldo for válido, atribui a variável de instância balance;
		 */
		if(balance > 0.0) 
		{
			this.balance = balance;
		}
	}
	/*
	 * Método que deposita (adiciona) apenas uma quantia válida no saldo.
	 * se depositAmount for válido, adiciona o saldo.
	 */
	public void deposit(double depositAmount)
	{
		if(depositAmount > 0.0) 
		{
			balance = balance + depositAmount;
		}
		
	}

	//Método retorna o saldo da conta
	public double getBalance() 
	{
		return balance;
	}
	
	//Método que define o nome
	public void setNome(String name) 
	{
		this.name = name;
	}
	
	//Método que retorna o valor nome ao chamador
	public String getName()
	{
		return name;
	}	

}//fim da classe Account

