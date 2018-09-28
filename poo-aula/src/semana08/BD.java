package semana08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class BD {
	
	public Connection connection;
	public PreparedStatement preparedStatement;
	public ResultSet resultSet;
	
	private final String DRIVER = 
			"com.microsoft.sqlserver.jdbc.SQLServerDriver";
	
	private final String BANCO = "brasil";
	
	private final String URL =
			"jdbc:sqlserver://localhost:1433;databaseName="+BANCO;
	
	private final String LOGIN = "sa";
	private final String SENHA = "tESTE1234";
	
	public boolean getConnection() {

		try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(URL, LOGIN, SENHA);
			return true;
		} catch (ClassNotFoundException e) {
			return false;
		} catch (SQLException e) {
			System.out.println(e.toString());
			return false;
		}
	}
	
	public void close() {
		if(resultSet != null) {
			try {
				resultSet.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
			
			if(preparedStatement != null) {
				try {
					preparedStatement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			try {
				connection.close();
				System.out.println("Desconectou");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		
		
	}
	
	public static void main(String[] args) {
		BD bd = new BD();
		
		bd.getConnection();
		
		String s = JOptionPane.showInputDialog("Nome?");
		
		try {
			String sql = "select * from cidade where nome like ?";
			bd.preparedStatement = bd.connection.prepareStatement(sql);
			bd.preparedStatement.setString(1, s+"%");
			bd.resultSet = bd.preparedStatement.executeQuery();
			
			int i = 1;
			
			while(bd.resultSet.next()) {
				System.out.print(bd.resultSet.getString(1) + " , ");
				System.out.print(bd.resultSet.getString(2) + " , ");
				System.out.print(bd.resultSet.getString(3) + " , ");	
				
				System.out.println(i);
				i++;
				
				System.out.println("-------------------------------");
			}
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		bd.close();
	}
	
}
