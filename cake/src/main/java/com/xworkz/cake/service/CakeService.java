package main.java.com.xworkz.cake.service;

import java.util.List;

import main.java.com.xworkz.cake.dto.CakeDto;

public interface CakeService {
	
	public boolean save(CakeDto dto);
	public CakeDto findById(int id);
	public List<CakeDto> readAll();
	
	public boolean DeleteById(int id);
	public boolean updateNameById(String name, int id);

}
