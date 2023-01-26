package main.java.com.xworkz.cake;

import main.java.com.xworkz.cake.dto.CakeDto;
import main.java.com.xworkz.cake.service.CakeService;
import main.java.com.xworkz.cake.service.CakeServiceImpl;

public class CakeTester {
	
      public static void main(String[] args) {
		CakeService service = new CakeServiceImpl();
		
		
		CakeDto dto = new CakeDto(1, "pastrey", "1 kg", "brown", 550);
		CakeDto dto1 = new CakeDto(2, "Chocolate", "0.5 kg", "Dark brown", 600);
		CakeDto dto2 = new CakeDto(3, "Pista", "1.5 kg", "Green", 430);
		CakeDto dto3 = new CakeDto(4, "Vanila", "3 kg", "White", 700);
		CakeDto dto4 = new CakeDto(5, "Black forest", " 2 kg", "Black", 650);
		
//		service.save(dto4);
//		service.save(dto3);
//		service.save(dto2);
//		service.save(dto1);
//		service.save(dto);
		
//		System.out.println(service.findById(3));
		
		System.out.println(service.updateByName("Red valvet"));
		
		service.DeleteById(5);
		
		
	}

}
