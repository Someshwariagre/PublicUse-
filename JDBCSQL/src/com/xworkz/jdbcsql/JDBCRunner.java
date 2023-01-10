package com.xworkz.jdbcsql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBCRunner {
	public static void main(String[] args) {
		String username = "root";
		String password = "Xworkzodc@123";
		String host = "jdbc:mysql://localhost:3306/sep_08";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 Connection connect=DriverManager.getConnection(host, username, password);
			
			 String query = "INSERT INTO Metro_details VALUES(?,?,?,?,?)";
			 
			PreparedStatement statement =connect.prepareStatement(query);
			
			statement.setInt(1, 1);
			statement.setString(2, "Banshankari");
			statement.setString(3, "Majestic");
			statement.setString(4, "8km");
			statement.setInt(5, 25);
			
//			statement.setInt(1, 2);
//			statement.setString(2, "JP nagar");
//			statement.setString(3, "Peenya");
//			statement.setString(4, "10km");
//			statement.setInt(5, 35);
//			
//			statement.setInt(1, 3);
//			statement.setString(2, "Electronic City");
//			statement.setString(3, "Silk board");
//			statement.setString(4, "12km");
//			statement.setInt(5, 30);
//			
//			statement.setInt(1, 4);
//			statement.setString(2, "Mejestic");
//			statement.setString(3, "Kengeri");
//			statement.setString(4, "20km");
//			statement.setInt(5, 40);
//			
//			statement.setInt(1, 5);
//			statement.setString(2, "Rajajinagar");
//			statement.setString(3, "bommnahalli");
//			statement.setString(4, "14km");
//			statement.setInt(5, 33);
			
			statement.executeUpdate();
			
			statement.close();
			connect.close();	
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

}
