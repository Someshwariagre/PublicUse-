package main.java.com.xoworkz.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "chocolate_details")
@NamedQuery(name="readAll" , query = "select read from ChocolateDto read")
@NamedQuery(name = "findByColourAndWieght", query = "select dto from ChocolateDto dto where dto.colour=:cl and dto.wieght=:wt")
@NamedQuery(name = "findByPriceAndName",query = "Select dto from ChocolateDto dto where dto.price=:pr and dto.name=:nm")
@NamedQuery(name = "updateWieghtByNameAndColour",query = "update ChocolateDto choco set choco.wieght=:wt where choco.name=:nm and choco.colour=:cl")
@NamedQuery(name = "updateNameByIdAndWieght",query = "update ChocolateDto dto set dto.name=:nm where dto.id=:id and dto.wieght=:wt")
@NamedQuery(name = "deleteByColourAndName",query = "delete ChocolateDto dto  where dto.colour=:cl and dto.name=:nm")



public class ChocolateDto {
	@Id
	private int id;
	private String name;
	private String colour;
	private int price;
	private String wieght;
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
	public String getWieght() {
		return wieght;
	}
	public void setWieght(String wieght) {
		this.wieght = wieght;
	}
	public ChocolateDto(int id, String name, String colour, int price, String wieght) {
		super();
		this.id = id;
		this.name = name;
		this.colour = colour;
		this.price = price;
		this.wieght = wieght;
	}
	public ChocolateDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ChocolateDto [id=" + id + ", name=" + name + ", colour=" + colour + ", price=" + price + ", wieght="
				+ wieght + "]";
	}
	
	

}
