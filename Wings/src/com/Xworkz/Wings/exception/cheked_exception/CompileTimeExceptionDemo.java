package com.Xworkz.Wings.exception.cheked_exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CompileTimeExceptionDemo {
public static void main(String[] args) {
	
		
		try {
			FileReader file = new FileReader("c:\\info.docx");
			BufferedReader reader = new BufferedReader(file);
			for (int i = 0; i < 2; i++) {
			System.out.println(reader.readLine());
		} 
		}
			
			catch (IOException e) {
				System.out.println("Exception caught");
		
		}
		System.out.println("main ended");
		
	}
}

