package br.com.z9games.dados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conexao {

	//Conexão com o banco de dados
	private String driver = "org.sqlite.JDBC";
	private String url = "jdbc:sqlite:z9games.sqlite";
	public Connection Conexao = null;
	public PreparedStatement prstm = null;
	public ResultSet resultset = null;

	public Conexao() {
		
	}
	
	// metodo vai abrir uma conexao com o banco de dados
	public void openBD() {
		
		try {
			Class.forName(driver);
			Conexao = DriverManager.getConnection(url);
			
			
		} catch (ClassNotFoundException e) {
		
			System.err.println("erro no driver: "+e.getMessage());
			
		} catch (SQLException e) {
	
			System.err.println("erro de url: "+e.getMessage());

		}
		
	}
}
