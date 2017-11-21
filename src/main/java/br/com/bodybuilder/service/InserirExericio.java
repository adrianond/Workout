package br.com.bodybuilder.service;

import java.sql.SQLException;

import br.com.bodybuilder.model.Exercicios;

public interface InserirExericio {
	
	public void inserirExercicioPeito(Exercicios novoExercicio) throws ClassNotFoundException, SQLException;
	
	public void inserirExercicioBiceps(Exercicios novoExercicio) throws SQLException, ClassNotFoundException;
	
	public void inserirExercicioOmbro(Exercicios novoExercicio) throws SQLException, ClassNotFoundException;

	public void inserirExercicioPerna(Exercicios novoExercicio) throws SQLException, ClassNotFoundException;
	
	public void inserirExercicioCostas(Exercicios novoExercicio) throws SQLException, ClassNotFoundException;
	
	public void inserirExercicioTriceps(Exercicios novoExercicio) throws SQLException, ClassNotFoundException;
	
}
