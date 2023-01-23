package com.xworkz.dress.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.xworkz.dress.constants.SqlCredentials;



public class DBUtils {
public static Connection getConnection() {
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(SqlCredentials.URL.getValue(), SqlCredentials.
					USERID.getValue(), SqlCredentials.PASSWORD.getValue());
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
