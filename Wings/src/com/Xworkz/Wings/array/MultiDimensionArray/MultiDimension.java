package com.Xworkz.Wings.array.MultiDimensionArray;

import java.util.Iterator;

public class MultiDimension {
	public static void main(String[] args) {
		int arr[][] = new int[3][3];
		int num = 10;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = num;
				num = num + 5;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");

			}
			System.out.println();

		}

	}

}
