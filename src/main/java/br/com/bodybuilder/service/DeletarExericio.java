package br.com.bodybuilder.service;

import java.sql.SQLException;

public interface DeletarExericio {
	
	public void deletarExercicioPeito(String novoExercicio) throws SQLException, ClassNotFoundException;
	
	public void deletarExercicioBiceps(String novoExercicio) throws SQLException, ClassNotFoundException;
	
	public void deletarExercicioOmbro(String novoExercicio) throws SQLException, ClassNotFoundException;

	public void deletarExercicioPerna(String novoExercicio) throws SQLException, ClassNotFoundException;
	
	public void deletarExercicioCostas(String novoExercicio) throws SQLException, ClassNotFoundException;
	
	public void deletarExercicioTriceps(String novoExercicio) throws SQLException, ClassNotFoundException;
	
}
