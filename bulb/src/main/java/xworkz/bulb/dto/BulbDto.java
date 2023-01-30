package main.java.xworkz.bulb.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
@Entity
@Table(name = "bulb_details")
@NamedQuery(name = "findByName", query = "select dto from BulbDto dto where dto.name=:rf")
@NamedQuery(name="readAll",query = "select read from BulbDto read")

public class BulbDto {
	@Id
	private int id;
	private String name;
	private String type;
	private String price;
	private String watt;
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
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getWatt() {
		return watt;
	}
	public void setWatt(String watt) {
		this.watt = watt;
	}
	public BulbDto(int id, String name, String type, String price, String watt) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.price = price;
		this.watt = watt;
	}
	public BulbDto() {
		super();
		
	}
	@Override
	public String toString() {
		return "BulbDto [id=" + id + ", name=" + name + ", type=" + type + ", price=" + price + ", watt=" + watt + "]";
	}
	
	

}
