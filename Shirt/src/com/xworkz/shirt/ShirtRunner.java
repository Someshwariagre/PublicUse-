package com.xworkz.shirt;

import java.util.List;

import com.xworkz.shirt.dto.ShirtDto;
import com.xworkz.shirt.repo.ShirtRepo;
import com.xworkz.shirt.repo.ShirtRepoImpl;

public class ShirtRunner {
	public static void main(String[] args) {
		
		ShirtRepo repo = new ShirtRepoImpl();
		
		ShirtDto puma = new ShirtDto(2,"puma","pink","XL",true);
		ShirtDto Addidas = new ShirtDto(3,"Addidas","red","L",false);
		ShirtDto Mafti = new ShirtDto(4,"Mafti","White","S",true);
		ShirtDto peter = new ShirtDto(5,"Peter england","Orange","XXL",false);
		ShirtDto Alled = new ShirtDto(6,"Allen solly","blue","XS",false);
//		
//	repo.save(Alled);
//	repo.save(peter);
//	repo.save(Mafti);
//	repo.save(Addidas);
//	repo.save(puma);
		
		
		
		 List<ShirtDto> dto =repo.read();
	        for (ShirtDto shirtDto : dto) {
				System.out.println(shirtDto);
			}
	        
	       System.out.println(repo.findNameAndId("puma", 2));
	       
	      System.out.println(repo.updateSizeByName("XL", "Mafti"));
	      
	      repo.deleteByColour("Orange");
	      
	      repo.deleteBySizeAndName("L", "Addidas");
		
	}
	
	   
	


}
