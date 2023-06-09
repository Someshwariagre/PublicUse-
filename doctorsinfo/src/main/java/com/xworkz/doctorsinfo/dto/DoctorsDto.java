package com.xworkz.doctorsinfo.dto;

import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class DoctorsDto {
	private int id;
	@Size(min = 3, max = 20, message = "name must be lessthan 20 and greatethan 3 ")
	private String name;
	@Size(min = 3, max = 20, message = "speciality must be lessthan 20 and greatethan 3 ")
	private String speciality;
	private String age;

	private Double expereince;

	private String shift;

	@Override
	public String toString() {
		return "DoctorsDto [id=" + id + ", name=" + name + ", speciality=" + speciality + ", age=" + age
				+ ", expereince=" + expereince + ", shift=" + shift + "]";
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

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public Double getExpereince() {
		return expereince;
	}

	public void setExpereince(Double expereince) {
		this.expereince = expereince;
	}

	public String getShift() {
		return shift;
	}

	public void setShift(String shift) {
		this.shift = shift;
	}

} 
