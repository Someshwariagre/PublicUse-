package com.xworkz.Repository;

import java.util.ArrayList;

import com.xworkz.laptop.LaptopDTO;



public interface LaptopRepository {
	  ArrayList<LaptopDTO> save(LaptopDTO laptopDto);
	   ArrayList<LaptopDTO> findBy(String name);
	   ArrayList<LaptopDTO> read();
	   public boolean deleteByIndex(int index);
	   public ArrayList<LaptopDTO> updateNameByIndex(int index, String name);

}
