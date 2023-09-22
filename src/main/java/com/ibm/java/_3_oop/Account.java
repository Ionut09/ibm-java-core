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
	
	
	
}
