package com.xworkz.soap.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.xworkz.soap.constants.SqlCredentials;
import com.xworkz.soap.dto.SoapDto;

public class SoapRepoImpl implements SoapRepo {

	@Override
	public boolean save(SoapDto dto) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connect = DriverManager.getConnection(SqlCredentials.URL.getValue(),
					SqlCredentials.USERID.getValue(), SqlCredentials.PASSWORD.getValue());

			String querry = "INSERT INTO soap_details VALUE(?,?,?,?,?,?,?,?)";
			PreparedStatement statement = connect.prepareStatement(querry);

			statement.setInt(1, dto.getId());
			statement.setString(2, dto.getName());
			statement.setString(3, dto.getColour());
			statement.setString(4, dto.getFragrance());
			statement.setString(5, dto.getWieghtInGrams());
			statement.setString(6, dto.getManfucturedDate());
			statement.setString(7, dto.getType());
			statement.setInt(8, dto.getPrice());

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
	public List<SoapDto> read() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection(SqlCredentials.URL.getValue(),
					SqlCredentials.USERID.getValue(), SqlCredentials.PASSWORD.getValue());

			String querry = "SELECT * FROM soap_details";
			PreparedStatement statement = connect.prepareStatement(querry);

			ResultSet result = statement.executeQuery();
			List<SoapDto> list = new ArrayList<SoapDto>();
			while (result.next()) {
				int id = result.getInt("id");
				String name = result.getString("name");
				String colour = result.getString("colour");
				String fragrance = result.getString("fragrance");
				int wieghtInGrams = result.getInt(5);
				String manfucturedDate = result.getString("manfucturedDate");
				String type = result.getString("type");
				int price = result.getInt("price");

				SoapDto soap = new SoapDto(id, name, colour, fragrance, fragrance, manfucturedDate, type, price);
				list.add(soap);

			}
			statement.close();
			connect.close();
			return list;

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public SoapDto findNameandPrice(String name, int price) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection(SqlCredentials.URL.getValue(),
					SqlCredentials.USERID.getValue(), SqlCredentials.PASSWORD.getValue());

			String querry = "SELECT * FROM soap_details where name = ? and price = ?";
			PreparedStatement statement = connect.prepareStatement(querry);
			statement.setString(1, name);
			statement.setInt(2, price);

			ResultSet result = statement.executeQuery();
			List<SoapDto> list = new ArrayList<SoapDto>();
			while (result.next()) {
				int id = result.getInt("id");
				String name1 = result.getString("name");
				String colour = result.getString("colour");
				String fragrance = result.getString("fragrance");
				String wieghtInGrams = result.getString("wieghtInGrams");
				String manfucturedDate = result.getString("manfucturedDate");
				String type = result.getString("type");
				int price1 = result.getInt("price");

				SoapDto soap = new SoapDto(id, name, colour, fragrance, wieghtInGrams, manfucturedDate, type, price);
				return soap;

			}

			statement.close();
			connect.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean updatePriceByName(int price, String name) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection(SqlCredentials.URL.getValue(),
					SqlCredentials.USERID.getValue(), SqlCredentials.PASSWORD.getValue());

			String querry = "UPDATE soap_details set name=? where price=?";
			PreparedStatement statement = connect.prepareStatement(querry);
			statement.setString(1, name);
			statement.setInt(2, price);
			
			statement.executeUpdate();
			statement.close();
			connect.close();
			return true;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean updateColourAndfragranceByName(String colour, String fragrance, String name) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection(SqlCredentials.URL.getValue(),
					SqlCredentials.USERID.getValue(), SqlCredentials.PASSWORD.getValue());

			String querry = "UPDATE soap_details set colour=? ,fragrance=? where name=?";
			PreparedStatement statement = connect.prepareStatement(querry);
			statement.setString(1, colour);
			statement.setString(2, fragrance);
			statement.setString(3, name);
			
			statement.executeUpdate();
			statement.close();
			connect.close();
			return true;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean updateTypeById(String type, int id) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection(SqlCredentials.URL.getValue(),
					SqlCredentials.USERID.getValue(), SqlCredentials.PASSWORD.getValue());

			String querry = "UPDATE soap_details set type=? where id=?";
			PreparedStatement statement = connect.prepareStatement(querry);
			statement.setString(1, type);
			statement.setInt(2, id);
			
			statement.executeUpdate();
			statement.close();
			connect.close();
			return true;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
