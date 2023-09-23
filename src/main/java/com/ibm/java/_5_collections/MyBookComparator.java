package com.ibm.java._5_collections;

import java.util.Comparator;

public class MyBookComparator implements Comparator<Book> {
	
	@Override
	public int compare(Book book1, Book book2) {
		String author1 = book1.getAuthor();
		String author2 = book2.getAuthor();
		return author1.compareTo(author2);
	}
}
