package com.xworkz.pencil.dto;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;

import lombok.NoArgsConstructor;


@Entity

@NoArgsConstructor
@AllArgsConstructor
@Table(name = "pencil")


public class PencilDto {
	
	@Id
	private int id;
	private String name;
	private int price;
	private String type;
	private String size;
	
	
	public PencilDto(int id, String name, int price, String type, String size) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.type = type;
		this.size = size;
	}


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


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getSize() {
		return size;
	}


	public void setSize(String size) {
		this.size = size;
	}


	@Override
	public String toString() {
		return "PencilDto [id=" + id + ", name=" + name + ", price=" + price + ", type=" + type + ", size=" + size
				+ "]";
	}
	

}
