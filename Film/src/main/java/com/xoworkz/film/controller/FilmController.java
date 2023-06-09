package com.xoworkz.film.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.xoworkz.film.dto.FilmDto;
import com.xoworkz.film.service.FilmService;

@Controller
@RequestMapping("/")
public class FilmController {

	public FilmController() {
		System.out.println("created from" + this.getClass().getSimpleName());
	}

	@Autowired
	private FilmService service;

	@RequestMapping("/save")
	public String save(FilmDto dto, Model model) {
		System.out.println(dto);
		model.addAttribute("name", dto.getName());
		service.save(dto,model);
		return "success";

	}

}
