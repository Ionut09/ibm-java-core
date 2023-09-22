package com.ibm.java._3_oop.inheritance;

public class Cat extends Animal {
	
	private String breed;
	private String color;
	
	public Cat(String breed, String color) {
		super("cat", 5, 30);
		this.breed = breed;
		this.color = color;
	}
	
	public void eat(){
		System.out.println("Cat eats whiskas");
	}
	
	public String getBreed() {
		return breed;
	}
	
	public String getColor() {
		return color;
	}
}
