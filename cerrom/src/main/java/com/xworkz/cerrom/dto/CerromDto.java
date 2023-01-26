package main.java.com.xworkz.cerrom.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "cerrom")


public class CerromDto {
	@Id
	private int id;
	private String name;
	private int noOfPlayer;
	private String colour;
	private int size;
	public CerromDto(int id, String name, int noOfPlayer, String colour, int size) {
		super();
		this.id = id;
		this.name = name;
		this.noOfPlayer = noOfPlayer;
		this.colour = colour;
		this.size = size;
	}
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
	public int getNoOfPlayer() {
		return noOfPlayer;
	}
	public void setNoOfPlayer(int noOfPlayer) {
		this.noOfPlayer = noOfPlayer;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public CerromDto() {
		super();
		
	}
	@Override
	public String toString() {
		return "CerromDto [id=" + id + ", name=" + name + ", noOfPlayer=" + noOfPlayer + ", colour=" + colour
				+ ", size=" + size + "]";
	}
	
	
	

}
