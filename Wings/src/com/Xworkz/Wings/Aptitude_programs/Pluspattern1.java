package com.Xworkz.Wings.Aptitude_programs;

class Pluspattern1 {

	public static void main(String Args[]) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
if (i == 1 || j == n & i == n - 1 || i == n / 2 + 1 || i == 2 & j == 1 || i == n) {
					System.out.print("*  ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}
}
