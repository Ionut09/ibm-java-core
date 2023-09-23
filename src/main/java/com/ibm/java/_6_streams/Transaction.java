package com.ibm.java._6_streams;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
public class Transaction {
	
	private final Trader trader;
	private final int year;
	private final int value;
	
}