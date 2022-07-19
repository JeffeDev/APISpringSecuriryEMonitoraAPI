package br.com.devti.gestaorestaurantes.core.dao.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoMySQL {

	private static final String urlDb = "jdbc:mysql://localhost:3306/gestao_usuario_tarde"; 
	private static final String userDb = "root";
	private static final String passDb = "root"; //ATENCAO - eu orientei que a senha fosse root
	
	private static Connection conn;
	
	public static Connection getConexao() {
		
		try {
			if(conn == null) {			
				conn = DriverManager.getConnection(urlDb, userDb, passDb);
				return conn;
			}else {
				return conn;
			}
		} catch (SQLException e) {			
			e.printStackTrace();
			return null;
		}		
	}
	
	
//	public static void main(String[] args) {
//		
//		try {
//			Connection con = DriverManager.getConnection(urlDb, userDb, passDb);
//			Statement stmt = con.createStatement();
//			ResultSet rs = stmt.executeQuery("SELECT NOME_USU FROM USUARIO");
//			while(rs.next()) {
//				System.out.println(rs.getString("NOME_USU"));
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//	}
	
}
