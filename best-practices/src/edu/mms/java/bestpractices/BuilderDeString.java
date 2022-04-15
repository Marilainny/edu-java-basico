package edu.mms.java.bestpractices;

public class BuilderDeString {
	
	public static void main(String[] args) {
		
		var nome = "Marilainny";
		var sobrenome = "Martins";
		var alfabeto = "";
		
		final var insertNome = "";
		final var nomeCompleto = nome + sobrenome;
		
		String[] arrayLetras = {"J", "A", "V", "A"};
		
		
		//usando a classe String
		System.out.println("Nome do cliente: "+nome);
		System.out.println("Nome completo do cliente: "+nomeCompleto);
		
		//formantando a String
		final var mensagem = String.format("O cliente %s possui o sobrenome %s", nome, sobrenome );
		System.out.println("Mensagem:"+mensagem);
		System.out.println(String.format("N�mero %.2f ",  1.2375d));
		
		//vetor de String
		for(String letra : arrayLetras) {
			alfabeto += letra;
		}
		System.out.println("Alfabeto String: "+alfabeto);
		
				
		//usando a Classe StringBuilder
		final var builder = new StringBuilder(nome);
		System.out.println(builder.append(" Martins"));
				
		final var reverse = builder.reverse();
		System.out.println(reverse);
		
		StringBuilder sb = new StringBuilder();
		
		for(String letra : arrayLetras) {
			sb.append(letra);
		}
		
		//op��o 1
		alfabeto = sb.toString();
		System.out.println("Alfabeto StringBuilder: "+alfabeto);
		
		//op��o 2
		alfabeto = new String(sb);
		System.out.println("Alfabeto StringBuilder: "+alfabeto);
		
				
		final var insert = reverse.insert(0,"#").insert(reverse.length(), "#");
		System.out.println(insert);
		
		StringBuilder str = new StringBuilder("Bem-Vindo ao JAVA");
		System.out.println("String: = "+ str.toString());
		
		StringBuilder replace = str.replace(0, 13, "Welcome to ");
		System.out.println("Altera��o String: = "+ replace.toString());
		
		
		// O StringBuffer � Thread-safe quando h� multiplas thread; 
		StringBuffer sf = new StringBuffer();
		for(String letra : arrayLetras) {
			sf.append(letra);
		}
		
		alfabeto = new String(sf);
		System.out.println("Alfabeto StringBuffer: "+alfabeto);
	}

}
