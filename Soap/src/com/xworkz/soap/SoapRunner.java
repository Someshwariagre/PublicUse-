package com.xworkz.soap;

import java.util.List;

import com.xworkz.soap.dto.SoapDto;
import com.xworkz.soap.repo.SoapRepo;
import com.xworkz.soap.repo.SoapRepoImpl;

public class SoapRunner {
	public static void main(String[] args) {
		
	
	
	SoapRepo repo = new SoapRepoImpl();
	
	SoapDto dto = new SoapDto(1, "pears", "Orange", "sandal", "40gm", "aug-2022", "human", 45);
	SoapDto dto1 = new SoapDto(2, "Lux", "pink", "lotous", "30gm", "oct-2023", "human", 30);
	SoapDto dto2 = new SoapDto(3, "iilio", "orange", "Glycirin", "40gm", "sep-2021", "animal", 38);
	SoapDto dto3 = new SoapDto(4, "Lifeboy", "red", "detol", "20gm", "nov-2019", "human", 40);
	SoapDto dto4 = new SoapDto(5, "Liril", "white", "lilly", "35gm", "dec-2018", "human", 36);
	SoapDto dto5 = new SoapDto(6, "Santoor", "white", "sandal", "20gm", "jan-2019", "human", 25);
	SoapDto dto6 = new SoapDto(7, "rinbar", "blue", "lemon", "25gm", "feb-2016", "human", 35);
	SoapDto dto7 = new SoapDto(8, "surfexcel", "white", "neem", "15gm", "mar-2015", "human", 10);
	SoapDto dto8 = new SoapDto(9, "vim", "green", "vim", "28gm", "apr-2014", "human", 15);
	SoapDto dto9= new SoapDto(10, "medemix", "dark green", "neem", "50gm", "may-2013", "human", 30);
//	
//	repo.save(dto);
//	repo.save(dto1);
//	repo.save(dto2);
//	repo.save(dto3);
//	repo.save(dto4);
//	repo.save(dto5);
//	repo.save(dto6);
//	repo.save(dto7);
//	repo.save(dto8);
//	repo.save(dto9);
	
//	
//	 List<SoapDto> dtos=repo.read();
//	 for (SoapDto soapDto : dtos) {
//		System.out.println(soapDto);
//	}
//	 
//	 
	 System.out.println(repo.findNameandPrice("medemix", 30));
//	 
//	 repo.updatePriceByName(10, "dove");
//	for (SoapDto soapDto : dtos) {
//		System.out.println(soapDto);
//	}
//	
//	repo.updateColourAndfragranceByName("black", "charcoal", "Lifeboy");
//	 for (SoapDto soapDto : dtos) {
//		System.out.println(soapDto);
//		
//	}
	 
//	 repo.updateTypeById("Human", 3);
//	for (SoapDto soapDto : dtos) {
//		System.out.println(soapDto);
//	}
	 
	
	}
}
