package com.xworkz.shoes.dto;

public class ShoeDto {
	
	private int id ;
	private String brandname;
	private int size;
	private String colour;
	private int price;
	
	
	
	public ShoeDto(int id, String brandname, int size, String colour, int price) {
		super();
		this.id = id;
		this.brandname = brandname;
		this.size = size;
		this.colour = colour;
		this.price = price;
		
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrandname() {
		return brandname;
	}

	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ShoeDto [id=" + id + ", brandname=" + brandname + ", size=" + size + ", colour=" + colour + ", price="
				+ price + "]";
	}
	

}
