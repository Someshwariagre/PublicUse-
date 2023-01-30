package main.java.xworkz.spects.repo;

import java.util.List;


import main.java.xworkz.spects.dto.SpectsDto;

public interface SpectsRepo {
	
	public boolean save(SpectsDto dto);
	public List<SpectsDto> readAll();
	 public SpectsDto findByShapeAndprice(String shape, int price);
	 public boolean updatePriceByName(int price, String name);
	 public boolean updateColorByPriceAndShape(String colour, int price, String shape);
	 public boolean deleteByPriceAndColor(int price, String colour);
	 public boolean DeleteByNameAndId(String name, int id);

}
