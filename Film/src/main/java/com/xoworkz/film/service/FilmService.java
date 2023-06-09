package com.xoworkz.film.service;

import org.springframework.ui.Model;

import com.xoworkz.film.dto.FilmDto;

public interface FilmService {
	
	public boolean save(FilmDto dto, Model model);

}
