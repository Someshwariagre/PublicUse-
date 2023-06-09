package com.xoworkz.film.repo;

import org.springframework.ui.Model;

import com.xoworkz.film.dto.FilmDto;

public interface FilmRepo {
	
	public boolean save(FilmDto dto, Model model);

}
