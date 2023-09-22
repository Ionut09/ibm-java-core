package com.ibm.java._3_oop.inheritance;

public class Dog extends Animal{
	
	private String name;
	private String breed;
	
	public Dog(String name, String breed) {
		super("Dog", 5, 30);
		this.name = name;
		this.breed = breed;
	}
	
	@Override
	public void eat() {
		System.out.println("Dog eats Chappy");
	}
	
	public String getName() {
		return name;
	}
	
	public String getBreed() {
		return breed;
	}
}
