package com.xworkz.hospital1.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity
@Table(name="hospital_details")
@NamedQuery(name="readAll" , query = "select read from HospitalDto read")

public class HospitalDto {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private int id;
	private String name;
	private String location;
	private String noOfDoctors;
	private String specailization;
	private String noOfWard;
	private String ratings;
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
	public String getNoOfDoctors() {
		return noOfDoctors;
	}
	public void setNoOfDoctors(String noOfDoctors) {
		this.noOfDoctors = noOfDoctors;
	}
	public String getSpecailization() {
		return specailization;
	}
	public void setSpecailization(String specailization) {
		this.specailization = specailization;
	}
	public String getNoOfWard() {
		return noOfWard;
	}
	public void setNoOfWard(String noOfWard) {
		this.noOfWard = noOfWard;
	}
	public String getRatings() {
		return ratings;
	}
	public void setRatings(String ratings) {
		this.ratings = ratings;
	}
	public HospitalDto(String name, String location, String noOfDoctors, String specailization, String noOfWard,
			String ratings) {
		super();
		this.name = name;
		this.location = location;
		this.noOfDoctors = noOfDoctors;
		this.specailization = specailization;
		this.noOfWard = noOfWard;
		this.ratings = ratings;
	}
	public HospitalDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "HospitalDto [id=" + id + ", name=" + name + ", location=" + location + ", noOfDoctors=" + noOfDoctors
				+ ", specailization=" + specailization + ", noOfWard=" + noOfWard + ", ratings=" + ratings + "]";
	}
	
	

}
