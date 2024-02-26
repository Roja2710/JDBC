package com.jsp.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class ExPreStatement {//preparedstatement interface
	//insert
	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new Driver());
			Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_first" ,"root","root");
			PreparedStatement preparedStatement=connection.prepareStatement("insert into user values(?,?,?)");
			preparedStatement.setInt(1, 1);
			preparedStatement.setString(2, "reddy");
			preparedStatement.setLong(3, 765432);
			
			 boolean res =preparedStatement.execute();
			connection.close();
			System.out.println(res);
			System.out.println("data saved");
		}
		catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}
