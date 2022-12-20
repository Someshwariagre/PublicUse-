package com.Xworkz.Wings.Aptitude_programs;

public class CommanArrayElement {
public static void main(String[] args) {
	int [] a = {1,3,4,5,6,};
	int [] b = {8,7,3,5,6};
	
	for(int i=0; i<a.length;i++) {
		for (int j = 0; j < b.length; j++) {
			if(a[i]==b[j]) {
				System.out.println(a[i]);
			}
			
		}
	}
	
}
}
