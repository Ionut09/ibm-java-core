package com.ibm.java._3_oop.interfaces;

public class MobilePhone implements Phone, MobileDevice {
	
	private boolean isOn;
	private int batteryLevel;
	
	@Override
	public boolean powerOn() {
		System.out.println("Mobile phone is powering ON");
		isOn = true;
		return true;
	}
	
	public boolean powerOff() {
		System.out.println("Mobile phone is powering OFF");
		
		isOn = false;
		return false;
	}
	
	public void charge(int period) {
		for (int i = 0; i < period; i++) {
			System.out.println("Charging...");
			batteryLevel++;
		}
	}
	
	public int getBatteryLevel(){
		return batteryLevel;
	}
}
