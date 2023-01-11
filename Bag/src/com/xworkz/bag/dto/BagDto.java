package com.xworkz.bag.dto;

public class BagDto {
	private int id ;
	private String brandname;
	private int capacity;
	private String colour;
	private int price;
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
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
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
	public BagDto(int id, String brandname, int capacity, String colour, int price) {
		super();
		this.id = id;
		this.brandname = brandname;
		this.capacity = capacity;
		this.colour = colour;
		this.price = price;
	}
	@Override
	public String toString() {
		return "BagDto [id=" + id + ", brandname=" + brandname + ", capacity=" + capacity + ", colour=" + colour
				+ ", price=" + price + "]";
	}

}
