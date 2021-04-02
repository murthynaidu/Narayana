package com.learning.maven_learning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class Jdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // driver
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/narayana", "root", "root"); // connection
																												// url
																												// username
																												// password
			Statement stmt = con.createStatement(); // statement
			ResultSet rs = stmt.executeQuery("select * from employees"); //resultset
			ResultSetMetaData metaData = rs.getMetaData();
			System.out.println(metaData.getColumnName(1) + " " + metaData.getColumnName(2) + " " + metaData.getColumnName(3));
			while (rs.next())
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3)); // print
			con.close(); // close connection
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
