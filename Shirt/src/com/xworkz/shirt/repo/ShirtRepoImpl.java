package com.xworkz.shirt.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.xworkz.shirt.dto.ShirtDto;
import com.xworkz.shirt.util.DBUtil;

public class ShirtRepoImpl implements ShirtRepo {

	@Override
	public boolean save(ShirtDto dto) {

		String query = "INSERT INTO shirt_details values(?,?,?,?,?)";
		try (Connection connection = DBUtil.getConnection();
				PreparedStatement statement = connection.prepareStatement(query);) {

			statement.setInt(1, dto.getId());
			statement.setString(2, dto.getName());
			statement.setString(3, dto.getColour());
			statement.setString(4, dto.getSize());
			statement.setBoolean(5, dto.isHasPocket());

			statement.executeUpdate();
			statement.close();
			connection.close();

		}

		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public List<ShirtDto> read() {
		String query = "SELECT * FROM shirt_details";
		try (Connection connection = DBUtil.getConnection();
				PreparedStatement statement = connection.prepareStatement(query);) {
			ResultSet result = statement.executeQuery();
			List<ShirtDto> list = new ArrayList<ShirtDto>();
			while (result.next()) {
				int id = result.getInt(1);
				String name = result.getString(2);
				String colour = result.getString(3);
				String size = result.getString(4);
				boolean hasPocket = result.getBoolean(5);

				ShirtDto dto = new ShirtDto(id, name, colour, size, hasPocket);
				list.add(dto);

			}
			return list;
		}

		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public ShirtDto findNameAndId(String name, int id) {
		String query = "Select * from shirt_details where name =? and id =?";
		try (Connection connection = DBUtil.getConnection();
				PreparedStatement statement = connection.prepareStatement(query);) {

			statement.setString(1, name);
			statement.setInt(2, id);
			ResultSet result = statement.executeQuery();
			result.next();
			int id1 = result.getInt(1);
			String name1 = result.getString(2);
			String colour = result.getString(3);
			String size = result.getString(4);
			boolean hasPocket = result.getBoolean(5);

			ShirtDto dto = new ShirtDto(id, name, colour, size, hasPocket);

			return dto;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;

	}

	@Override
	public boolean updateSizeByName(String size, String name) {
		String query = "UPDATE shirt_details set size=? where name=?";
		try (Connection connection = DBUtil.getConnection();
				PreparedStatement statement = connection.prepareStatement(query);) {
			statement.setString(1, size);
			statement.setString(2, name);

			statement.executeUpdate();
			System.out.println("updated");
			
            return true;
		}

		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean deleteByColour(String colour) {
		String query = "DELETE FROM shirt_details WHERE colour=?";
		try (Connection connection = DBUtil.getConnection();
				PreparedStatement statement = connection.prepareStatement(query);) {
			statement.setString(1, colour);
			

			statement.executeUpdate();
			System.out.println("deleted");
			
            return true;
		}

		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean deleteBySizeAndName(String size, String name) {
		String query = "DELETE FROM shirt_details WHERE size = ? and name=?";
		try (Connection connection = DBUtil.getConnection();
				PreparedStatement statement = connection.prepareStatement(query);) {
			statement.setString(1, size);
			statement.setString(2,name);
			

			statement.executeUpdate();
			System.out.println("deleted by name and size");
			
            return true;
		}

		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
