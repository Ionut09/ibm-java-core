package com.ibm.java._4_strings;

public class StringImmutability {
	
	public static void main(String[] args) {
		
		String str = "My super immutable String"; //o data definit un obiect de tip String, va ramane neschimbat
		
		str = str.toUpperCase();
		str = str.substring(3);
		System.out.println("str after making all its letter uppercase = " + str);//
		
	}
}
