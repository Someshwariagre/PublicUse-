package com.xworkz.highway;

import lombok.Getter;

@Getter
public class HighwayDto {
	
	private String name;
	private int noOfTolls;
	private int distance;
	private boolean conncetedbetweenvillage;
	
	
	
	
	
	
	@Override
	public String toString() {
		return "HighwayDto [name=" + name + ", noOfTolls=" + noOfTolls + ", distance=" + distance
				+ ", conncetedbetweenvillage=" + conncetedbetweenvillage + "]";
	}
	public HighwayDto(String name, int noOfTolls, int distance, boolean conncetedbetweenvillage) {
		super();
		this.name = name;
		this.noOfTolls = noOfTolls;
		this.distance = distance;
		this.conncetedbetweenvillage = conncetedbetweenvillage;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNoOfTolls() {
		return noOfTolls;
	}
	public void setNoOfTolls(int noOfTolls) {
		this.noOfTolls = noOfTolls;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	public boolean isConncetedbetweenvillage() {
		return conncetedbetweenvillage;
	}
	public void setConncetedbetweenvillage(boolean conncetedbetweenvillage) {
		this.conncetedbetweenvillage = conncetedbetweenvillage;
	}
	
	
	

}
