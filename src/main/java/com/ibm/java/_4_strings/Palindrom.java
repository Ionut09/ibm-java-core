package com.ibm.java._4_strings;

public class Palindrom {
	
	/**
	 * 01... jkssshj
	 */
	public static void main(String[] args) {
		String[] inputs = {
			"12345678",
			"qwertyytrewq",
			"345678",
			"223322",
			"errtrre",
			null,
			""
		};
		
		for (String input : inputs) {
			System.out.println(input + (isPalindrom(input) ? " is palindrom" : " is not palindrom"));
		}
	}
	
	private static boolean isPalindrom(String input) {
		if (input == null || input.isEmpty()) {
			return false;
		}
		int length = input.length();
		for (int i = 0; i < length / 2; i++) {
			if (input.charAt(i) != input.charAt(length - 1 - i)) {
				return false;
			}
		}
		return true;
	}
}
