package com.Xworkz.Wings.array.MultiDimensionArray;

public class MultiDimensionWithPattern {
	public static void main(String[] args) {
		int arr[][] = new int[8][8];
		int num = 100;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = num;
				num = num + 5;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(i==j || i+j==arr.length-1 ) {
					System.out.print("*"+ "  ");
				}
				else 
				System.out.print(arr[i][j] + "  ");

			}
				
			System.out.println();

		}

	}

}
