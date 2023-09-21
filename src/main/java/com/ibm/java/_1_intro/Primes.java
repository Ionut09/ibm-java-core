package com.ibm.java._1_intro;

import java.util.Scanner;

public class Primes {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number: ");
		int n = sc.nextInt();
		
		for (int i = 3; i <= n; i++) {
			boolean prime = true;
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					prime = false;
					break;
				}
			}
			
			if (prime) {
				System.out.println(i + " is prime");
			}
		}
	}
}
