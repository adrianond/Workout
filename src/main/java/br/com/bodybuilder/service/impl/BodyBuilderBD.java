package br.com.bodybuilder.service.impl;

import br.com.bodybuilder.database.DaoConection;
import br.com.bodybuilder.model.Aluno;
import br.com.bodybuilder.model.Exercicios;
import br.com.bodybuilder.service.BodyBuilderInterfaceBD;

public class BodyBuilderBD extends DaoConection implements BodyBuilderInterfaceBD {
	
	
    
    /**
     * Default constructor. 
     */
    public BodyBuilderBD() {
    	
       
    }

	  
	
     /**
	 * Retorna lista com a série de treino do aluno
	 */
	
	//public List<?> consultarTreino(AlunoEjb alunoEjb) {
		/** Variavel connect **//*
		Connection connect = null;
		*//** Variavel de conex�o **//*
		ObterConexaoDB conexao = new ObterConexaoDB();
		
		
		connect = conexao.getConnection();

		if (!alunoEjb.getNome().equals(CosntantesUtils.STRING_VAZIA)) {
			// select atrav�s do nome + data - Sen�o informar nome completo e houver mais de um nome igual, abre uma grid para selecionar o nome do aluno
		} else if (!alunoEjb.getCPF().equals(CosntantesUtils.STRING_VAZIA)) {
			// select atrav�s do cpf
		} else {
			// select atrav�s do numero de matricula + data
		}
		try {
			connect.close();
		} catch (SQLException e) {
			System.out.println(e);
			e.printStackTrace();
		}*/
		
		//return null;
	//}


    /**
     * Aluno aluno
     */
	@Override
	public boolean inserirNovoAluno(Aluno aluno) {
		return false;
		
	}
	
	
	/**
     * Aluno aluno
     */
	@Override
	public Exercicios obterExercicioIncluido(String musculo, String exercicio) {
		return null;
		
	}
	
	


	
}
