package main.java.com.xoworkz;

import java.util.Arrays;
import java.util.List;

import main.java.com.xoworkz.dto.ChocolateDto;
import main.java.com.xoworkz.service.ChocolateService;
import main.java.com.xoworkz.service.ChocolateServiceImpl;

public class ChocolateTester {
	public static void main(String[] args) {
		ChocolateService service = new ChocolateServiceImpl();
		
		ChocolateDto dto = new ChocolateDto(1, "Kopiko", "Brown", 8, "10gm");
		ChocolateDto dto1 = new ChocolateDto(2, "Eclairs", "Light Brown", 12, "13gm");
		ChocolateDto dto2 = new ChocolateDto(3, "KitKat", "Black", 15, "14gm");
		ChocolateDto dto3 = new ChocolateDto(4, "MilkyBar", "White", 25, "15gm");
		ChocolateDto dto4 = new ChocolateDto(6, "DairyMilk", "Brown", 80, "16gm");
		
//		service.createAll(dto4);
//		service.createAll(dto3);
//		service.createAll(dto2);
//		service.createAll(dto1);
		
//	List<ChocolateDto>	list =service.readAll();
//	for (ChocolateDto chocolateDto : list) {
//     System.out.println(chocolateDto);		
//	}
//		
//		System.out.println(service.findByColourAndWieght("Black", "14gm"));
//		
//		System.out.println(service.findByPriceAndName(80, "DairyMilk"));
//		
		System.out.println(service.updateWieghtByNameAndColour("18gm", "MilkyBar", "White"));
//		
//		System.out.println(service.updateNameByIdAndWieght("perk", 3, "14gm"));
//		
		service.deleteByColourAndName("White", "MilkyBar");
	}

}
