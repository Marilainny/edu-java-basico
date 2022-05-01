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
public interface SqlDCL {
	
	void grant(String access);
	void remoke(String access);

}
