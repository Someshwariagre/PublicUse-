package com.xworkz.watch.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.xworkz.watch.dto.WatchDto;

import com.xworkz.watch.util.DBUtil;

public class WatchRepoImpl implements WatchRepo {

	@Override
	public WatchDto save(WatchDto dto) {

		String query = "INSERT INTO watch_details values(?,?,?,?,?)";
		try (Connection connection = DBUtil.getConnection();
				PreparedStatement statement = connection.prepareStatement(query);) {

			statement.setInt(1, dto.getId());
			statement.setString(2, dto.getBrandName());
			statement.setString(3, dto.getColour());
			statement.setString(4, dto.getType());
			statement.setInt(5, dto.getPrice());

			statement.executeUpdate();

		}

		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return dto;
	}

	@Override
	public List<WatchDto> read() {
		String query = "SELECT * FROM watch_details";
		try (Connection connection = DBUtil.getConnection();
				PreparedStatement statement = connection.prepareStatement(query);) {
			ResultSet result = statement.executeQuery();
			List<WatchDto> list = new ArrayList<WatchDto>();
			while (result.next()) {

				int id = result.getInt(1);
				String name = result.getString(2);
				String colour = result.getString(3);
				String type = result.getString(4);
				int price = result.getInt(5);

				WatchDto dto = new WatchDto(id, name, colour, type, price);
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
	public List<WatchDto> findByBrandnameAndColour(String brandname, String colour) {
		String query = "Select * from watch_details where brandname =? and colour =?";
		try (Connection connection = DBUtil.getConnection();
				PreparedStatement statement = connection.prepareStatement(query);) {
			List<WatchDto> list = new ArrayList<WatchDto>();
			statement.setString(1, brandname);
			statement.setString(2, colour);
			ResultSet result = statement.executeQuery();
			while (result.next()) {

				int id = result.getInt(1);
				String name = result.getString(2);
				String colour1 = result.getString(3);
				String type = result.getString(4);
				int price = result.getInt(5);

				WatchDto dto = new WatchDto(id, name, colour, type, price);
				list.add(dto);
			}
			return list;

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public WatchDto findByIdandType(int id, String type) {
		String query = "Select * from watch_details where id =? and type =?";
		try (Connection connection = DBUtil.getConnection();
				PreparedStatement statement = connection.prepareStatement(query);) {

			statement.setInt(1, id);
			statement.setString(2, type);
			ResultSet result = statement.executeQuery();
			result.next();

			int id1 = result.getInt(1);
			String name = result.getString(2);
			String colour1 = result.getString(3);
			String type1 = result.getString(4);
			int price = result.getInt(5);

			WatchDto dto = new WatchDto(id1, name, colour1, type1, price);
			return dto;

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public boolean updateNameById(String name, int id) {
		String query = "UPDATE watch_details set brandname=? where id=?";
		try (Connection connection = DBUtil.getConnection();
				PreparedStatement statement = connection.prepareStatement(query);) {
			statement.setString(1, name);
			statement.setInt(2, id);

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
	public boolean deleteByColourAndType(String colour, String type) {
		String query = "DELETE FROM watch_details WHERE colour = ? and type=?";
		try (Connection connection = DBUtil.getConnection();
				PreparedStatement statement = connection.prepareStatement(query);) {
			statement.setString(1, colour);
			statement.setString(2, type);

			statement.executeUpdate();
			System.out.println("deleted by colour and type");

			return true;
		}

		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

}
