package com.ibm.java._5_collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class BookLibraryManagerMap implements BookLibraryManager {
	
	private Map<String, Book> books = new LinkedHashMap<>();
	
	@Override
	public boolean addBookToLibrary(Book book) {
		return books.put(book.getIsbn(), book) == null;
	}
	
	@Override
	public boolean removeBookToLibrary(Book book) {
		//		return books.remove(book.getIsbn(), book);
		return books.remove(book.getIsbn()) != null;
	}
	
	@Override
	public Book findBookInLibrary(String title) {
		for (Entry<String, Book> libraryEntry : books.entrySet()) {
			//			String isbn = libraryEntry.getKey();
			Book book = libraryEntry.getValue();
			if (title.equals(book.getTitle())) {
				return book;
			}
		}
		return null;
	}
	
	@Override
	public void replaceOldBook(Book oldBook, Book newBook) {
		//		books.putIfAbsent(oldBook.getIsbn(), newBook);
//		books.computeIfPresent(oldBook.getIsbn(), (v1, v2) -> newBook);
		books.put(oldBook.getIsbn(), newBook);
	}
	
	@Override
	public void viewInventory() {
		for (Book book : books.values()) {
			System.out.println(book);
		}
	}
}
