package main.java.com.xworkz.cake.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Table(name = "Cake_Details")
@Data
public class CakeDto {
	@Id
	private int id;
	private String name;
	private String wieght;
	private String colour;
	private int price;
	
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
	
	
	

}
