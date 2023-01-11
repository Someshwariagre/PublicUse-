package com.xworkz.jdbcsql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TreeRunner {
	public static void main(String[] args) {
		String username = "root";
		String password = "Xworkzodc@123";
		String host = "jdbc:mysql://localhost:3306/sep_08";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 Connection connect=DriverManager.getConnection(host, username, password);
			
			 String query = "select * from trees where id=?";
			 
			PreparedStatement statement =connect.prepareStatement(query);
			statement.setInt(1, 1);
			
			ResultSet rs = statement.executeQuery();
			rs.next();
//			rs.getInt);
			System.out.println(result);
   		   
//			System.out.println(id);
			statement.executeQuery();
			statement.close();
			connect.close();

			
			} 
		        catch (Exception e) {
				e.printStackTrace();
			} 
		}

	}
