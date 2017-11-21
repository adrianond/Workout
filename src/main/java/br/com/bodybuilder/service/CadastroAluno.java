package br.com.bodybuilder.service;

import java.sql.SQLException;
import java.util.List;

import br.com.bodybuilder.model.Aluno;

public interface CadastroAluno {

	public void inserirDadosAluno(Aluno aluno) throws ClassNotFoundException, SQLException;
	
	public List<Aluno> obterDadosAluno(Aluno aluno) throws ClassNotFoundException, SQLException;
	
}
