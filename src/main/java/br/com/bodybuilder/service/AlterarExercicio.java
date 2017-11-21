package br.com.bodybuilder.service;

import java.sql.SQLException;

public interface AlterarExercicio {
	
	public void alterarExercicioPeito(String exercicio, String novoExercicio) throws SQLException, ClassNotFoundException;
	
	public void alterarExercicioBiceps(String exercicio, String novoExercicio) throws SQLException, ClassNotFoundException;
	
	public void alterarExercicioCostas(String exercicio, String novoExercicio) throws SQLException, ClassNotFoundException;
	
	public void alterarExercicioTriceps(String exercicio, String novoExercicio) throws SQLException, ClassNotFoundException;
	
	public void alterarExercicioOmbro(String exercicio, String novoExercicio) throws SQLException, ClassNotFoundException;
	
	public void alterarExercicioPerna(String exercicio, String novoExercicio) throws SQLException, ClassNotFoundException;

}
