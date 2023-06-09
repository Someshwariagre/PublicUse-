package com.xworkz.parlour.dto;

public class ParlourDto {
	private int id;
	private String name;
	private Long mobile;

	public ParlourDto() {
		super();

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

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "ParlourDto [id=" + id + ", name=" + name + ", mobile=" + mobile + "]";
	}

	public ParlourDto(String name, Long mobile) {
		super();
		this.name = name;
		this.mobile = mobile;
	}


}
