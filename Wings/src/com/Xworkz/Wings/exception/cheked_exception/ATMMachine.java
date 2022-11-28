package com.Xworkz.Wings.exception.cheked_exception;

public class ATMMachine {
void draw(int amount) throws AtmException {
	if (amount%100!=0||amount>50000) {
		AtmException atme = new AtmException();
		throw atme;
	}
	else System.out.println("collect cash...");
}
}
