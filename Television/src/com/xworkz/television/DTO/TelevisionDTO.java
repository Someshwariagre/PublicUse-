package com.xworkz.television.DTO;

public class TelevisionDTO {
    private String brand;
    private String colour;
    private int price;
    private String type;
    private String size;
	

	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public TelevisionDTO(String brand,  String colour, int price, String type, String size) {
		super();
		this.brand = brand;
	    this.colour = colour;
		this.price = price;
		this.type = type;
		this.size = size;
	}
	@Override
	public String toString() {
		return "TelevisionDTO [brand=" + brand + ", colour=" + colour + ", price=" + price + ", type=" + type
				+ ", size=" + size + "]";
	}
	
    
}
