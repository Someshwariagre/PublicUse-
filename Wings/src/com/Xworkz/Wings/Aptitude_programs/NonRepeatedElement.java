package com.Xworkz.Wings.Aptitude_programs;

public class NonRepeatedElement {
public static void main(String[] args) {
	int a[] = {1,2,3,5,7,6,6,5,4,3,21};
	 for (int i = 0; i < a.length; i++) {
		 int c = a[i];
		 int count = 0;
		 for (int j = 0; j < a.length; j++) {
		if(a[j]==c) {
			count++;
		}
		}
		if(count==1) {
			System.out.println(a[i]);
		}
	}
	
		
	}
		
	}


