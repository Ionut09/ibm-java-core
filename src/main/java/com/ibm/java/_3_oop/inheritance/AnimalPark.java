package com.ibm.java._3_oop.inheritance;

public class AnimalPark {
	
	public static void main(String[] args) {
		Cat kittie = new Cat("scandinavian", "grey");
		
		System.out.println(kittie.getSpecies());
		System.out.println(kittie.getWeight());
		System.out.println(kittie.getSpeed());
		System.out.println(kittie.getBreed());
		System.out.println(kittie.getColor());
		kittie.eat();
		
		System.out.println();
		Dog rex = new Dog("Rex", "Labrador");
		
		System.out.println(rex.getSpecies());
		System.out.println(rex.getWeight());
		System.out.println(rex.getSpeed());
		System.out.println(rex.getBreed());
		System.out.println(rex.getName());
		rex.eat();
		System.out.println();
		System.out.println();
		//'Animal' is abstract; cannot be instantiated
		Animal pet;//= new Animal("Cat", 5, 30);
		pet = new Dog("Rex", "Labrador");
		pet = new Cat("scandinavian", "grey");
		
		pet.eat();
		
	}
}
