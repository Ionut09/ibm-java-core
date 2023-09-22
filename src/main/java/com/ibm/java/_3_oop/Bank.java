package com.ibm.java._3_oop;

public class Bank {
	
	public static void main(String[] args) {
		Account myAccount = new Account();
		
		Account euroAccount = new Account("RO29RNCBEUR21872981739", "Ionut", "EUR", 0.0);
		euroAccount.deposit(1000);
		System.out.println("euroAccount.iban -> " + euroAccount.iban);
		System.out.println("euroAccount.username -> " + euroAccount.username);
		System.out.println("euroAccount.currency -> " + euroAccount.currency);
		System.out.println("euroAccount.balance -> " + euroAccount.balance);
		System.out.println();
		
		System.out.println("myAccount.iban -> " + myAccount.iban);
		System.out.println("myAccount.username -> " + myAccount.username);
		System.out.println("myAccount.currency -> " + myAccount.currency);
		System.out.println("myAccount.balance -> " + myAccount.balance);
		System.out.println();
		
		Account ronAccount = new Account("RO29RNCBRON21872981739", "Ionut", "RON", 100.0);
		ronAccount.withdraw(100);
		
		System.out.println("ronAccount.iban -> " + ronAccount.iban);
		System.out.println("ronAccount.username -> " + ronAccount.username);
		System.out.println("ronAccount.currency -> " + ronAccount.currency);
		System.out.println("ronAccount.balance -> " + ronAccount.balance);
	}
}
