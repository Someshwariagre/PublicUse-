package main.java.xworkz.spects.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
@Entity
@Table(name = "spects_details")
@NamedQuery(name="readAll" , query = "select read from SpectsDto read")
@NamedQuery(name = "findByShapeAndPrice", query = "select dto from SpectsDto dto where dto.shape=:sh and dto.price=:pr")
@NamedQuery(name = "updatePriceByName",query = "update SpectsDto specs set specs.price=:pri where specs.brandName=:nm")
@NamedQuery(name = "updateColorByPriceAndShape",query = "update SpectsDto sp set sp.colour=:cl where sp.price=:pric and sp.shape=:shp")
@NamedQuery(name = "deleteByPriceAndColor",query = "delete SpectsDto sp  where sp.price=:pc and sp.colour=:cr")
@NamedQuery(name = "DeleteByNameAndId",query = "delete SpectsDto dto  where dto.brandName=:nm and dto.id=:id")
public class SpectsDto {
	
	@Id
	private int id;
	private String brandName;
	private String colour;
	private int price;
	private String shape;
	
	
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	
	
	public SpectsDto(int id, String brandName, String colour, int price, String shape) {
		super();
		this.id = id;
		this.brandName = brandName;
		this.colour = colour;
		this.price = price;
		this.shape = shape;
	}
	
	public SpectsDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "SpectsDto [id=" + id + ", brandName=" + brandName + ", colour=" + colour + ", price=" + price
				+ ", shape=" + shape + "]";
	}
	

}
