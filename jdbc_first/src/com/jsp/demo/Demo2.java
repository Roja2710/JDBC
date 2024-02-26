package com.jsp.demo;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo2 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
			java.sql.Statement statement = connection.createStatement();
			System.out.println(statement);
		}
		catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		
	

}
}
