package main.java.com.xworkz.ornament;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



import main.java.com.xworkz.ornament.config.OrnamentConfig;
import main.java.com.xworkz.ornament.dto.OrnamentDto;
import main.java.com.xworkz.ornament.service.OrnamentService;
import main.java.com.xworkz.ornament.service.OrnamentServiceImpl;

public class OrnamentRunner {

	public static void main(String[] args) {
		ApplicationContext context  = new AnnotationConfigApplicationContext(OrnamentConfig.class);
	
	OrnamentDto dto3 = new OrnamentDto("Neclase", "gold", 40000, "Golden", 10, 30);
	OrnamentDto dto1 = new OrnamentDto("Earring", "silver", 400, "white",5 , 20);
	OrnamentDto dto2 = new OrnamentDto("fingerring", "Platinum", 250000, "Silver",40 ,50);
	
	OrnamentService service =context.getBean(OrnamentServiceImpl.class);
//	service.save(dto1);
//    service.save(dto3);
//	service.save(dto2);
	
	List<OrnamentDto>list=service.readAll();
	for (OrnamentDto ornamentDto : list) {
		System.out.println(ornamentDto);
	}
	
	System.out.println(service.updateTypeByName("Dimond", "Earring"));
	
	
	service.deleteByColourAndName("white", "Earring");

	
	}
}
