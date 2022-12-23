package com.xworkz.laptop;

import java.util.ArrayList;

import com.xworkz.Service.LaptopService;
import com.xworkz.Service.LaptopServiceImpl;


public class LaptopRunner {
	public static void main(String[] args) {
		
	
	LaptopService ls = new LaptopServiceImpl();
	
	ArrayList<LaptopDTO> laptop = new ArrayList<LaptopDTO>();
	
     LaptopDTO dell = new LaptopDTO("Dell",35000,"24inch","8gb","i3","22H2","dh2239018dell","64bit","windows10","dell023");
     LaptopDTO lenevo = new LaptopDTO("Lenevo",45000,"32inch","16gb","i4","23H2","dh2239018lenevo","32bit","windows07","Lenevo021");
     LaptopDTO hp = new LaptopDTO("Hp",48000,"28inch","8gb","i2","24H2","dh2239018Hp","64bit","windows08","Hp024");
     LaptopDTO accer = new LaptopDTO("Accer",55000,"26inch","32gb","i5","26H2","dh2239018Accer","32bit","windows09","Accer025");
     LaptopDTO apple = new LaptopDTO("Apple",900000,"29inch","48gb","i4","27H2","dh2239018Apple","64bit","windows11","dApple028");
     LaptopDTO toshiba = new LaptopDTO("Toshiba",40000,"25inch","32gb","i3","28H2","dh2239018Toshiba","32bit","windows10","Toshiba026");
     LaptopDTO asus = new LaptopDTO("Asus",43000,"28inch","8gb","i5","29H2","dh2239018Asus","64bit","windows07","Asus027");
     LaptopDTO dezenbook = new LaptopDTO("Dezenbook",45000,"32inch","16gb","i3","28H2","dh2239018Dezenbook","32bit","windows08","Dezenbook029");
     LaptopDTO samsung = new LaptopDTO("Samsung",65000,"15inch","32gb","i5","27H2","dh2239018Samsung","64bit","windows09","Samsung031");
     LaptopDTO lg = new LaptopDTO("Lg",30000,"20inch","16gb","i4","25H2","dh2239018dLg","64bit","windows11","Lg034");
     LaptopDTO nokia = new LaptopDTO("Nokia",28000,"22inch","24gb","i5","28H2","dh2239018Nokia","64bit","windows10","Nokia098");
     
     laptop.add(dezenbook);
     laptop.add(apple);
     laptop.add(accer);
     laptop.add(lenevo);
     laptop.add(dell);
     laptop.add(nokia);
     laptop.add(lg);
     laptop.add(samsung);
     laptop.add(asus);
     laptop.add(toshiba);
     laptop.add(hp);
     
     ls.save(nokia);
     ls.save(dezenbook);
     ls.save(apple);
     ls.save(accer);
     ls.save(lenevo);
     ls.save(dell);
     ls.save(lg);
     ls.save(samsung);
     ls.save(asus);
     ls.save(toshiba);
     ls.save(hp);
     
     ArrayList<LaptopDTO> dto = ls.read();
   for (LaptopDTO lapydto : dto) {
	   System.out.println(lapydto);	
}

          ls.findBy("Lenevo") ;
          
         
          LaptopDTO laptop1 = ls.deleteByIndex(4);
          for (LaptopDTO laptopDTO : dto) {
			System.out.println(laptopDTO);
		}
          
        ls.updateNameByIndex(1,"phonix") ;
       for (LaptopDTO laptopDTO : dto) {
    	   System.out.println(laptopDTO);
		
	}
          
     
}
}