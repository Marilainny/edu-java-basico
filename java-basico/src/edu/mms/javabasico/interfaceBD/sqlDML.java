package edu.mms.javabasico.interfaceBD;
/**
* Interface com assinaturas para serem implementados em outras classes.
*  as interfaces não tem corpo apenas assinatura.
*      
* @author  	 Marilainny Martins da Silva
* @version 	 1.0
* @since     01.05.2022
* @implNote  modelo exemplo.* 			 
*/
public interface sqlDML {
	
	void insert(String query);
	void update(String query);
	void delete(String query);
	void select(String query);

}
