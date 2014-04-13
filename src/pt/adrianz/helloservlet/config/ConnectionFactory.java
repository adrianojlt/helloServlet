package pt.adrianz.helloservlet.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	private static ConnectionFactory instance = new ConnectionFactory();
	
	private String url = "jdbc:mysql://localhost/helloservlet";
	private String driverClass = "com.mysql.jdbc.Driver";
	private String user = "root";
	private String pass = "";
	
	private ConnectionFactory() {
		try {
			Class.forName(driverClass);
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static ConnectionFactory getInstance() { return instance; }
	
	public Connection getConnection() throws SQLException, ClassNotFoundException {
		Connection conn = DriverManager.getConnection(url,user,pass);
		return conn;
	}
}
