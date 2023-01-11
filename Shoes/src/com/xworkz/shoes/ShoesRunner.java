package com.xworkz.shoes;

import com.xworkz.shoes.dto.ShoeDto;
import com.xworkz.shoes.repo.ShoeRepo;
import com.xworkz.shoes.repo.ShoeRepoImpl;

public class ShoesRunner {
	public static void main(String[] args) {
		ShoeRepo repo = new ShoeRepoImpl();
		
		ShoeDto dto = new ShoeDto(2,"addidas",6,"white",550);
		ShoeDto dto1 = new ShoeDto(3,"Liberty",7,"black",399);
		ShoeDto dto2 = new ShoeDto(4,"Nike",8,"Green",450);
		ShoeDto dto3 = new ShoeDto(5,"Jgwar",7,"Red",560);
		
	
//		repo.save(dto);
//		repo.save(dto1);
//		repo.save(dto2);
//		repo.save(dto3);
		
//		repo.read();
		
//		System.out.println(repo.findByname("addidas"));
		
		System.out.println(repo.findByBrandnameAndId("addidas", 2));
	}

}
