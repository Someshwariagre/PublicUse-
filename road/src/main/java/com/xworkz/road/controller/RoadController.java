package com.xworkz.road.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.road.dto.Roaddto;
import com.xworkz.road.repo.RoadRepo;
import com.xworkz.road.service.RoadService;
@Component
@RequestMapping("/")
public class RoadController {
	
	@Autowired
	private RoadService service;
	
	
	@RequestMapping("/sign")
	public String save(@RequestParam("name") String name, @RequestParam("distance") String distance,
			@RequestParam("from") String from, @RequestParam("to") String to, Roaddto dto, Model model) {
        System.out.println("sign in");
        this.service.save(dto, model);
		Roaddto dto1 = new Roaddto(name, distance, from, to);
        System.out.println(dto);
		return "success";
		
		
		
		
		
	
		
	  
  }

}
