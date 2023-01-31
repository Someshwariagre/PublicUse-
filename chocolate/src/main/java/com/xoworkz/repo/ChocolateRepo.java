package main.java.com.xoworkz.repo;

import java.util.List;

import main.java.com.xoworkz.dto.ChocolateDto;

public interface ChocolateRepo {
	
	public boolean createAll(ChocolateDto dto);
	public List<ChocolateDto> readAll();
	public ChocolateDto findByColourAndWieght(String colour,String wieght);
	public ChocolateDto  findByPriceAndName(int price, String name);
	public boolean updateWieghtByNameAndColour(String weight,String name,String colour);
	public boolean updateNameByIdAndWieght(String name, int id, String weight);
	public boolean deleteByColourAndName(String colour,String name);

}
