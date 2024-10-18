package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AlunoDAO {
	
	private String jdbcURL = "jdbc:mysql://localhost:3306/aluno_db";
	private String jdbcUsername = "root";
	private String jdbcPassword = "12345";
	
	private static final String INSERT_ALUNO_SQL = "INSERT INTO aluno (nome,email,curso) VALUES (?,?,?)";
	
	public AlunoDAO() {}
	
	protected Connection getConnection() {
		
		Connection connection = null;
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(jdbcURL,jdbcUsername,jdbcPassword);
		}catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return connection;
		
	}
	
	public void insertAluno(Aluno aluno) throws SQLException{
		try(Connection connection = getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(INSERT_ALUNO_SQL)) {
			preparedStatement.setString(1, aluno.getNome());
			preparedStatement.setString(2, aluno.getEmail());
			preparedStatement.setString(3, aluno.getCurso());
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}	
	
}

