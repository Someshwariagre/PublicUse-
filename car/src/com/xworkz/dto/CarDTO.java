package com.xworkz.dto;

public class CarDTO {
	private String Brand;
	private int Price;
	private String colour;
	private String Type;
	private int Speed;
	
	public CarDTO() {
		System.out.println("By default constructor");
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CarDTO other = (CarDTO) obj;
		if (Brand == null) {
			if (other.Brand != null)
				return false;
		} else if (!Brand.equals(other.Brand))
			return false;
		if (Price != other.Price)
			return false;
		if (Speed != other.Speed)
			return false;
		if (Type == null) {
			if (other.Type != null)
				return false;
		} else if (!Type.equals(other.Type))
			return false;
		if (colour == null) {
			if (other.colour != null)
				return false;
		} else if (!colour.equals(other.colour))
			return false;
		return true;
	}
	public CarDTO(String brand, int price, String colour, String type, int speed) {
		super();
		Brand = brand;
		Price = price;
		this.colour = colour;
		Type = type;
		Speed = speed;
	}
	@Override
	public String toString() {
		return "CarDto [Brand=" + Brand + ", Price=" + Price + ", colour=" + colour + ", Type=" + Type + ", Speed="
				+ Speed + "]";
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public int getSpeed() {
		return Speed;
	}
	public void setSpeed(int speed) {
		Speed = speed;
	}

}
