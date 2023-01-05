package com.xworkz.dto;

import java.util.ArrayList;
import java.util.List;


import com.xworkz.service.CarService;
import com.xworkz.service.CarServiceIMPL;

public class CarRunner {
public static void main(String agrs[]) {
		
		CarService service = new CarServiceIMPL();
		
		CarDTO audi =new CarDTO("Audi",187700,"Black","Top",100);
		CarDTO inova =new CarDTO("Inova",1100000,"White","City",80);
		CarDTO indica =new CarDTO("Indica",1300000,"Grey","Top",50);
		CarDTO benz =new CarDTO("Benz",1200000,"Orange","Top",90);
		CarDTO maruti800 =new CarDTO("Maruti800",2000000,"Yellow","Basic",85);
		CarDTO nano =new CarDTO("Nano",139000,"red","Basic",150);
		CarDTO duster =new CarDTO("Duster",283478937,"Brown","Basic",150);
		CarDTO i10 =new CarDTO("I10",238384,"Light orange","Basic",180);
		
		service.save(audi);
 	    service.save(inova);
	    service.save(indica);
	    service.save(benz);
	    service.save(maruti800);
	    service.save(i10);
	    service.save(duster);
	    service.save(nano);
	    
		
	    List<CarDTO> dto =service.read();
	    for (CarDTO carDTO : dto) {
			System.out.println(carDTO);
		}

	  service.findByName("Audi");

   CarDTO car = service.updateColorByIndex("Blue", 1);
    for (CarDTO carDTO : dto) {
	System.out.println(carDTO);
}

  
       CarDTO update = service.updateSpeedByBrand(120, "Indica");
       for (CarDTO carDTO : dto) {
		System.out.println(carDTO);
	}
      
	CarDTO   price = service.updatePricedByType(9482540, "Basic");
	for (CarDTO carDTO : dto) {
		System.out.println(carDTO);
	}

	CarDTO del=service.deleteByIndex(3);
	     for (CarDTO carDTO : dto) {
			System.out.println(carDTO);
		}

	     CarDTO delete =service.deleteBrandByColour("Brown", "Duster");
         for (CarDTO carDTO : dto) {
	      System.out.println(carDTO);
          }
	
	}

}
