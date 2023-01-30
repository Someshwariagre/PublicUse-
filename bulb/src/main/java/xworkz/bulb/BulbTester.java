package main.java.xworkz.bulb;

import java.util.List;

import main.java.xworkz.bulb.dto.BulbDto;
import main.java.xworkz.bulb.service.BulbService;
import main.java.xworkz.bulb.service.BulbServiceImpl;

public class BulbTester {
	
	public static void main(String[] args) {
		BulbService service = new BulbServiceImpl();
		  
		
		BulbDto dto = new BulbDto(1, "Nippo", "LED", "230rs", "30wt");
		BulbDto dto1 = new BulbDto(2, "Havells", "CFL", "200rs", "50wt");
		BulbDto dto2 = new BulbDto(3, "syska", "Tubelight", "230rs", "60wt");
		BulbDto dto3 = new BulbDto(4, "Osaram", "Hallogen", "220rs", "120wt");
		BulbDto dto4 = new BulbDto(5, "Flurosent", "LED", "100rs", "190wt");
		BulbDto dto5 = new BulbDto(6, "CFL", "CFL", "205rs", "200wt");
		BulbDto dto6 = new BulbDto(7, "Bajaj", "light", "27rs", "19wt");
		BulbDto dto7 = new BulbDto(8, "HPL", "Lamp", "29rs", "60wt");
		
//		
//		service.save(dto7);
//		service.save(dto6);
//		service.save(dto5);
//		service.save(dto4);
//		service.save(dto3);
//		service.save(dto2);
//		service.save(dto1);
//		service.save(dto);
//		
		
		
		List<BulbDto> list = service.readAll();
		for (BulbDto bulbDto : list) {
			System.out.println(bulbDto);
			
		}
		
		System.out.println(service.findByName("Havells"));
		
		
	}

}
