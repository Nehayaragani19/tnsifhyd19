package net.code.java;

import java.sql.*;


public class retrieveemployee {
	
	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/employeedb";
		String username = "root";
		String password = "root";
		 
		try(Connection conn = DriverManager.getConnection(dbURL, username, password)) {
		 
			String sql = "SELECT * FROM employee";			 
			Statement statement = conn.createStatement();
			ResultSet result = statement.executeQuery(sql);
			 
			int count = 0;
			 
			while (result.next()){
			    String name = result.getString(2);
			    String pass = result.getString(3);
			  
			  
			    String emp_id= result.getString("emp_id");
				 
			 
			    String output = "User #%d:  %s - %s ";
				System.out.println(String.format(output, ++count, name, pass,emp_id));
			}
		} catch (SQLException ex) {
		    ex.printStackTrace();
		}

	}
}
