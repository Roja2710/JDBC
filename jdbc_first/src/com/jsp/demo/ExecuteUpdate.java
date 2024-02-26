package com.jsp.demo;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ExecuteUpdate {

	public static void main(String[] args) {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_first? user=root & password=root");
			//java.sql.Statement statement = connection.createStatement();
			PreparedStatement preparedStatement = connection.prepareStatement("insert into user values(?,?,?)");
			preparedStatement.setInt(1, 2);
			preparedStatement.setString(2, "roja");
			preparedStatement.setLong(3, 987654321);
			int res = preparedStatement.executeUpdate();
			connection.close();
			System.out.println("data updated");
			System.out.println(res);
			
		} 
		catch (SQLException e) {
						e.printStackTrace();
		}

	}

}
