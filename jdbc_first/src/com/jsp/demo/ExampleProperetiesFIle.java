package com.jsp.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.cj.jdbc.Driver;

public class ExampleProperetiesFIle {

	public static void main(String[] args) {
		try {
			Properties propeties = new Properties();
			FileInputStream fileInputStream = new FileInputStream("dataconfig.properties");
			propeties.load(fileInputStream);
			DriverManager.registerDriver(new Driver());
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306",propeties);
			System.out.println(connection);
			
		} catch (SQLException | IOException e) {
			
			e.printStackTrace();
		}

	}

}
