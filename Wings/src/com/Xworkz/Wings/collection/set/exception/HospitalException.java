package com.Xworkz.Wings.collection.set.exception;

public class HospitalException extends Exception {

	@Override
	public String toString() {
		return "No content found in hospital detail request";
	}

	@Override
	public String getMessage() {
		
		return "Hospital not found";
	}
	 
	 
	 }
