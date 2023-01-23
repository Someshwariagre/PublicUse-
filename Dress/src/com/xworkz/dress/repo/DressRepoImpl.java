package com.xworkz.dress.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;



import com.xworkz.dress.dto.DressDto;
import com.xworkz.dress.utils.DBUtils;

public class DressRepoImpl implements DressRepo {

	@Override
	public boolean save(DressDto dto) {

		String query = "INSERT INTO dress values(?,?,?)";
		try (Connection connection = DBUtils.getConnection();
				PreparedStatement statement = connection.prepareStatement(query);) {
			statement.setInt(1, dto.getId());
			statement.setString(2, dto.getName());
			statement.setString(3, dto.getType());

			statement.executeUpdate();
		}

		catch (SQLException e) {

			e.printStackTrace();
		}

		return false;

	}

}
