package com.jsp.demo;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;


public class RegisterDriver {

	public static void main(String[] args) {
		
		//DriverManager.registerDriver(new Driver());
		
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
			System.out.println(connection);
		} catch (SQLException e) {

			e.printStackTrace();
		}
		

	}

}
