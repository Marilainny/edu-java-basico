package edu.mms.javabasico.exemplointerface;

/**
* Interface com assinaturas para serem implementados em outras classes.
*  as interfaces não tem corpo apenas assinatura.
*      
* @author  	 Marilainny Martins da Silva
* @version 	 1.0
* @since     28.04.2022
* @implNote  modelo exemplo.
* 			 
*/
public interface BasicoDAO {

	public void salvar(Object bean);
	public void atualizar(Object bean);
	public void deletar(Object bean);
	public Object getById(int id);
		
}
