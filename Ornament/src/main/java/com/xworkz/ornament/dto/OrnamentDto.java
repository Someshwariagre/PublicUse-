package main.java.com.xworkz.ornament.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "ornament_details")
@NamedQuery(name="readAll" , query = "select read from OrnamentDto read")
@NamedQuery(name = "updateTypeByName",query = "update OrnamentDto dto set dto.type=:tp where dto.name=:nm")
@NamedQuery(name = "deleteByColourAndName",query = "delete OrnamentDto dto  where dto.colour=:cl and dto.name=:nm")

public class OrnamentDto {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
    private int id;
	private String name;
	private String type;
	private int price;
	private String colour;
	private int yearsOfguarantee;
	private int size;
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
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getYearsOfguarantee() {
		return yearsOfguarantee;
	}
	public void setYearsOfguarantee(int yearsOfguarantee) {
		this.yearsOfguarantee = yearsOfguarantee;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public OrnamentDto(String name, String type, int price, String colour, int yearsOfguarantee, int size) {
		super();
		this.name = name;
		this.type = type;
		this.price = price;
		this.colour = colour;
		this.yearsOfguarantee = yearsOfguarantee;
		this.size = size;
	}
	public OrnamentDto() {
		super();
		
	}
	@Override
	public String toString() {
		return "OrnamentDto [id=" + id + ", name=" + name + ", type=" + type + ", price=" + price + ", colour=" + colour
				+ ", yearsOfguarantee=" + yearsOfguarantee + ", size=" + size + "]";
	}
	
	

}
