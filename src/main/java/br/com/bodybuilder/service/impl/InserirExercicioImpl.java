package br.com.bodybuilder.service.impl;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.bodybuilder.database.DaoConection;
import br.com.bodybuilder.model.Exercicios;
import br.com.bodybuilder.service.InserirExericio;

public class InserirExercicioImpl extends DaoConection implements InserirExericio {
	
	private static final Logger logger = Logger.getLogger(InserirExercicioImpl.class.getName());

	@Override
	public void inserirExercicioPeito(Exercicios novoExercicio) throws  SQLException, ClassNotFoundException {
        PreparedStatement stmt = null;
		try{
		stmt = DaoConection.getConnection().prepareStatement("Insert into Exercicio_Peito(Exercicio) values(?)");
		stmt.setString(1,novoExercicio.getPeito());
		stmt.executeUpdate();
		stmt.close();
		}catch (SQLException e) {
		 logger.log(Level.SEVERE, "ERRO EM: InserirExercicioImpl.inserirExercicioPeito()", e.getMessage());
		 throw e;
	    } catch (ClassNotFoundException e) {
		logger.log(Level.SEVERE, "ERRO EM: InserirExercicioImpl.inserirExercicioPeito()", e.getMessage());
		throw e;
		}
	}
	
	@Override
	public void inserirExercicioBiceps(Exercicios novoExercicio) throws SQLException, ClassNotFoundException {
	PreparedStatement stmt = null;
		try{
		stmt = DaoConection.getConnection().prepareStatement("Insert into Exercicio_Biceps(Exercicio) values(?)");
		stmt.setString(1,novoExercicio.getBiceps());
		stmt.executeUpdate();
		stmt.close();
		}catch (SQLException e) {
		logger.log(Level.SEVERE, "ERRO EM: InserirExercicioImpl.inserirExercicioBiceps()", e.getMessage());
		throw e;
		} catch (ClassNotFoundException e) {
		logger.log(Level.SEVERE, "ERRO EM: InserirExercicioImpl.inserirExercicioBiceps()", e.getMessage());
		throw e;
		}
	}
	
	@Override
	public void inserirExercicioOmbro(Exercicios novoExercicio) throws SQLException, ClassNotFoundException {
	PreparedStatement stmt = null;
		try{
		stmt = DaoConection.getConnection().prepareStatement("Insert into Exercicio_Ombro(Exercicio) values(?)");
		stmt.setString(1,novoExercicio.getOmbro());
		stmt.executeUpdate();
		stmt.close();
		}catch (SQLException e) {
		logger.log(Level.SEVERE, "ERRO EM: InserirExercicioImpl.inserirExercicioOmbro()", e.getMessage());
		throw e;
		} catch (ClassNotFoundException e) {
		logger.log(Level.SEVERE, "ERRO EM: InserirExercicioImpl.inserirExercicioOmbro()", e.getMessage());
		throw e;
		}
	}
	
	@Override
	public void inserirExercicioPerna(Exercicios novoExercicio) throws SQLException, ClassNotFoundException {
	PreparedStatement stmt = null;
		try{
		stmt = DaoConection.getConnection().prepareStatement("Insert into Exercicio_Perna(Exercicio) values(?)");
		stmt.setString(1,novoExercicio.getPerna());
		stmt.executeUpdate();
		stmt.close();
		}catch (SQLException e) {
		logger.log(Level.SEVERE, "ERRO EM: InserirExercicioImpl.inserirExercicioPerna()", e.getMessage());
		throw e;
		} catch (ClassNotFoundException e) {
		logger.log(Level.SEVERE, "ERRO EM: InserirExercicioImpl.inserirExercicioPerna()", e.getMessage());
		throw e;
		}
	}
	
	@Override
	public void inserirExercicioCostas(Exercicios novoExercicio) throws SQLException, ClassNotFoundException {
	PreparedStatement stmt = null;
		try{
		stmt = DaoConection.getConnection().prepareStatement("Insert into Exercicio_Costas(Exercicio) values(?)");
		stmt.setString(1,novoExercicio.getCostas());
		stmt.executeUpdate();
		stmt.close();
		}catch (SQLException e) {
		logger.log(Level.SEVERE, "ERRO EM: InserirExercicioImpl.inserirExercicioCostas()", e.getMessage());
		throw e;
		} catch (ClassNotFoundException e) {
		logger.log(Level.SEVERE, "ERRO EM: InserirExercicioImpl.inserirExercicioCostas()", e.getMessage());
		throw e;
		}
	}
	
	@Override
	public void inserirExercicioTriceps(Exercicios novoExercicio) throws SQLException, ClassNotFoundException {
	PreparedStatement stmt = null;
		try{
		stmt = DaoConection.getConnection().prepareStatement("Insert into Exercicio_Triceps(Exercicio) values(?)");
		stmt.setString(1,novoExercicio.getTriceps());
		stmt.executeUpdate();
		stmt.close();
		}catch (SQLException e) {
		logger.log(Level.SEVERE, "ERRO EM: InserirExercicioImpl.inserirExercicioTriceps()", e.getMessage());
		throw e;
		} catch (ClassNotFoundException e) {
		logger.log(Level.SEVERE, "ERRO EM: InserirExercicioImpl.inserirExercicioTriceps()", e.getMessage());
		throw e;
		}
	}
    
}
