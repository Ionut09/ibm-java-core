package com.ibm.java._1_intro;

import java.util.Scanner;

public class While {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number: ");
		int n = sc.nextInt();
		
		//		3553 - palindrom
		//		35753 - palindrom
		//		3578853 - nu e palindrom
		int reverse = 0; //undefineed
		int copy = n;
		while (n != 0) {
			int digit = n % 10;
			n = n / 10; //355 , 35, 3, 0
			reverse = reverse * 10 + digit;
		}
		
//		if (copy == reverse) {
//			System.out.println("number " + copy + " is palindrom");
//		} else {
//			System.out.println("number " + copy + " is not palindrom");
//		}

//		sau echiv. cu ternar
		String result = (copy == reverse) ? ("number " + copy + " is palindrom") : ("number " + copy + " is not palindrom");
		
		System.out.println(result);
	}
}

