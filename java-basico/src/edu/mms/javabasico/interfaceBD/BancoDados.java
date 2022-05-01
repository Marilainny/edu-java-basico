package edu.mms.javabasico.interfaceBD;
/**
* Interface com assinaturas para serem implementados em outras classes.
*  as interfaces não tem corpo apenas assinatura.
*  extends todas as demais classes, que serão implementadas todos os métodos herdados,
*  em conjunto ao implementar esta interface.
*      
* @author  	 Marilainny Martins da Silva
* @version 	 1.0
* @since     01.05.2022
* @implNote  modelo exemplo.* 			 
*/

public interface BancoDados extends SqlDCL, sqlDML, SqlDDL {
	
	void abrirConexao();
	void fecharConexao();

}
