package com.Xworkz.Wings.Aptitude_programs;

class Primenumbers {

	public static void main(String Args[]) {

		int i, j, a, n;
		System.out.println("prime numbers are :- ");

		for (i = 2; i <= 100; i++) {
			a = 0;
			for (j = 2; j <= i / 2; j++) {

				if (i % j == 0) {
					a = 1;
					break;
				}
			}
			if (a == 0)

				System.out.print(i + " ");
		}
	}
}
