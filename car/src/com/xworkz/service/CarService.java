package com.xworkz.service;

import java.util.List;

import com.xworkz.dto.CarDTO;

public interface CarService {
public boolean save(CarDTO dto);
	
	public List<CarDTO> read();
	
	public List<CarDTO> findByName(String name);
	
	public CarDTO updateColorByIndex(String color,int index);
	
	public CarDTO updateSpeedByBrand(int speed,String brand);
	
	public CarDTO updatePricedByType(int price,String type);
	
	public CarDTO deleteByIndex(int index);
	
	public CarDTO deleteBrandByColour(String colour,String brand);
}
