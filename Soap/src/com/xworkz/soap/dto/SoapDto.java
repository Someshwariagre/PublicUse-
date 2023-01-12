package com.xworkz.soap.dto;

public class SoapDto {
	
	private int id;
	private String name;
	private String colour;
	private String fragrance;
	private String wieghtInGrams;
	private String manfucturedDate;
	private String type;
	private int price;
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
	public String getFragrance() {
		return fragrance;
	}
	public void setFragrance(String fragrance) {
		this.fragrance = fragrance;
	}
	public String getWieghtInGrams() {
		return wieghtInGrams;
	}
	public void setWieghtInGrams(String wieghtInGrams) {
		this.wieghtInGrams = wieghtInGrams;
	}
	public String getManfucturedDate() {
		return manfucturedDate;
	}
	public void setManfucturedDate(String manfucturedDate) {
		this.manfucturedDate = manfucturedDate;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public SoapDto(int id, String name, String colour, String fragrance, String wieghtInGrams, String manfucturedDate,
			String type, int price) {
		super();
		this.id = id;
		this.name = name;
		this.colour = colour;
		this.fragrance = fragrance;
		this.wieghtInGrams = wieghtInGrams;
		this.manfucturedDate = manfucturedDate;
		this.type = type;
		this.price = price;
	}
	@Override
	public String toString() {
		return "SoapDto [id=" + id + ", name=" + name + ", colour=" + colour + ", fragrance=" + fragrance
				+ ", wieghtInGrams=" + wieghtInGrams + ", manfucturedDate=" + manfucturedDate + ", type=" + type
				+ ", price=" + price + "]";
	}

}
