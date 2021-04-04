package com.learning.maven_learning;

import java.sql.*;

public class PreparedStatementEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // driver
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/narayana", "root", "root"); // connection
																												// url
																												// username
																												// password
			//Insert Query
			PreparedStatement stmt = con.prepareStatement("INSERT INTO employees (ID,Name,lastname) VALUES (?,?,?);"); // prepared statement
			stmt.setInt(1,35);
			stmt.setString(2,"Bharat");
			stmt.setString(3,"Yalla"); 
			int rs = stmt.executeUpdate(); //resultset
			System.out.println(rs+" records inserted successfully");  
			
			/*//Select Query
			PreparedStatement stmt = con.prepareStatement("select * from employees where ID = ?"); // prepared statement
			stmt.setInt(1,10);
			ResultSet rs = stmt.executeQuery(); //resultset
			ResultSetMetaData metaData = rs.getMetaData();
			System.out.println(metaData.getColumnName(1) + " " + metaData.getColumnName(2) + " " + metaData.getColumnName(3));
			while (rs.next())
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3)); // print
			*/
			con.close(); // close connection
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
