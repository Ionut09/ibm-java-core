package com.ibm.java._3_oop;

public class Account {
	
	//fields sau attributes
	String iban;
	String username;
	String currency; //null
	double balance; //java.math.BigDecimal in real applications 0.0
	
	public Account() {}
	
	public Account(String iban, String username, String currency, double balance) {
		this.iban = iban;
		this.username = username;
		this.currency = currency;
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public double withdraw(double amount) {
		if (balance >= amount) {
			balance -= amount;
			return amount;
		} else {
			System.out.println("You don't enough balance to withdraw amount: " + amount);
			return 0.0;
		}
		
	}
	
}
