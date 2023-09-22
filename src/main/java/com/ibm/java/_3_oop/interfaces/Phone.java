package com.ibm.java._3_oop.interfaces;

public interface Phone {
	
	public static final String POWER_SUPPLY = "electric current";
	
	public abstract boolean powerOn();//public abstract in mod implicit
	
	boolean powerOff();
	
	default void dial(String number) {
		System.out.println("Dialing number: " + number);
	}
	//	static void dial(String number){}
}
