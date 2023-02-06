package com.xworkz.pen.dto;

public class PenDto {

	private int id;
	private String name;
	private String colour;
	private int price;
    private String type;
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
	public PenDto(int id, String name, String colour, int price, String type) {
		super();
		this.id = id;
		this.name = name;
		this.colour = colour;
		this.price = price;
		this.type = type;
	}
	public PenDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "PenDto [id=" + id + ", name=" + name + ", colour=" + colour + ", price=" + price + ", type=" + type
				+ "]";
	}
    
    
    
    
}
