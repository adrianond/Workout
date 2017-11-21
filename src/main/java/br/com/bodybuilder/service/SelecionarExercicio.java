package br.com.bodybuilder.service;

import java.sql.SQLException;
import java.util.Map;

public interface SelecionarExercicio {
	
	public Map<String, String> selecionarExercicioPeito() throws SQLException, ClassNotFoundException;
	
	public Map<String, String> selecionarExercicioBiceps() throws SQLException, ClassNotFoundException;
	
	public Map<String, String> selecionarExercicioOmbro() throws SQLException, ClassNotFoundException;

	public Map<String, String> selecionarExercicioPerna() throws SQLException, ClassNotFoundException;
	
	public Map<String, String> selecionarExercicioCostas() throws SQLException, ClassNotFoundException;
	
	public Map<String, String> selecionarExercicioTriceps() throws SQLException, ClassNotFoundException;
	
}
