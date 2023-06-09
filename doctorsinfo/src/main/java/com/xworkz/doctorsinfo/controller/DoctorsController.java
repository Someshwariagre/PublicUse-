package com.xworkz.doctorsinfo.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.doctorsinfo.dto.DoctorsDto;
import com.xworkz.doctorsinfo.service.DoctorsService;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/")
@Slf4j

public class DoctorsController {
	@Autowired
	private DoctorsService service;

	public DoctorsController() {
		System.out.println("Running in controller");
	}

	private List<String> type = Arrays.asList("Night Shift","Morning shift", "Mid night Shift");

	@GetMapping("/doctors")
	public String getList(Model model) {
		System.out.println("Running in gettMapping");
		model.addAttribute("type", type);
		return "DoctorInfo";
	}

	@PostMapping("/doctors")
	public String getResult(Model model, DoctorsDto hDto) {
		System.out.println("Running in postMapping");
		Set<ConstraintViolation<DoctorsDto>> violations = this.service.validateAndSave(hDto);
		if (violations.isEmpty()) {
			System.out.println(" no Violation in controller");
			model.addAttribute("message", "Data Saved Sucessfully");
			model.addAttribute("type", type);
			model.addAttribute("message", "Data saved sucessfully");
			return "DoctorInfo";

		}
		model.addAttribute("errors", violations);
		model.addAttribute("type", type);
		model.addAttribute("messages", "Data not saved");
		return "DoctorInfo";
	}

	@GetMapping("/find")
	public String getFind(Model model, @RequestParam int id) {
		System.out.println("Running in find");
		DoctorsDto hDto = this.service.findById(id);
		if (hDto != null) {
			model.addAttribute("dto", hDto);
		} else {
			model.addAttribute("mesage", "Do not found ");
		}
		return "DoctorSerach";
	}

	@GetMapping("/delete")
	public String deleteBy(Model model, @RequestParam int id) {
		System.out.println("Running in delete");
		 this.service.deletById(id);
		if (id> 0) {
			System.out.println("dto in controller" + id);
			model.addAttribute("deleted", "Deleted sucessfully");
		} else {
			model.addAttribute("delete", "Delete failed ");
		}
		return "SearchByName";
	}

	@GetMapping("/searchByName")
	public String findByNameOFDoctors(Model model, @RequestParam String name) {
		List<DoctorsDto> hdto = this.service.findByName(name);
		model.addAttribute("lists", hdto);

		return "SearchByName";
	}

	@GetMapping("/update")
	public String update(Model model, @RequestParam int id) {
		System.out.println("Running in update get method");
		DoctorsDto hdto = this.service.findById(id);
		model.addAttribute("dto", hdto);
		model.addAttribute("type", type);
		return "UpdatePage";
	}

	@PostMapping("/update")
	public String onUpdate(Model model, DoctorsDto hdto) {
		Set<ConstraintViolation<DoctorsDto>> violations = this.service.updateAndSave(hdto);
		if (violations.size() > 0) {
			model.addAttribute("errors", violations);
		} else {
			model.addAttribute("message", "Details updated sucessfully");
		}

		return "UpdatePage";
	}
	@GetMapping("/findLists")
	public String findAll(Model model) {
		List<DoctorsDto> dtoList=this.service.findAll();
		model.addAttribute("lists",dtoList);
		System.out.println(""+dtoList.size());
		return "findall";
	}


}
