package com.ibm.java._3_oop.interfaces;

public class Callcenter {
	
	public static void main(String[] args) {
		//referinta phone este de tip Phone (interfata)
		//obiectul este de tip MobilePhone
		Phone phone = new MobilePhone();
		
		//		phone = new DeskPhone();
		
		phone.powerOn();
		phone.dial("0761237262");
		phone.powerOff();
		System.out.println("phone.POWER_SUPPLY -> " + phone.POWER_SUPPLY);
		
		if (phone instanceof MobilePhone) {
			MobilePhone mobilePhone = (MobilePhone) phone;
			mobilePhone.charge(60);
			int batteryLevel = mobilePhone.getBatteryLevel();
			System.out.println("batteryLevel = " + batteryLevel);
		}
		System.out.println();
		
		//
		MobilePhone mPhone = new MobilePhone();
		phone.powerOn();
		phone.dial("0761237262");
		phone.powerOff();
		System.out.println("mPhone.POWER_SUPPLY -> " + phone.POWER_SUPPLY);
		System.out.println("Phone.POWER_SUPPLY -> " + Phone.POWER_SUPPLY);
		
	}
}
