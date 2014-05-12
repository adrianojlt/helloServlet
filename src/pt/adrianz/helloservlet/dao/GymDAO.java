package pt.adrianz.helloservlet.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import pt.adrianz.helloservlet.beans.Exercice;
import pt.adrianz.helloservlet.beans.MuscleGroup;


public class GymDAO {
	
	//private static final String SQL_LIST_ALL = "SELECT id, "
	
	private Context context;
	private DataSource datasource;
	private Connection connection;

	public GymDAO() {

		// get datasource via context lookup service ...
		try {
			this.context = new InitialContext();
			this.datasource = (DataSource)this.context.lookup("java:/comp/env/jdbc/gym");
			this.connection = this.datasource.getConnection();
		} 
		catch(NamingException nEx) {
			nEx.printStackTrace();
		}
		catch(SQLException sEx) {
			sEx.printStackTrace();
		}
		finally {
		}
	}
	
	public List<Exercice> getExercices() {

		List<Exercice> exercices = new ArrayList<Exercice>();
		ResultSet resultset = null;

		try {

			resultset = connection.prepareStatement("select * from exercice").executeQuery();

			while ( resultset.next() ) {
				Exercice exercice = new Exercice();
				exercice.setId(resultset.getInt("id"));
				exercice.setName(resultset.getString("name"));
				exercices.add(exercice);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				resultset.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return exercices;
	}

	public List<Exercice> getExercices(int id) {

		List<Exercice> exercices = new ArrayList<Exercice>();
		String query = "select * from exercice where id_MuscleGroup = ?";
		ResultSet resultset = null;
		
		try {

			PreparedStatement ps = connection.prepareStatement(query);
			ps.setInt(1, id);
			resultset = ps.executeQuery();
			
			while ( resultset.next() ) {
				Exercice exercice = new Exercice();
				exercice.setId(resultset.getInt("id"));
				exercice.setName(resultset.getString("name"));
				exercices.add(exercice);
			}
		}
		catch (SQLException eSql) {
			eSql.printStackTrace();
		}
		finally {
			try {
				resultset.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return exercices;
	}
	
	public List<MuscleGroup> getMuscleGroups() {
		
		List<MuscleGroup> group = new ArrayList<MuscleGroup>();
		String query = "select * from musclegroup";
		ResultSet resultset = null;

		try {

			resultset = connection.prepareStatement(query).executeQuery();

			while ( resultset.next() ) {
				MuscleGroup musclegroup = new MuscleGroup();
				musclegroup.setId(resultset.getInt("id"));
				musclegroup.setName(resultset.getString("name"));
				group.add(musclegroup);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				resultset.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return group;
	}
	
	public void close() {
		try {
			connection.close();
			context.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (NamingException nEx) {
			nEx.printStackTrace();
		}
	}
}
