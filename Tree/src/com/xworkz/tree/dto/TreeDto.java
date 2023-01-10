package com.xworkz.tree.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter


public class TreeDto {
	private int id;
	private String name;
	private String colour;
	private String type;
	private int lifeSpan;
	private String leavesColour;
	
	public TreeDto(int id, String name, String colour, String type, int lifeSpan, String leavesColour) {
		super();
		this.id = id;
		this.name = name;
		this.colour = colour;
		this.type = type;
		this.lifeSpan = lifeSpan;
		this.leavesColour = leavesColour;
	}

	public TreeDto() {
		
	}
	

}
