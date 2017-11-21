package br.com.bodybuilder.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.bodybuilder.database.DaoConection;
import br.com.bodybuilder.service.SelecionarExercicio;

public class SelecionarExercicioImpl extends DaoConection implements SelecionarExercicio {
	
	private static final Logger logger = Logger.getLogger(SelecionarExercicioImpl.class.getName());

	
    
	@Override
	public  Map<String,String> selecionarExercicioPeito() throws SQLException, ClassNotFoundException {
		Map<String,String> retornoSelect = new HashMap<String, String>();
		Statement stmt = null;
		ResultSet rs = null;
		try {
			 Connection conn = DaoConection.getConnection();
			 stmt = conn.createStatement();
			 String sql = "select *from Exercicio_Peito";
			 PreparedStatement statement = conn.prepareStatement(sql);
			 rs = stmt.executeQuery(sql);
			 while ( rs.next() ) {
	                String retorno = rs.getString("Exercicio");
	                retornoSelect.put(retorno, retorno);
	            }
			stmt.close();
			statement.close();
			conn.close();
		} catch (SQLException e) {
			logger.log(Level.SEVERE, " ERRO EM: SelecionarExercicioImpl.selecionarExercicioPeito()", e.getMessage());
			throw e;
		} catch (ClassNotFoundException e) {
			logger.log(Level.SEVERE, " ERRO EM: SelecionarExercicioImpl.selecionarExercicioPeito()", e.getMessage());
			throw e;
		}
		return retornoSelect;
	}

	@Override
	public Map<String,String> selecionarExercicioBiceps() throws SQLException, ClassNotFoundException {
		    Map<String,String> retornoSelect = new HashMap<String, String>();
		    Statement stmt = null;
		    ResultSet rs = null;
			try {
				Connection conn = DaoConection.getConnection();
				stmt = conn.createStatement();
				String sql = "select *from Exercicio_Biceps";
				rs = stmt.executeQuery(sql);
				 while ( rs.next() ) {
		                String retorno = rs.getString("Exercicio");
		                retornoSelect.put(retorno, retorno);
		            }
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				logger.log(Level.SEVERE, " ERRO EM: SelecionarExercicioImpl.selecionarExercicioBiceps()", e.getMessage());
				throw e;
		    } catch (ClassNotFoundException e) {
			    logger.log(Level.SEVERE, " ERRO EM: SelecionarExercicioImpl.selecionarExercicioBiceps()", e.getMessage());
			    throw e;
			}
			return retornoSelect;
	 }

	@Override
	public  Map<String,String> selecionarExercicioCostas() throws SQLException, ClassNotFoundException {
		    Map<String,String> retornoSelect = new HashMap<String, String>();
		    Statement stmt = null;
		    ResultSet rs = null;
			try {
				Connection conn = DaoConection.getConnection();
				stmt = conn.createStatement();
				String sql = "select *from Exercicio_Costas";
				rs = stmt.executeQuery(sql);
				 while ( rs.next() ) {
		                String retorno = rs.getString("Exercicio");
		                retornoSelect.put(retorno, retorno);
		            }
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				logger.log(Level.SEVERE, " ERRO EM: SelecionarExercicioImpl.selecionarExercicioCostas()", e.getMessage());
				throw e;
		    } catch (ClassNotFoundException e) {
		    	logger.log(Level.SEVERE, " ERRO EM: SelecionarExercicioImpl.selecionarExercicioCostas()", e.getMessage());
		    	throw e;
			}
			return retornoSelect;
	}

	@Override
	public  Map<String,String> selecionarExercicioTriceps() throws SQLException, ClassNotFoundException {
		    Map<String,String> retornoSelect = new HashMap<String, String>();
		    Statement stmt = null;
		    ResultSet rs = null;
			try {
				Connection conn = DaoConection.getConnection();
				stmt = conn.createStatement();
				String sql = "select *from Exercicio_Triceps";
				rs = stmt.executeQuery(sql);
				 while ( rs.next() ) {
		                String retorno = rs.getString("Exercicio");
		                retornoSelect.put(retorno, retorno);
		            }
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				logger.log(Level.SEVERE, " ERRO EM: SelecionarExercicioImpl.selecionarExercicioTriceps()", e.getMessage());
				throw e;
		    } catch (ClassNotFoundException e) {
			    logger.log(Level.SEVERE, " ERRO EM: SelecionarExercicioImpl.selecionarExercicioTriceps()", e.getMessage());
			    throw e;
			}
			return retornoSelect;
	}

	@Override
	public  Map<String,String> selecionarExercicioOmbro() throws SQLException, ClassNotFoundException {
		    Map<String,String> retornoSelect = new HashMap<String, String>();
		    Statement stmt = null;
		    ResultSet rs = null;
			try {
				Connection conn = DaoConection.getConnection();
				stmt = conn.createStatement();
				String sql = "select *from Exercicio_Ombro";
				rs = stmt.executeQuery(sql);
				while ( rs.next() ) {
	                String retorno = rs.getString("Exercicio");
	                retornoSelect.put(retorno, retorno);
	            }
			    stmt.close();
				conn.close();
			} catch (SQLException e) {
				logger.log(Level.SEVERE, " ERRO EM: SelecionarExercicioImpl.selecionarExercicioOmbro()", e.getMessage());
				throw e;
		    } catch (ClassNotFoundException e) {
		    	logger.log(Level.SEVERE, " ERRO EM: SelecionarExercicioImpl.selecionarExercicioOmbro()", e.getMessage());
				throw e;
			}
			return retornoSelect;
		
	}

	@Override
	public Map<String,String> selecionarExercicioPerna() throws SQLException, ClassNotFoundException {
		Map<String,String> retornoSelect = new HashMap<String, String>();
	    Statement stmt = null;
	    ResultSet rs = null;
		try {
			 Connection conn = DaoConection.getConnection();
			 stmt = conn.createStatement();
			 String sql = "select *from Exercicio_Perna";
			 rs = stmt.executeQuery(sql);
			 while(rs.next()){
				 String retorno = rs.getString("Exercicio");
	             retornoSelect.put("exercicio", retorno);
			}
			stmt.close();
			conn.close();
			} catch (SQLException e) {
				logger.log(Level.SEVERE, " ERRO EM: SelecionarExercicioImpl.selecionarExercicioPerna()", e.getMessage());
				throw e;
		    } catch (ClassNotFoundException e) {
		    	logger.log(Level.SEVERE, " ERRO EM: SelecionarExercicioImpl.selecionarExercicioPerna()", e.getMessage());
				throw e;
			}
		return retornoSelect;
	}
}
