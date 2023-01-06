package com.xworkz.institues;

import java.util.List;

import com.xworkz.institues.dto.InstituesDTO;
import com.xworkz.institues.service.InstituesService;
import com.xworkz.institues.service.InstituesServiceIMPL;



public class InstituesRunner {
public static void main(String args[]) {
		
		InstituesService service=new InstituesServiceIMPL();
		
		InstituesDTO xworkZ=new InstituesDTO("XworkZ","BTM",5,20,"JavaDeveloping",4);
		InstituesDTO jspider=new InstituesDTO("Jspider","Rajajinagar",6,350,"JavaDeveloping",3);
		InstituesDTO kodnest=new InstituesDTO("Kodnest","BTM 2nd Stage",6,200,"Java Testing",3);
		InstituesDTO ethnus=new InstituesDTO("Ethnus","Jayanagar",6,50,"AWS",2);
		
		service.save(xworkZ);
		service.save(ethnus);
		service.save(kodnest);
		service.save(jspider);
		
//		System.out.println(service.save(jspider));
		
		 List<InstituesDTO> dto=service.read();
		 for (InstituesDTO instituesDTO : dto) {
			System.out.println(instituesDTO);
		}
		 
		service.findByNameandCourse("Kodnest", "Java Testing");
		
		boolean dto1=service.updateLocationByIndex("Rajajinagar", 0);
		  for (InstituesDTO instituesDTO : dto) {
			System.out.println(instituesDTO);
		}
		  boolean dto2=service.updateCourseByName("Python", "Kodnest");
		  for (InstituesDTO instituesDTO : dto) {
			  System.out.println(instituesDTO);
			
		}
		   boolean delete=service.deleteByrating(3);
		   for (InstituesDTO instituesDTO : dto) {
				  System.out.println(instituesDTO);
				  
				
			}
		   
		   
}
}


