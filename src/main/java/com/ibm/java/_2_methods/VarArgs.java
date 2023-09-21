package com.ibm.java._2_methods;

import java.util.Arrays;
import java.util.List;

public class VarArgs {
	
	public static void main(String[] args) {
		printSum();
		printSum(1);
		printSum(1,2);
		printSum(1,2,3);
		printSum(1,2,3, 30);
		printSum(new int[]{1,2,3, 30});
		printSumWithArray(new int[]{1,2,3, 30});
//		printSumWithArray(1,2,3);
		List<Integer> integers = List.of(1, 2, 3, 4);
		System.out.println(integers);
	}
	
	private static void printSum(int... elements) { //var-args
		int sum = 0;
		for (int element : elements) {
			sum += element;
		}
		System.out.println("sum of elements " + Arrays.toString(elements) + " is: " + sum);
	}
	
	private static void printSumWithArray(int[] elements) { //var-args
		int sum = 0;
		for (int element : elements) {
			sum += element;
		}
		System.out.println("sum of elements " + Arrays.toString(elements) + " is: " + sum);
	}
}
