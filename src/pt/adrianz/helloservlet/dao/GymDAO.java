package pt.adrianz.helloservlet.dao;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class GymDAO {
	
	Connection connection;
	Context context;
	
	public GymDAO() {

		try {
			this.context = new InitialContext();
			DataSource ds = (DataSource)context.lookup("java:/comp/env/jdbc/gym");
			this.connection = ds.getConnection();
		} 
		catch(NamingException nEx) {
			nEx.printStackTrace();
		}
		catch(SQLException sEx) {
			sEx.printStackTrace();
		}
	}
}
