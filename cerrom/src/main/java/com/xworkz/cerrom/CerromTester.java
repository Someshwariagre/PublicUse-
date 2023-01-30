package main.java.com.xworkz.cerrom;

import main.java.com.xworkz.cerrom.dto.CerromDto;
import main.java.com.xworkz.cerrom.service.CerromService;
import main.java.com.xworkz.cerrom.service.CerromServiceImpl;

public class CerromTester {
	public static void main(String[] args) {
	
	CerromService service = new CerromServiceImpl();
	
	CerromDto dto = new CerromDto(1, "Deluxa", 2, "Black", 50);
	CerromDto dto1 = new CerromDto(2, "GSI", 4, "Red", 60);
	CerromDto dto2 = new CerromDto(3, "Siscaa", 3, "Brown", 70);
	CerromDto dto3 = new CerromDto(4, "Precise", 2, "Blue", 80);
	CerromDto dto4 = new CerromDto(5, "Synco", 4, "Black", 90);
	
	
//	service.save(dto4);
//	service.save(dto3);
//	service.save(dto2);
//	service.save(dto1);
//	service.save(dto);
	
	
	System.out.println(service.findById(3));
	
	System.out.println(service.updateNameById("Vinex", 4));
	
	service.DeleteById(5);
	
	}
}
