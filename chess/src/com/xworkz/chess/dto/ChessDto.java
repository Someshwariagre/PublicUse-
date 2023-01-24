package com.xworkz.chess.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity


@Table(name = "chess_detail")

public class ChessDto {
	@Id
	private int id;
	private int noOfPlayer;
	private int noOfSquares;
	private int size;
	
	public ChessDto(int id, int noOfPlayer, int noOfSquares, int size) {
		super();
		this.id = id;
		this.noOfPlayer = noOfPlayer;
		this.noOfSquares = noOfSquares;
		this.size = size;
	}
	public ChessDto() {
		super();
	
	}

	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNoOfPlayer() {
		return noOfPlayer;
	}
	public void setNoOfPlayer(int noOfPlayer) {
		this.noOfPlayer = noOfPlayer;
	}
	public int getNoOfSquares() {
		return noOfSquares;
	}
	public void setNoOfSquares(int noOfSquares) {
		this.noOfSquares = noOfSquares;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	@Override
	public String toString() {
		return "ChessDto [id=" + id + ", noOfPlayer=" + noOfPlayer + ", noOfSquares=" + noOfSquares + ", size=" + size
				+ "]";
	}
	
	

}
