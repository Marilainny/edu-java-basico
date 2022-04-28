package edu.mms.javabasico.exemplointerface;
/**
* Interface com assinaturas para serem implementados em outras classes.
*  as interfaces não tem corpo apenas assinatura.
*      
* @author  	 Marilainny Martins da Silva
* @version 	 1.0
* @since     28.04.2022
* @implNote  modelo exemplos.
* 			 
*/

public class FuncionarioDAO implements BasicoDAO{

	@Override
	public void salvar(Object bean) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizar(Object bean) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletar(Object bean) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	//Método a parte criado na própria classe
	public void calcularSalario(){

	}

}
