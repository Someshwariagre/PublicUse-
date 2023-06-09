package com.xoworkz.film.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.xoworkz.film.dto.FilmDto;
import com.xoworkz.film.repo.FilmRepo;
@Service
public class FilmServiceImpl implements FilmService {

	public FilmServiceImpl() {
		System.out.println("created from" + this.getClass().getSimpleName());
	}

	@Autowired
	private FilmRepo repo;

	@Override
	public boolean save(FilmDto dto, Model model) {
		if (dto != null && dto.getName().length() > 4) {
			
			return repo.save(dto, model);
		}
		return false;
		

	}

}
