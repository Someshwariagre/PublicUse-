package main.java.xworkz.spects;

import java.util.List;

import main.java.xworkz.spects.dto.SpectsDto;
import main.java.xworkz.spects.service.SpectsService;
import main.java.xworkz.spects.service.SpectsServiceImpl;

public class SpectsTester {
	
	public static void main(String[] args) {
		 SpectsService service = new SpectsServiceImpl();
		 
		 SpectsDto dto = new SpectsDto(1, "Lenskart", "White", 1800, "Round");
		 SpectsDto dto1 = new SpectsDto(2, "CoolWinks", "Golden", 2300, "ovel");
		 SpectsDto dto2 = new SpectsDto(3, "polard", "Black", 1500, "square");
		 SpectsDto dto3 = new SpectsDto(4, "prada", "Brown", 3000, "Round");
		 SpectsDto dto4 = new SpectsDto(5, "Carrera", "Silver", 2900, "Rectangle");
		 
//		 service.save(dto4);
//		 service.save(dto3);
//		 service.save(dto2);
//		 service.save(dto1);
//		 service.save(dto);
		 
		 List<SpectsDto> list = service.readAll();
		  for (SpectsDto spectsDto : list) {
			  System.out.println(spectsDto);
			
		}
		 
		 System.out.println(service.findByShapeAndprice("ovel", 2300));
		 
         System.out.println( service.updatePriceByName(2800, "Carrera"));
		 
		 System.out.println(service.updateColorByPriceAndShape("red", 1500, "square"));
		 
		 System.out.println(service.deleteByPriceAndColor(1800, "White"));
		 
		 System.out.println(service.DeleteByNameAndId("polard", 3));
	}

}
