package com.xworkz.television;

import java.util.ArrayList;

import com.xworkz.television.DTO.TelevisionDTO;
import com.xworkz.television.service.TelevisionService;
import com.xworkz.television.service.TelevisionServiceIMPL;

public class TelevisionRunner {
	public static void main(String[] args) {
		

	TelevisionService service = new TelevisionServiceIMPL();
	
	TelevisionDTO sony = new TelevisionDTO("Sony", "black",23000,"LED","22inch");
	TelevisionDTO hcl = new TelevisionDTO("HCL", "White",29999,"LED","34inch");
	TelevisionDTO samsung = new TelevisionDTO("Samsung", "grey",35000,"LCD","25inch");
	TelevisionDTO higer = new TelevisionDTO("Higer", "red",40000,"Normal","28inch");
//	TelevisionDTO  = new TelevisionDTO("Samsung", "blue",38000,"LED","32inch");
	
	service.save(higer);
	service.save(samsung);
	service.save(hcl);
	service.save(sony);
	
	 ArrayList<TelevisionDTO> dto=service.read();
	 for (TelevisionDTO televisionDTO : dto) {
		System.out.println(televisionDTO);
	}
	
	service.findByNameAndSize("Samsung", "25inch");
	
	service.findTypeAndColourByIndex("Normal", "red", 3);
	
	 TelevisionDTO update =service.updateSizeByType("32inch", "Normal");
	for (TelevisionDTO televisionDTO : dto) {
		System.out.println(televisionDTO);
	}
		
	    service.deleteByBrandAndColour("HCL", "White");
	   for ( TelevisionDTO televisionDTO: service.read()) {
		System.out.println(televisionDTO);
	}
	}
	}
	

