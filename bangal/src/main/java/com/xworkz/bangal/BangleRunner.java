package main.java.com.xworkz.bangal;

import java.util.List;

import main.java.com.xworkz.bangal.dto.BangleDto;
import main.java.com.xworkz.bangal.service.BangleService;
import main.java.com.xworkz.bangal.service.BangleServiceImpl;

public class BangleRunner {
	public static void main(String[] args) {
		BangleService service = new BangleServiceImpl();
		
		BangleDto dto = new BangleDto("roldgold", "20-30");
		BangleDto dto1 = new BangleDto("Radhika", "40 - 50");
		BangleDto dto2 = new BangleDto("Goat bangle", "30-40");
		
//		service.save(dto2);
//		service.save(dto1);
//		service.save(dto);
		
		List<BangleDto>	list =service.readAll();
		for (BangleDto bangleDto : list) {
			System.out.println(bangleDto);
		}
		
	}

}
