package com.xworkz.shoes.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.xworkz.shoes.dto.ShoeDto;
import com.xworkz.shoes.dto.SqlCredintials;

public class ShoeRepoImpl implements ShoeRepo {

	@Override
	public boolean save(ShoeDto dto) {
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
				Connection connect = DriverManager.getConnection(SqlCredintials.URL.getValue(),SqlCredintials.USERID.getValue(),SqlCredintials.PASSWORD.getValue());
			
			
			    String query = "insert into shoe_details value(?,?,?,?,?)";

			    PreparedStatement statement = connect.prepareStatement(query);
			    statement.setInt(1, dto.getId());
			    statement.setString(2, dto.getBrandname());
			    statement.setInt(3,dto.getSize());
			    statement.setString(4, dto.getColour());
			    statement.setInt(5,dto.getPrice());
		
			    statement.executeUpdate();
			    statement.close();
			    connect.close();
		
		
		
		
		
		} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		return false;		
	
}

	@Override
	public ShoeDto read() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection(SqlCredintials.URL.getValue(),SqlCredintials.USERID.getValue(),SqlCredintials.PASSWORD.getValue());
			
			 String query = "select * from shoe_details where id=?";
			 
			PreparedStatement statement =connect.prepareStatement(query);
			statement.setInt(1, 2);
			ResultSet rs = statement.executeQuery();
			rs.next();
		 
			int value = rs.getInt("id");
			String name = rs.getString("brandName");
			String size = rs.getString("size");
			String colour = rs.getString("colour");
			int price = rs.getInt("price");
			
			System.out.println(value);
			System.out.println(name);
			System.out.println(size);
			System.out.println(colour);
			System.out.println(price);
			
			statement.close();
			connect.close();
			

			
			} 
		        catch (Exception e) {
				e.printStackTrace();
			}
		
		return null;
	}

	@Override
	public ShoeDto findByname(String name) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection(SqlCredintials.URL.getValue(),SqlCredintials.USERID.getValue(),SqlCredintials.PASSWORD.getValue());
			
			 String query = "select * from shoe_details where brandname=?";
			 
			PreparedStatement statement =connect.prepareStatement(query);
			statement.setString(1, name);
			ResultSet rs = statement.executeQuery();
			
			while(rs.next()) {
		 
			int value = rs.getInt("id");
			String brandname= rs.getString("brandName");
			String size = rs.getString("size");
			String colour = rs.getString("colour");
			int price = rs.getInt("price");
			
			ShoeDto dto = new ShoeDto(price, brandname, value, colour, price);
			return dto;
		}
//			System.out.println(value);
//			System.out.println(name);
//			System.out.println(size);
//			System.out.println(colour);
//			System.out.println(price);
			
			
			statement.close();
			connect.close();
			

			
			} 
		        catch (Exception e) {
				e.printStackTrace();
			}
		return null;
	}

	@Override
	public ShoeDto findByBrandnameAndId(String brandname, int id) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection(SqlCredintials.URL.getValue(),SqlCredintials.USERID.getValue(),SqlCredintials.PASSWORD.getValue());
			
			 String query = "select * from shoe_details where brandname=? and id=?";
			 
			PreparedStatement statement =connect.prepareStatement(query);
			statement.setString(1, brandname);
			statement.setInt(2, id);
			ResultSet rs = statement.executeQuery();
			
			while(rs.next()) {
		 
			int value = rs.getInt("id");
			String brandname1= rs.getString("brandName");
			String size = rs.getString("size");
			String colour = rs.getString("colour");
			int price = rs.getInt("price");
			
			ShoeDto dto = new ShoeDto(price, brandname, value, colour, price);
			return dto;
		}
//			System.out.println(value);
//			System.out.println(name);
//			System.out.println(size);
//			System.out.println(colour);
//			System.out.println(price);
			
			
			statement.close();
			connect.close();
			

			
			} 
		        catch (Exception e) {
				e.printStackTrace();
			}
		return null;
	}
}
