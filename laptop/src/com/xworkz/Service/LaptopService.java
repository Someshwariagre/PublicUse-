package com.xworkz.Service;

import java.util.ArrayList;

import com.xworkz.laptop.LaptopDTO;


public interface LaptopService {
	 LaptopDTO save(LaptopDTO laptopdto);
     ArrayList<LaptopDTO> read();
     LaptopDTO findBy(String name);
     public LaptopDTO deleteByIndex(int index);
     LaptopDTO updateNameByIndex(int index, String name);
}
