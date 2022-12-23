package com.xworkz.highway;

import java.util.ArrayList;

import com.xworkz.highservice.HighwayService;
import com.xworkz.highservice.HighwayServiceImpl;

public class HighwayRunner {
	public static void main(String[] args) {
		
	
	
	HighwayService highwayservice =new HighwayServiceImpl();
	
	
	
	ArrayList<HighwayDto> highway=new ArrayList<HighwayDto>();
	
	HighwayDto haveri= new HighwayDto("haveri",2,100,true);
	HighwayDto gadag =new HighwayDto("gadag",3,130,false);
	HighwayDto hubbali=new HighwayDto("hubbali",1,150,true);
	HighwayDto daravad=new HighwayDto("daravad",3,200,false);
	HighwayDto belagavi=new HighwayDto("belagavi",2,100,true);
	HighwayDto shimoga=new HighwayDto("shimoga",3,140,true);
	HighwayDto davageri=new HighwayDto("davageri",4,170,false);
	HighwayDto harihar=new HighwayDto("harihar",5,170,true);
	HighwayDto hphalli=new HighwayDto("hphalli",2,170,true);
	HighwayDto ranebenuru=new HighwayDto("ranebenuru",3,180,false);
	
	highway.add(ranebenuru);
	highway.add(davageri);
	highway.add(belagavi);
	highway.add(haveri);
	highway.add(hphalli);
	highway.add(harihar);
	highway.add(shimoga);
	highway.add(daravad);
	highway.add(hubbali);
	highway.add(gadag);
	
	highwayservice.save(ranebenuru);
	highwayservice.save(harihar);
	highwayservice.save(hphalli);
	highwayservice.save(davageri);
	highwayservice.save(shimoga);
	highwayservice.save(belagavi);
	highwayservice.save(daravad);
	highwayservice.save(hubbali);
	highwayservice.save(haveri);
	highwayservice.save(gadag);
	
	ArrayList<HighwayDto> high =highwayservice.read();
	for (HighwayDto highwayDto : high) {
		System.out.println(highwayDto);
	}
	highwayservice.findByName("ranebenuru");
	
	}

}
