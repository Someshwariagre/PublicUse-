package com.Xworkz.Wings.collection.map;

import java.util.ListIterator;

public class Customer {
    private String name;
    private Integer accNo;
    private String place;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAccNo() {
		return accNo;
	}
	public void setAccNo(Integer accNo) {
		this.accNo = accNo;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", accNo=" + accNo + ", place=" + place + "]";
	}
	
	}
   
    

