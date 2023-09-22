package com.ibm.java._3_oop;

public class Counter {
	
	static int counter = 0; //variabile de clasa
	int count;              //instance field / variabile de instanta
	
	public Counter(int count) {
		this.count = count;
		counter++;
	}
}
