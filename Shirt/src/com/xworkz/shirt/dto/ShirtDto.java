package com.xworkz.shirt.dto;

public class ShirtDto {
	private int id ;
	private String name;
	private String colour;
	private String size;
	private boolean hasPocket;
	
	public ShirtDto(int id, String name, String colour, String size, boolean hasPocket) {
		super();
		this.id = id;
		this.name = name;
		this.colour = colour;
		this.size = size;
		this.hasPocket = hasPocket;
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
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public boolean isHasPocket() {
		return hasPocket;
	}
	public void setHasPocket(boolean hasPocket) {
		this.hasPocket = hasPocket;
	}
	@Override
	public String toString() {
		return "ShirtDto [id=" + id + ", name=" + name + ", colour=" + colour + ", size=" + size + ", hasPocket="
				+ hasPocket + "]";
	}
	
	

}
