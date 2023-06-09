package com.xoworkz.film.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "Film_Details")
public class FilmDto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "heroName")
	private String heroName;
	@Column(name = "Language")
	private String Language;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHeroName() {
		return heroName;
	}
	public void setHeroName(String heroName) {
		this.heroName = heroName;
	}
	public String getLanguage() {
		return Language;
	}
	public void setLanguage(String language) {
		Language = language;
	}
	public FilmDto(String name, String heroName, String language) {
		super();
		this.name = name;
		this.heroName = heroName;
		Language = language;
	}
	@Override
	public String toString() {
		return "FilmDto [id=" + id + ", name=" + name + ", heroName=" + heroName + ", Language=" + Language + "]";
	}
	public FilmDto() {
		super();
		System.out.println("Dto class is excuting");
	}
	
	
}
