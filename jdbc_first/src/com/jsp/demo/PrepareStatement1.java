package com.jsp.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class PrepareStatement1 { //preparestatement interface
	//Update

	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new Driver());
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_first?user=root & password=root");
			PreparedStatement preparedStatement = connection.prepareStatement("update user set name=?,phone=? where id =?");
			preparedStatement.setString(1, "roja");
			preparedStatement.setLong(2, 98976543);
			preparedStatement.setInt(3, 12);
			preparedStatement.execute();
			connection.close();
			System.out.println("data updated");
		} catch (SQLException e) {
	
			e.printStackTrace();
		}
		

	}

}

