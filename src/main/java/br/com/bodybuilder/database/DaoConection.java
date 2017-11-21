package br.com.bodybuilder.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DaoConection {

	private static final String STR_DRIVER = "org.sqlite.JDBC";
	private static final String NOME_BANCO = "C:/Desenvolvimento/bodyBuilderBD/workout.db";
	private static final String STR_CON = "jdbc:sqlite:"+NOME_BANCO;
	private static final String USER ="root";
	private static final String PASSWORD = "root";
	private static final Logger logger = Logger.getLogger(DaoConection.class.getName());

	
	public DaoConection() {
		
	}
    
	/**
	 * 	 * @return
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 */
	public static Connection getConnection() throws ClassNotFoundException, SQLException{
		
		Connection conn = null;
		String errorMsg = "";
		try{
			Class.forName(STR_DRIVER);
			conn = (Connection) DriverManager.getConnection(STR_CON);
			System.out.println("Conectado");
		}catch (ClassNotFoundException e) {
			 errorMsg = " Driver não encontrado";
			 logger.log(Level.SEVERE, errorMsg, e.getMessage());
			 throw new ClassNotFoundException();
			 
		}catch (SQLException e) {
			 errorMsg = " Erro ao obter a conexão";
			 logger.log(Level.SEVERE, errorMsg, e.getMessage());
			 throw new SQLException();
		}
		return conn;
	}
	
	public static void close(Connection conn) throws SQLException{
		
		try{
			if(conn != null){
				conn.close();
			}
		}catch (SQLException e) {
			String errorMsg = " Não foi possível fechar a conexçao com o banco ";
			logger.log(Level.SEVERE, errorMsg, e.getMessage());
			 throw new SQLException();
		}
	}
}
