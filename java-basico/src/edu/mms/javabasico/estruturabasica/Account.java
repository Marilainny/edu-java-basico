package edu.mms.javabasico.estruturabasica;

/**
 * A classe Account 
 *  com uma vari�vel de int�ncia balance do tipo double;
 *   e um construtor e m�todo deposit que executa a valida��o;
 *   
 * @author  	 Marilainny Martins da Silva
 * @version 	 1.0
 * @since     16.05.2022
 * @implNote  Livro Java 8 Como programar 10� edi��o.			 
 */
public class Account {

	//vari�vel de inst�ncia
	private String name; 
	private double balance;

	//construtor de Account que recebe dois par�metros
	public Account(String name, double balance) 
	{
		this.name = name; //atribui name a vari�vel name;

		/*
		 * Validar que o balance � maior que 0.0; se n�o for, 
		 * a vari�vel de inst�ncia balance mant�m seu valor inicial padr�o 0.0;
		 * se o saldo for v�lido, atribui a vari�vel de inst�ncia balance;
		 */
		if(balance > 0.0) 
		{
			this.balance = balance;
		}
	}
	/*
	 * M�todo que deposita (adiciona) apenas uma quantia v�lida no saldo.
	 * se depositAmount for v�lido, adiciona o saldo.
	 */
	public void deposit(double depositAmount)
	{
		if(depositAmount > 0.0) 
		{
			balance = balance + depositAmount;
		}
		
	}

	//M�todo retorna o saldo da conta
	public double getBalance() 
	{
		return balance;
	}
	
	//M�todo que define o nome
	public void setNome(String name) 
	{
		this.name = name;
	}
	
	//M�todo que retorna o valor nome ao chamador
	public String getName()
	{
		return name;
	}	

}//fim da classe Account

