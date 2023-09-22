package com.ibm.java._3_oop.inheritance;

public abstract class Animal { //extends Object
	
	private String species;
	private int weight;
	private int speed;
	
	public Animal(String species, int weight, int speed) {
		super();
		this.species = species;
		this.weight = weight;
		this.speed = speed;
	}
	
	public abstract void eat();

	public String getSpecies() {
		return species;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public int getSpeed() {
		return speed;
	}
}
