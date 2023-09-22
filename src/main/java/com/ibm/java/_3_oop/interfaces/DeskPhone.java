package com.ibm.java._3_oop.interfaces;

public class DeskPhone implements Phone{
	
	private boolean isOn;
	
	@Override
	public boolean powerOn() {
		System.out.println("Desk phone is powering ON");
		
		isOn = true;
		return true;
	}
	
	public boolean powerOff() {
		System.out.println("Desk phone is powering OFF");
		
		isOn = false;
		return false;
	}
}
