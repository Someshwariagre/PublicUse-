package com.xworkz.votercard.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
@Entity
@Table(name = "voter_detail")
@NamedQuery(name="readAll" , query = "select read from VoterDto read")
public class VoterDto {
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private int id;
	private String name;
	private String location;
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
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public VoterDto(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}
	public VoterDto() {
		super();
		
	}
	@Override
	public String toString() {
		return "VoterDto [id=" + id + ", name=" + name + ", location=" + location + "]";
	}
	

}
