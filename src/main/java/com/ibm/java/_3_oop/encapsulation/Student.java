package com.ibm.java._3_oop.encapsulation;

public class Student {
	
	private String name;
	private byte grade;
	
	public Student(String name, byte grade) {
		this.name = name;
		setGrade(grade);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public byte getGrade() {
		return grade;
	}
	
	public void setGrade(byte grade) {
		if (grade > 10 || grade < 1) {
			throw new IllegalArgumentException("Bad value for grade: " + grade);
		}
		this.grade = grade;
	}
}
