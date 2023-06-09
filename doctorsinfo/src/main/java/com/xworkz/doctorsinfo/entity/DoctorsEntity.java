package com.xworkz.doctorsinfo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table(name = "doctors_details")
@NamedQuery(name = "findByName",query = "select str from DoctorsEntity str where str.name=:nby")
@NamedQuery(name = "find",query = "select ent from DoctorsEntity ent")
public class DoctorsEntity {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "speciality")
	private String speciality;
	@Column(name = "age")
	private String age;
	@Column(name = "expereince")
	private Double expereince;
	@Column(name = "shift")
	private String shift;
	@Override
	public String toString() {
		return "DoctorsEntity [id=" + id + ", name=" + name + ", speciality=" + speciality + ", age=" + age
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
