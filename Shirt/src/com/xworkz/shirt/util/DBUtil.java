package com.xworkz.shirt.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.xworkz.shirt.constants.Sqlcredentials;

public class DBUtil {
	public static Connection getConnection() {
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(Sqlcredentials.URL.getValue(), Sqlcredentials.
					USERID.getValue(), Sqlcredentials.PASSWORD.getValue());
			return connection;
			
		}
		
		
		
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
		
	}

}
