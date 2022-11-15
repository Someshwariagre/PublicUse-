package com.Xworkz.Wings.Aptitude_programs;

class Primenumbers {

	public static void main(String Args[]) {

		int i, j, isprime, n;
		System.out.println("prime numbers are :- ");

		for (i = 2; i <= 100; i++) {
			isprime = 0;
			for (j = 2; j <= i / 2; j++) {

				if (i % j == 0) {
					isprime = 1;
					break;
				}
			}
			if (isprime == 0)

				System.out.print(i + " ");
		}
	}
}
