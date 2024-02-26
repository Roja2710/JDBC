package com.jsp.demo;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo3 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_first","root","root");
			java.sql.Statement statement = connection.createStatement();
			statement.execute("create table user(id int primary key,name varchar(45),phone bigint(10))");
			connection.close();
			System.out.println("table created");
	
		} 
		catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		
	}

}
