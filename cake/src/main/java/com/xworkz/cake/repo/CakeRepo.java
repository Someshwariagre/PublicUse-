package main.java.com.xworkz.cake.repo;

import java.util.List;

import main.java.com.xworkz.cake.dto.CakeDto;

public interface CakeRepo {
	
	public boolean save(CakeDto dto);
	public CakeDto findById(int id);
	public List<CakeDto> readAll();
	public boolean updateNameById( String name,int id);
	public boolean DeleteById(int id);
	

}
