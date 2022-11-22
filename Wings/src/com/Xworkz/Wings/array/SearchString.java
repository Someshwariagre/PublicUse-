package com.Xworkz.Wings.array;

public class SearchString {
	public static void main(String[] args) {
		
	
String a[] = {"Apple" , "banana", "mango", "chikku", "orange"};
String search = "Apple";
int b = 0;
for(int i =0; i<a.length; i++) {
	if(search==a[i]) {
		System.out.println(" At index value:- " + i+" " + a[i] + " is present");
        b++;
	
	}	
}
if(b==0) {
System.out.println("element not found");

}
}
}