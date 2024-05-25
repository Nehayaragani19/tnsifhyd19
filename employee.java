package net.code.java;

import java.sql.*;


public class employee {
	
	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/employeedb";
		String username = "root";
		String password = "root";
		 
		try {
		 
		    Connection conn = DriverManager.getConnection(dbURL, username, password);
		 
		    if (conn != null) {
		        System.out.println("Connected to the database");
		        conn.close();
		    }
		} catch (SQLException ex) {
			ex.printStackTrace();
		    		

		}
	} 

}
