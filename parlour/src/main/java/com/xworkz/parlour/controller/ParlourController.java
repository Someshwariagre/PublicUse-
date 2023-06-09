package com.xworkz.parlour.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.parlour.dto.ParlourDto;
import com.xworkz.parlour.service.ParlourService;

@Controller
@RequestMapping("/")
public class ParlourController {
	public ParlourController() {
		System.out.println("running in controller");
	}

	@Autowired
	private ParlourService service;

	@GetMapping("/datasave")
	public String onSave(Model model, ParlourDto dto) {
		boolean save = this.service.onSave(dto);
		if (save) {
			model.addAttribute("msg", "Data saved successfully");
		}
		return "index";
	}

	@GetMapping("/findById")
	public String findById(Model model, @RequestParam int id) {
		ParlourDto dto = this.service.findById(id);
		System.out.println("Entity in controller  " + dto);
		if (dto != null) {
			model.addAttribute("dto", dto);
		} else {
			model.addAttribute("msg", "Data Not Found");
		}

		return "FindById";

	}

	@PostMapping("/findByName")
	public String findByName(Model model, String name) {
		List<ParlourDto> list = this.service.findByName(name);
		if (list != null) {
			System.out.println(list);
			model.addAttribute("list", list);
		}
		return "FindById";

	}
	@GetMapping("/findAll")
	public String readAll(Model model) {
		List<ParlourDto> list=this.service.findAll();
		model.addAttribute("list", list);
		return "FindById";
		
	}

	@GetMapping("/update")
	public String updateById(Model model, int id) {
		ParlourDto dto = this.service.findById(id);
		if (dto != null) {
			model.addAttribute("dto", dto);
		}
		return "update";
	}
	@PostMapping("/update")
	public String updateByAll(Model model , ParlourDto pdto) {
		boolean up =this.service.onUpdate(pdto);
		model.addAttribute("msg",up);
		return "update";
	}
	@GetMapping("/delete")
	public String onDelete(Model model, int id) {
		this.service.onDelete(id);
		model.addAttribute("msg","deleted Successfully");
		return "update";	
	}
	
	

}
