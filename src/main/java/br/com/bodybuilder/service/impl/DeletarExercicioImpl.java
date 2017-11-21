package br.com.bodybuilder.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.bodybuilder.database.DaoConection;
import br.com.bodybuilder.service.DeletarExericio;

public class DeletarExercicioImpl extends DaoConection implements DeletarExericio {
	
	private static final Logger logger = Logger.getLogger(DeletarExercicioImpl.class.getName());

	@Override
	public void deletarExercicioPeito(String exercicio) throws SQLException, ClassNotFoundException {
		try{
			Connection conn = DaoConection.getConnection();
			String sql = "DELETE FROM Exercicio_Peito WHERE Exercicio=? ";
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1,exercicio);
			statement.executeUpdate();
			statement.close();
			DaoConection.close(conn);
		}catch (SQLException e) {
		logger.log(Level.SEVERE, "ERRO EM: DeletarExercicioImpl.deletarExercicioPeito()", e.getMessage());
		throw e;
		} catch (ClassNotFoundException e) {
		logger.log(Level.SEVERE, "ERRO EM: DeletarExercicioImpl.deletarExercicioPeito()", e.getMessage());
		throw e;
		}
	}
	
	@Override
	public void deletarExercicioBiceps(String exercicio) throws SQLException, ClassNotFoundException {
		try{
			Connection conn = DaoConection.getConnection();
			String sql = "DELETE FROM Exercicio_Biceps WHERE Exercicio=? ";
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1,exercicio);
			statement.executeUpdate();
		    statement.close();
		    conn.close();
		}catch (SQLException e) {
		logger.log(Level.SEVERE, "ERRO EM: DeletarExercicioImpl.deletarExercicioBiceps()", e.getMessage());
		throw e;
		} catch (ClassNotFoundException e) {
		logger.log(Level.SEVERE, "ERRO EM: DeletarExercicioImpl.deletarExercicioBiceps()", e.getMessage());
		throw e;
		}
	}
	
	@Override
	public void deletarExercicioOmbro(String exercicio) throws SQLException, ClassNotFoundException {
		try{
			Connection conn = DaoConection.getConnection();
			String sql = "DELETE FROM Exercicio_Ombro WHERE Exercicio=? ";
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1,exercicio);
			statement.executeUpdate();
			statement.close();
			conn.close();
		}catch (SQLException e) {
		logger.log(Level.SEVERE, "ERRO EM: DeletarExercicioImpl.deletarExercicioOmbro()", e.getMessage());
		throw e;
		} catch (ClassNotFoundException e) {
		logger.log(Level.SEVERE, "ERRO EM: DeletarExercicioImpl.deletarExercicioOmbro()", e.getMessage());
		throw e;
		}
	}
	
	@Override
	public void deletarExercicioPerna(String exercicio) throws SQLException, ClassNotFoundException {
		try{
			Connection conn = DaoConection.getConnection();
			String sql = "DELETE FROM Exercicio_Perna WHERE Exercicio=? ";
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1,exercicio);
			statement.executeUpdate();
		    statement.close();
		    statement.close();
		    conn.close();
		}catch (SQLException e) {
		logger.log(Level.SEVERE, "ERRO EM: DeletarExercicioImpl.deletarExercicioPerna()", e.getMessage());
		throw e;
		} catch (ClassNotFoundException e) {
		logger.log(Level.SEVERE, "ERRO EM: DeletarExercicioImpl.deletarExercicioPerna()", e.getMessage());
		throw e;
		}
	}
	
	@Override
	public void deletarExercicioCostas(String exercicio) throws SQLException, ClassNotFoundException {
		try{
			Connection conn = DaoConection.getConnection();
			String sql = "DELETE FROM Exercicio_Costas WHERE Exercicio=? ";
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1,exercicio);
			statement.executeUpdate();
		    statement.close();
		    conn.close();
		}catch (SQLException e) {
		logger.log(Level.SEVERE, "ERRO EM: DeletarExercicioImpl.deletarExercicioCostas()", e.getMessage());
		throw e;
		} catch (ClassNotFoundException e) {
		logger.log(Level.SEVERE, "ERRO EM: DeletarExercicioImpl.deletarExercicioCostas()", e.getMessage());
	    throw e;
		}
	}
	
	@Override
	public void deletarExercicioTriceps(String exercicio) throws SQLException, ClassNotFoundException {
		try{
			Connection conn = DaoConection.getConnection();
			String sql = "DELETE FROM Exercicio_Triceps WHERE Exercicio=? ";
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1,exercicio);
			statement.executeUpdate();
		    statement.close();
		    statement.close();
		    conn.close();
		}catch (SQLException e) {
		logger.log(Level.SEVERE, "ERRO EM: DeletarExercicioImpl.deletarExercicioTriceps()", e.getMessage());
		throw e;
		} catch (ClassNotFoundException e) {
		logger.log(Level.SEVERE, "ERRO EM: DeletarExercicioImpl.deletarExercicioTriceps()", e.getMessage());
		throw e;
		}
	}
    
}
