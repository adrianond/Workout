package br.com.bodybuilder.service;

import java.util.List;

import br.com.bodybuilder.model.Aluno;
import br.com.bodybuilder.model.Exercicios;

public interface BodyBuilderInterfaceBD {
	
	//public List<?> consultarTreino(AlunoEjb alunoEjb);
    
	/**
	 * Inseri novo Aluno na base
	 * @param aluno
	 * @return
	 */
    public boolean inserirNovoAluno(Aluno aluno);  
    
    
    
    /**
     * 
     * @param musculo
     * @param exercicio
     * @return
     */
	//boolean IncluirExercicioModel(String musculo, String exercicio);
    
	/**
	 * 
	 * @param musculo
	 * @param exercicio
	 * @return
	 */
	Exercicios obterExercicioIncluido(String musculo, String exercicio);
}
