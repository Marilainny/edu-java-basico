package edu.mms.javabasico.exemplointerface;
/**
* Classe que implementa o instanceof usando a interface de marcação.
*      
* @author  	 Marilainny Martins da Silva
* @version 	 1.0
* @since     28.04.2022
* @implNote  modelo exemplo.
* 			 
*/
import edu.mms.javabasico.exemplointerface.GrupoFuncionarios.Coodernador;
import edu.mms.javabasico.exemplointerface.GrupoFuncionarios.Gerente;
import edu.mms.javabasico.exemplointerface.GrupoFuncionarios.Operador;

public class FuncionarioApp {
	
	public void calculaSalarioFuncionario(Funcionario funcionario) {
		
		if(funcionario instanceof Gerente) {
			//calculo para gerenete	
			
		}else if (funcionario instanceof Coodernador) {
			//calculo para coodernador
			
		}else if(funcionario instanceof Operador) {
			//calculo para operador
		}
	}

}
