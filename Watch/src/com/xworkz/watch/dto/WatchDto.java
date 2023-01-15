package com.xworkz.watch.dto;

public class WatchDto {
	private int id;
	private String brandName;
	private String colour;
	private String type;
	private int price;
	
	

	   public WatchDto(int id, String brandName, String colour, String type, int price) {
		super();
		this.id = id;
		this.brandName = brandName;
		this.colour = colour;
		this.type = type;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
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
	@Override
	public String toString() {
		return "WatchDto [id=" + id + ", brandName=" + brandName + ", colour=" + colour + ", type=" + type + ", price="
				+ price + "]";
	}
	
	

}
