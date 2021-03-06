package edu.mms.javabasico.exemplointerface;
/**
* Classe distintos funcionários: Gerente, Coordenador e Operador. Todos implementando Funcionario.
*      
* @author  	 Marilainny Martins da Silva
* @version 	 1.0
* @since     28.04.2022
* @implNote  modelo exemplo.
* 			 
*/
public class GrupoFuncionarios implements Funcionario{
	
	public class Gerente implements Funcionario{
		
		@SuppressWarnings("unused")
		private int id;
		
		@SuppressWarnings("unused")
		private String nome;
		
	}
	
	public class Coodernador implements Funcionario{
		
		@SuppressWarnings("unused")
		private int id;
		
		@SuppressWarnings("unused")
		private String nome;
	}
	
	public class Operador implements Funcionario{
		
		@SuppressWarnings("unused")
		private int id;
		
		@SuppressWarnings("unused")
		private String nome;
	}
	

}
