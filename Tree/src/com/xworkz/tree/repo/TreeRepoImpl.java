package com.xworkz.tree.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.xworkz.tree.dto.TreeDto;

public class TreeRepoImpl implements TreeRepo {
	String username = "root";
	String password = "Xworkzodc@123";
	String host = "jdbc:mysql://localhost:3306/sep_08";
	
	@Override
	public boolean save(TreeDto dto) {
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 Connection connect = DriverManager.getConnection(host, username, password);
			
			 String query = "INSERT INTO Trees VALUES(?,?,?,?,?,?)";
			 
			PreparedStatement statement = connect.prepareStatement(query);
			statement.setInt(1,  );
			statement.setString(2, "Banyan");
			statement.setString(3, "Green");
			statement.setString(4, "Creeper");
			statement.setInt(5, 100);
			statement.setString(6, "Light green");
          
			statement.executeUpdate();
//			System.out.println(status);
			
			statement.close();
			connect.close();	
			
		}
		catch (Exception e) {
			e.printStackTrace();
		} 
		
		return true;
	}

	@Override
	public boolean read() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 Connection connect=DriverManager.getConnection(host, username, password);
			
			 String query = "select * from trees where id=?";
			 
			PreparedStatement statement =connect.prepareStatement(query);
			statement.setInt(1, 1);
			
			
			
			ResultSet rs = statement.executeQuery();
			rs.next();
		 int result	=rs.getInt(1);
		 System.out.println(result);
   	
//	System.out.println(id);
			
			statement.executeQuery();
			statement.close();
			connect.close();
			return true;

			
			} 
		        catch (Exception e) {
				e.printStackTrace();
			}
		return false; 
		
		
	}

}
