package br.com.bodybuilder.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import br.com.bodybuilder.database.DaoConection;
import br.com.bodybuilder.service.AlterarExercicio;

public class AlterarExercicioImpl extends DaoConection implements AlterarExercicio {

	private static final Logger logger = Logger.getLogger(AlterarExercicioImpl.class.getName());
	
    
	@Override
	public void alterarExercicioPeito(String exercicio, String novoExercicio) throws SQLException, ClassNotFoundException {
		try {
			 Connection conn = DaoConection.getConnection();
			 String sql = "UPDATE Exercicio_Peito set Exercicio=? where Exercicio=?";
			 PreparedStatement statement = conn.prepareStatement(sql);
			 statement.setString(1,exercicio);
			 statement.setString(2,novoExercicio);
			 statement.executeUpdate();
			 statement.close();
			 conn.close();
		} catch (SQLException e) {
		   logger.log(Level.SEVERE, "ERRO EM: AlterarExercicioImpl.alterarExercicioPeito()", e.getMessage());
		   throw e;
		} catch (ClassNotFoundException e) {
		  logger.log(Level.SEVERE, "ERRO EM: AlterarExercicioImpl.alterarExercicioPeito()", e.getMessage());
		  throw e;
		}
	}

	@Override
	public void alterarExercicioBiceps(String exercicio, String novoExercicio) throws SQLException, ClassNotFoundException {
		 String query = "update Exercicio_Biceps set Exercicio = ? where Exercicio = ?";
			try {
				PreparedStatement preparedStmt = DaoConection.getConnection().prepareStatement(query);
				preparedStmt.setString(1,exercicio);
				preparedStmt.setString(2,novoExercicio);
				preparedStmt.executeUpdate();
				preparedStmt.close();
			} catch (SQLException e) {
			logger.log(Level.SEVERE, "ERRO EM: AlterarExercicioImpl.alterarExercicioBiceps()", e.getMessage());
			throw e;
		    } catch (ClassNotFoundException e) {
		    logger.log(Level.SEVERE, "ERRO EM: AlterarExercicioImpl.alterarExercicioBiceps()", e.getMessage());
			throw e;
			}
	 }

	@Override
	public void alterarExercicioCostas(String exercicio, String novoExercicio) throws SQLException, ClassNotFoundException {
		 String query = "update Exercicio_Costas set Exercicio = ? where Exercicio = ?";
			try {
				PreparedStatement preparedStmt = DaoConection.getConnection().prepareStatement(query);
				preparedStmt.setString(1,exercicio);
				preparedStmt.setString(2,novoExercicio);
				preparedStmt.executeUpdate();
				preparedStmt.close();
			} catch (SQLException e) {
			logger.log(Level.SEVERE, "ERRO EM: AlterarExercicioImpl.alterarExercicioCostas()", e.getMessage());
			throw e;
		    } catch (ClassNotFoundException e) {
		    logger.log(Level.SEVERE, "ERRO EM: AlterarExercicioImpl.alterarExercicioCostas()", e.getMessage());
			throw e;
			}
	}

	@Override
	public void alterarExercicioTriceps(String exercicio, String novoExercicio) throws SQLException, ClassNotFoundException {
		 String query = "update Exercicio_Triceps set Exercicio = ? where Exercicio = ?";
			try {
				PreparedStatement preparedStmt = DaoConection.getConnection().prepareStatement(query);
				preparedStmt.setString(1,exercicio);
				preparedStmt.setString(2,novoExercicio);
				preparedStmt.executeUpdate();
				preparedStmt.close();
			} catch (SQLException e) {
			logger.log(Level.SEVERE, "ERRO EM: AlterarExercicioImpl.alterarExercicioTriceps()", e.getMessage());
			throw e;
		    } catch (ClassNotFoundException e) {
			logger.log(Level.SEVERE, "ERRO EM: AlterarExercicioImpl.alterarExercicioTriceps()", e.getMessage());
			throw e;
			}
	}

	@Override
	public void alterarExercicioOmbro(String exercicio, String novoExercicio) throws SQLException, ClassNotFoundException {
		 String query = "update Exercicio_Ombro set Exercicio = ? where Exercicio = ?";
			try {
				PreparedStatement preparedStmt = DaoConection.getConnection().prepareStatement(query);
				preparedStmt.setString(1,exercicio);
				preparedStmt.setString(2,novoExercicio);
				preparedStmt.executeUpdate();
				preparedStmt.close();
			} catch (SQLException e) {
			logger.log(Level.SEVERE, "ERRO EM: AlterarExercicioImpl.alterarExercicioOmbro()", e.getMessage());
			throw e;
		    } catch (ClassNotFoundException e) {
		    logger.log(Level.SEVERE, "ERRO EM: AlterarExercicioImpl.alterarExercicioOmbro()", e.getMessage());
			throw e;
			}
		
	}

	@Override
	public void alterarExercicioPerna(String exercicio, String novoExercicio) throws SQLException, ClassNotFoundException {
		 String query = "update Exercicio_Perna set Exercicio = ? where Exercicio = ?";
			try {
				PreparedStatement preparedStmt = DaoConection.getConnection().prepareStatement(query);
				preparedStmt.setString(1,exercicio);
				preparedStmt.setString(2,novoExercicio);
				preparedStmt.executeUpdate();
				preparedStmt.close();
			} catch (SQLException e) {
			logger.log(Level.SEVERE, "ERRO EM: AlterarExercicioImpl.alterarExercicioPerna()", e.getMessage());
			throw e;
		    } catch (ClassNotFoundException e) {
			logger.log(Level.SEVERE, "ERRO EM: AlterarExercicioImpl.alterarExercicioPerna()", e.getMessage());
			throw e;
			}
		
	}
}
