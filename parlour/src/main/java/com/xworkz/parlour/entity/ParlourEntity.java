package com.xworkz.parlour.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "parlour_details")
@NamedQuery(name = "findByName", query = "select sam from ParlourEntity sam where sam.name=:fbn")
@NamedQuery(name = "findAll", query = "select read from ParlourEntity read")
public class ParlourEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private long mobile;

	public ParlourEntity(String name, long mobile) {
		super();
		this.name = name;
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "ParlourEntity [id=" + id + ", name=" + name + ", mobile=" + mobile + ", getId()=" + getId()
				+ ", getName()=" + getName() + ", getMobile()=" + getMobile() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public ParlourEntity() {
		super();
		// TODO Auto-generated constructor stub
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

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	
}
