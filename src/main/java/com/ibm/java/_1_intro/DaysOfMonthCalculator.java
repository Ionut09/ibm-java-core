package com.ibm.java._1_intro;

import java.time.Month;
import java.util.Scanner;

public class DaysOfMonthCalculator {
	
	public static void main(String[] args) {
		System.out.println(Month.JANUARY);
		System.out.println(Month.OCTOBER);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the month: ");
		String inputMonth = sc.next();
		//		Month month = Month.valueOf(inputMonth);
		int days = 0;
		
		switch (inputMonth.toUpperCase()) {
			case "JANUARY":
			case "MARCH":
			case "MAY":
			case "JULY":
			case "AUGUST":
			case "OCTOBER":
			case "DECEMBER": {
				days = 31;
				break;
			}
			case "APRIL":
			case "JUNE":
			case "SEPTEMBER":
			case "NOVEMBER": {
				days = 30;
				break;
			}
			case "FEBRUARY": {
				days = 28;
				break;
			}
			default: {
				throw new IllegalArgumentException("Bad value for month");
			}
		}
		
		//		sau enhanced switch echivalent
		switch (inputMonth.toUpperCase()) {
			case "JANUARY", "MARCH", "MAY", "JULY", "AUGUST", "OCTOBER", "DECEMBER" -> {
				days = 31;
			}
			case "APRIL", "JUNE", "SEPTEMBER", "NOVEMBER" -> {
				days = 30;
			}
			case "FEBRUARY" -> {
				days = 28;
			}
			default -> {
				throw new IllegalArgumentException("Bad value for month");
			}
		}
		
		System.out.println(days);
	}
}
