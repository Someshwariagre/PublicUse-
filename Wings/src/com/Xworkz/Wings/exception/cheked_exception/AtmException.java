package com.Xworkz.Wings.exception.cheked_exception;

public class AtmException extends Exception {

	@Override
	public String toString() {
		return "Invalid amount entered";
	}
public String getMessage() {
	return "you are crossing a limit";
	}
}
