package com.Xworkz.Wings.array;

public class SingleDimensional {
public static void main(String[] args) {
	int a[] = new int[50];
	int num = 10;
	for (int i = 0; i<a.length; i++) {
		a[i] = num;
		num = num+10;
		}
	for (int i = 0; i<a.length; i++) {
		System.out.print(a[i]+ ", ");
			
}
}
}