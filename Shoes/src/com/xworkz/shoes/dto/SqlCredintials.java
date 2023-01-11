package com.xworkz.shoes.dto;

public enum SqlCredintials {
    URL("jdbc:mysql://localhost:3306/sep_08"),USERID("root"),PASSWORD("Xworkzodc@123");
	String value;
	
	private SqlCredintials(String value) {
		this.value=value;
	}

	public String getValue() {
		return value;
	}
	
	
}
