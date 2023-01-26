package main.java.com.xworkz.cake.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "Cake_Details")

public class CakeDto {
	@Id
	private int id;
	private String name;
	private String wieght;
	private String colour;
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
	public String getWieght() {
		return wieght;
	}
	public void setWieght(String wieght) {
		this.wieght = wieght;
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
	public CakeDto(int id, String name, String wieght, String colour, int price) {
		super();
		this.id = id;
		this.name = name;
		this.wieght = wieght;
		this.colour = colour;
		this.price = price;
	}
	public CakeDto() {
		super();
		
	}
	@Override
	public String toString() {
		return "CakeDto [id=" + id + ", name=" + name + ", wieght=" + wieght + ", colour=" + colour + ", price=" + price
				+ "]";
	}
	
	

}
