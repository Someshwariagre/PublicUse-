package com.xworkz.road.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "road_details")
public class Roaddto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id" , length = 38 , precision = 1)
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "distance")
	private String distance;
	@Column(name = "comingFrom")
	private String from;
	@Column(name = "goingTo")
	private String to;
	
	
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
	public String getDistance() {
		return distance;
	}
	public void setDistance(String distance) {
		this.distance = distance;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public Roaddto(String name, String distance, String from, String to) {
		super();
		this.name = name;
		this.distance = distance;
		this.from = from;
		this.to = to;
	}
	public Roaddto() {
		super();
System.out.println("RoadDto is created");
	}
	
	@Override
	public String toString() {
		return "Roaddto [id=" + id + ", name=" + name + ", distance=" + distance + ", from=" + from + ", to=" + to
				+ "]";
	}
	
	
	
	

}
