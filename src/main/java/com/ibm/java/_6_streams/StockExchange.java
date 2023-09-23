package com.ibm.java._6_streams;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StockExchange {
	
	/**
	 * Find all transactions in the year 2011 and sort them by value  (small to high). What are all the unique cities where the
	 * traders work? Find all traders from Cambridge and sort them by name. Return a string of all traders’ names sorted
	 * alphabetically. Are any traders based in Milan? Print all transactions’ values from the traders living in Cambridge. What’s
	 * the highest value of all the transactions? Find the transaction with the smallest value.
	 */
	
	static Trader raoul = new Trader("Raoul", "Cambridge");
	static Trader mario = new Trader("Mario", "Milan");
	static Trader alan = new Trader("Alan", "Cambridge");
	static Trader brian = new Trader("Brian", "Cambridge");
	
	static List<Transaction> transactions = List.of(
		new Transaction(brian, 2011, 300),   //$
		new Transaction(raoul, 2012, 1000),
		new Transaction(raoul, 2011, 400),
		new Transaction(mario, 2012, 710),
		new Transaction(mario, 2012, 700),
		new Transaction(alan, 2012, 950)
	);
	
	public static void main(String[] args) {
		System.out.println(new Random().nextInt(8));
		printTransactionsBasedOnCity("Cambridge");
		System.out.println(getTraderNames());
		System.out.println("areTradersInCity(\"Milan\") = " + (areTradersInCity("Milan") ? "Yes" : "No"));
	}
	
	//		 Print all transactions’ values from the traders living in Cambridge.
	private static void printTransactionsBasedOnCity(String city) {
		transactions.stream()
		            //boolean test(Transaction t)
		            .filter(t -> city.equals(t.getTrader() //NPE
		                                      .getCity()))
		            .forEach(t -> System.out.println(t.getValue()));
	}
	
	//	Return a string of all traders’ names sorted alphabetically.
	private static String getTraderNames() {
		return transactions.stream()
		                   //		     Trader apply(Transaction t )
		                   //		                   .map((Transaction transaction) -> transaction.getTrader())
		                   //		                   .map((Trader trader) -> trader.getName())
		                   .map(Transaction::getTrader)
		                   .map(Trader::getName)
		                   .distinct()
		                   .sorted()
		                   .collect(Collectors.joining(","));
	}
	
	//	Are any traders based in Milan?
	
	private static boolean areTradersInCity(String city) {
		//		return transactions.stream()
		//		                   .map(Transaction::getTrader)
		//		                   .map(Trader::getCity)
		//		                   //		                   .filter(c -> "Milan".equals(c))
		//		                   .filter(city::equals)
		//		                   .count() > 0;
		
		return transactions.stream()
		                   .anyMatch(transaction -> city.equals(transaction.getTrader()
		                                                                   .getCity()));
		
	}
}