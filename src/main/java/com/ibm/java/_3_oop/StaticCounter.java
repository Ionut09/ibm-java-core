package com.ibm.java._3_oop;

public class StaticCounter {
	
	public static void main(String[] args) {
		
		Counter c1 = new Counter(1);
		Counter c2 = new Counter(2);
		Counter c3 = new Counter(3);
		c1.count++;
		c2.count++;
		c3.count++;
		c1.counter--;
		c2.counter--;
		c3.counter++;
		Counter.counter += 100;
		System.out.println("c1.count = " + c1.count);
		System.out.println("c2.count = " + c2.count);
		System.out.println("c3.count = " + c3.count);
		
		System.out.println("Counter.counter = " + Counter.counter); //3
		System.out.println("c1.counter = " + c1.counter);
		System.out.println("c2.counter = " + c2.counter);
		System.out.println("c3.counter = " + c3.counter);
		
	}
}
