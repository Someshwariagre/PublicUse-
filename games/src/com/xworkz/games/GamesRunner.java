package com.xworkz.games;


import java.util.ArrayList;
import java.util.List;
import com.xworkz.service.GameService;
import com.xworkz.service.GameServiceIMPL;

public class GamesRunner {
	public static void main(String[] args) {
	
	GameService service=new GameServiceIMPL();
	
	GamesDTO cricket=new GamesDTO("Cricket", "Outdoor",11, true, "Bengalore", "7:30 pm");
	GamesDTO football=new GamesDTO("Football", "Outdoor",6, false, "Chennai", "8:30 pm");
	GamesDTO chess=new GamesDTO("Chess", "Indoor",2, true, "Belgavi", "3:00 pm");
	GamesDTO carrom=new GamesDTO("Carrom", "Indoor",4, false, "Kalburagi", "4:00 pm");
	GamesDTO volleyball=new GamesDTO("Volleyball", "Outdoor",6, true, "Mysore", "5:30 pm");
	
	service.save(volleyball);
	service.save(carrom);
	service.save(chess);
	service.save(football);
	service.save(cricket);
	
    List<GamesDTO> dto = service.read();
   for (GamesDTO gd : dto) {
	   System.out.println(gd);	
}
	
	service.findByName("Chess");
	
	service.updategameNameByIndex("Tennies", 2);
	
	  GamesDTO gamedto = service.deleteByIndex(4);
      for (GamesDTO gamesdto : dto) {
		System.out.println(gamesdto);
	}
	
	System.out.println(service.updatenoOfPlayerByName("Carrom",2));
	System.out.println(dto);
	
	
	  List<GamesDTO> gamedto1 =service.deletelocationByName("Belgavi", "Tennies");
	 for (GamesDTO gamedto11 : dto) {
		System.out.println(gamedto11);
	}


}
}
