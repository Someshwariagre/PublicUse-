package main.java.com.xworkz.bangal.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
@Entity
@Table(name = "Bangle_Details")
@NamedQuery(name="readAll" , query = "select read from BangleDto read")
public class BangleDto {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private int id;
	private String name;
	private String size;
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
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public BangleDto(String name, String size) {
		super();
		this.name = name;
		this.size = size;
	}
	@Override
	public String toString() {
		return "BangleDto [id=" + id + ", name=" + name + ", size=" + size + "]";
	}
	public BangleDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
