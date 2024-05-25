package net.code.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RetriveData {
	
	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/sampledb";
		String username = "root";
		String password = "root";
		 
		try(Connection conn = DriverManager.getConnection(dbURL, username, password)) {
		 
			String sql = "SELECT * FROM Users";
			 
			Statement statement = conn.createStatement();
			ResultSet result = statement.executeQuery(sql);
			 
			int count = 0;
			 
			while (result.next()){
			    String name = result.getString(2);
			    String pass = result.getString(3);
			    String fullname = result.getString("fullname");
			    String email = result.getString("email");
			 
			    String output = "User #%d:  %s - %s - %s";
			    System.out.println(String.format(output, ++count,username, password, fullname, email));
			}
		} catch (SQLException ex) {
		    ex.printStackTrace();
		}

	}

}
