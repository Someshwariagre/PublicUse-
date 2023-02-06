package com.xworkz.pen;

import java.util.List;

import com.xworkz.pen.dto.PenDto;
import com.xworkz.pen.service.PenService;
import com.xworkz.pen.service.PenServiceImpl;

public class PenRunner {

	public static void main(String[] args) {
		PenService service = new PenServiceImpl();

		PenDto dto = new PenDto(1, "Cello", "Blue", 5, "Ball Pen");
		PenDto dto1 = new PenDto(2, "Renolds", "Black", 7, "Gel Pen");
		PenDto dto2 = new PenDto(3, "Brite", "Red", 8, "ink Pen");
		
//		service.save(dto2);
//		service.save(dto1);
//		service.save(dto);
		
		List<PenDto> list =  service.read();
      for (PenDto penDto : list) {
    	  System.out.println(penDto);
		
	}
	}

}
