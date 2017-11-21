package br.com.bodybuilder.service.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.bodybuilder.database.DaoConection;
import br.com.bodybuilder.model.Aluno;
import br.com.bodybuilder.service.CadastroAluno;

public class CadastroAlunoImpl implements CadastroAluno {

	private static final Logger logger = Logger.getLogger(CadastroAlunoImpl.class.getName());

	@Override
	public void inserirDadosAluno(Aluno aluno) throws ClassNotFoundException, SQLException {
        
		PreparedStatement stmt = null;
		aluno.setMatricula(100);
		try {
			/*String insertTableSQ = "Insert into CadastroAluno"
					+ "(Matricula, Nome, CPF, Idade, RG, Nascimento, Sexo, Endereco, Numero, Complemento, Bairro, Cidade, Estado, DT_Matricula, "
					+ "Vencimento, Plano, OBS) Values" + "(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";*/

			
			String insertTableSQ = "Insert into CadastroAluno"
					+ "(Matricula, Nome, CPF, Idade, RG, Nascimento, Sexo, Endereco, Numero, Complemento, Bairro, Cidade, Estado) Values" + "(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			
			stmt = DaoConection.getConnection().prepareStatement(insertTableSQ);

			stmt.setInt(1, aluno.getMatricula());
			stmt.setString(2, aluno.getNome());
			stmt.setString(3, aluno.getCPF());
			stmt.setInt(4, aluno.getIdade());
			stmt.setInt(5, aluno.getRg());
			stmt.setDate(6, (Date) aluno.getData_Nasc());
			stmt.setString(7, aluno.getSexo());
			stmt.setString(8, aluno.getEndereco());
			stmt.setInt(9, aluno.getNumero());
			stmt.setString(10, aluno.getComplemento());
			stmt.setString(11, aluno.getBairro());
			stmt.setString(12, aluno.getCidade());
			stmt.setString(13, aluno.getEstado());
			/*stmt.setString(14, aluno.getData_Matricula());
			stmt.setString(15, aluno.getData_Vencimento());
			stmt.setString(16, aluno.getPlano());
			stmt.setString(17, aluno.getObservacao());*/
			stmt.executeUpdate();
			stmt.close();
		} catch (SQLException e) {
			logger.log(Level.SEVERE, "ERRO EM: CadastrarAlunoImpl.inserirDadosAluno()", e.getMessage());
			throw e;
		} catch (ClassNotFoundException e) {
			logger.log(Level.SEVERE, "ERRO EM: CadastrarAlunoImpl.inserirDadosAluno()", e.getMessage());
			throw e;
		}
	}

	@Override
	public List<Aluno> obterDadosAluno(Aluno alunoPesquisa) throws ClassNotFoundException, SQLException {

		List<Aluno> alunoList = new ArrayList<Aluno>();
		Aluno aluno = new Aluno();
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			Connection conn = DaoConection.getConnection();
			stmt = conn.createStatement();
			String sql = "select *from CadastroAluno where";
			
			sql.concat(alunoPesquisa.getNome());
			sql.concat("||");
			sql.concat(alunoPesquisa.getCPF());
			sql.concat("||");
			sql.concat(String.valueOf(alunoPesquisa.getMatricula()));
			
			PreparedStatement statement = conn.prepareStatement(sql);
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				aluno.setMatricula(Integer.valueOf(rs.getString("Matricula")));
				aluno.setNome(rs.getString("Nome"));
				aluno.setCPF(rs.getString("CPF"));
				aluno.setIdade(Integer.valueOf(rs.getString("Idade")));
				aluno.setRg(Integer.valueOf(rs.getString("RG")));
				aluno.setData_Nasc(rs.getDate("Nascimento"));
				aluno.setSexo(rs.getString("Sexo"));
				aluno.setEndereco(rs.getString("Endereco"));
				aluno.setNumero(Integer.valueOf(rs.getString("Numero")));
				aluno.setComplemento(rs.getString("Complemento"));
				aluno.setBairro(rs.getString("Bairro"));
				aluno.setCidade(rs.getString("Cidade"));
				aluno.setEstado(rs.getString("Estado"));
				aluno.setData_Matricula(rs.getString("DT_Matricula"));
				aluno.setData_Vencimento(rs.getString("Vencimento"));
				aluno.setPlano(rs.getString("Plano"));
				aluno.setObservacao(rs.getString("OBS"));
				alunoList.add(aluno);
			}
			stmt.close();
			statement.close();
			conn.close();
		} catch (SQLException e) {
			logger.log(Level.SEVERE, " ERRO EM: CadastrarAlunoImpl.obterDadosAluno()", e.getMessage());
			throw e;
		} catch (ClassNotFoundException e) {
			logger.log(Level.SEVERE, " ERRO EM: CadastrarAlunoImpl.obterDadosAluno()", e.getMessage());
			throw e;
		}
		return alunoList;
	}

}
