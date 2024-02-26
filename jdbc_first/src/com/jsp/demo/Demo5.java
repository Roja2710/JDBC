package com.jsp.demo;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo5 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_first","root","root");
			java.sql.Statement statement = connection.createStatement();
			statement.execute("update user set name='rr',phone=98765432 where id = 20");
			connection.close();
			System.out.println("update data");
		}
		catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}

	}

}
