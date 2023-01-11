package com.xworkz.bag;

import com.xworkz.bag.dto.BagDto;
import com.xworkz.bag.repo.BagRepo;
import com.xworkz.bag.repo.BagRepoImpl;

public class Bagrunner {
	public static void main(String[] args) {
		BagRepo repo = new BagRepoImpl();
		
		BagDto dto = new BagDto(2,"Safari",5,"white",550);
		BagDto dto1 = new BagDto(3,"Alfa",7,"black",399);
		BagDto dto2 = new BagDto(4,"Nike",4,"Green",450);
		BagDto dto3 = new BagDto(5,"Addidas",7,"Red",560);
		BagDto dto4 = new BagDto(6,"Mystic",10,"Blue",560);
		
	
		repo.save(dto);
		repo.save(dto1);
		repo.save(dto2);
		repo.save(dto3);
		repo.save(dto4);
		
    	repo.read();
		
		System.out.println(repo.findByname("Safari"));
		
		System.out.println(repo.findByBrandnameAndId("Addidas", 5));
	}

}
