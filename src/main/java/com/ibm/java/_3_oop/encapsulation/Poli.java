package com.ibm.java._3_oop.encapsulation;

public class Poli {
	
	public static void main(String[] args) {
		Student john = new Student("John", (byte)10);
		john.setGrade((byte)9);
		System.out.println(john.getName());
		System.out.println(john.getGrade());
		
		
	}
}
