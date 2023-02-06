package com.xworkz.pen.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.xworkz.pen.dto.PenDto;
import com.xworkz.pen.util.DBUtils;


public class PenRepoImpl implements PenRepo {

	@Override
	public boolean save(PenDto dto) {
	
		
	    String query = "Insert into Pen_details values(?,?,?,?,?)";
	    
	    try (Connection connect = DBUtils.getConnection();PreparedStatement ps = connect.prepareStatement(query);){
	    	
	    	
	    	ps.setInt(1, dto.getId());
	    	ps.setString(2, dto.getName());
	    	ps.setString(3, dto.getColour());
	    	ps.setInt(4, dto.getPrice());
	    	ps.setString(5, dto.getType());
	    	
	    	ps.executeUpdate();
	    	
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return true;
	}

	@Override
	public List<PenDto> read() {
		
		 String query = "Select * from Pen_details";
		 try (Connection connect = DBUtils.getConnection();PreparedStatement ps = connect.prepareStatement(query);){
			 ResultSet result = ps.executeQuery();
				List<PenDto> list = new ArrayList<PenDto>();
				while (result.next()) {
					int id = result.getInt(1);
					String name = result.getString(2);
					String colour = result.getString(3);
					int price = result.getInt(4);
					String type = result.getString(5);
					
					PenDto dto = new PenDto(id, name, colour, price, type);
					list.add(dto);
					return list;
				}
			 
		 } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		
		return null;
	}

	@Override
	public PenDto findById(int id) {
		String query = "Select * from pen_details where id=?";

		    
		    try (Connection connect = DBUtils.getConnection();PreparedStatement ps = connect.prepareStatement(query);){
		    	ps.setInt(1, id);
		    	 ResultSet rs = ps.executeQuery();
		    	 rs.getInt(id);
		    	
		    	
		    	
		    	
		return null;
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
			return null;

	
}
}
