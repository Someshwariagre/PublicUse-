package com.xworkz.hospital.dto;

import javax.p;

import org.hibernate.annotations.Entity;


public class HospitalDto {
	
	private int id;
	private String name;
	private String location;
	private String noOfnurse;
	private String specailzation;
	private String noOfDoctors;
	private String noOfWards;
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
	public String getNoOfnurse() {
		return noOfnurse;
	}
	public void setNoOfnurse(String noOfnurse) {
		this.noOfnurse = noOfnurse;
	}
	public String getSpecailzation() {
		return specailzation;
	}
	public void setSpecailzation(String specailzation) {
		this.specailzation = specailzation;
	}
	public String getNoOfDoctors() {
		return noOfDoctors;
	}
	public void setNoOfDoctors(String noOfDoctors) {
		this.noOfDoctors = noOfDoctors;
	}
	public String getNoOfWards() {
		return noOfWards;
	}
	public void setNoOfWards(String noOfWards) {
		this.noOfWards = noOfWards;
	}
	@Override
	public String toString() {
		return "HospitalDto [id=" + id + ", name=" + name + ", location=" + location + ", noOfnurse=" + noOfnurse
				+ ", specailzation=" + specailzation + ", noOfDoctors=" + noOfDoctors + ", noOfWards=" + noOfWards
				+ "]";
	}
	public HospitalDto(String name, String location, String noOfnurse, String specailzation, String noOfDoctors,
			String noOfWards) {
		super();
		this.name = name;
		this.location = location;
		this.noOfnurse = noOfnurse;
		this.specailzation = specailzation;
		this.noOfDoctors = noOfDoctors;
		this.noOfWards = noOfWards;
	}
	public HospitalDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
