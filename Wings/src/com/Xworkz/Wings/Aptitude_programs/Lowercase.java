package com.Xworkz.Wings.Aptitude_programs;

import java.util.Scanner;

public class Lowercase {
	public static void main(String[] args) {
		
	
Scanner sc = new Scanner(System.in);
String b = sc.nextLine();
int count= 1;
int sum = 1;
b=b.toLowerCase();
for(int i=0; i<b.length(); i++) {
	if (b.charAt(i)=='a'|| b.charAt(i)=='e' || b.charAt(i)=='i'|| b.charAt(i)=='o' ||b.charAt(i)=='u') {
		count++;
		
	}
	else if (b.charAt(i)>='a' && b.charAt(i)>='z') {
		sum++;
		
	}
	System.out.println("Vowel : "+ count);
	
	System.out.println("Consonants : "+ sum);
	
}

}
}
