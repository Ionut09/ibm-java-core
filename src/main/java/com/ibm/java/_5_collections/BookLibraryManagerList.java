package com.ibm.java._5_collections;

import java.util.LinkedList;
import java.util.List;

public class BookLibraryManagerList implements BookLibraryManager {
	
	private List<Book> books = new LinkedList<>();
	
	public List<Book> getBooks() {
		return books;
	}
	
	@Override
	public boolean addBookToLibrary(Book book) {
		//		books.add(2, book);
		return books.add(book); //o adauga in capat
	}
	
	@Override
	public boolean removeBookToLibrary(Book book) {
		//		books.remove(2);
		return books.remove(book);
	}
	
	@Override
	public Book findBookInLibrary(String title) {
		
		//		for (Book book : books) {
		//			if (title.equals(book.getTitle())) {
		//				return book;
		//			}
		//		}
		
		//		boolean containsBookWithTitle = books.contains(new Book(title, null, null, 0));
		//		if (containsBookWithTitle) {
		int indexOfOldBook = books.lastIndexOf(new Book(title, null, null, 0)); // = =
		if (indexOfOldBook != -1) {
			return books.get(indexOfOldBook);
		} else {
			return null;
		}
	}
	
	@Override
	public void replaceOldBook(Book oldBook, Book newBook) {
		//		books.set(2, null);
		
		int indexOfOldBook = books.indexOf(oldBook);
		if (indexOfOldBook != -1) {
			books.set(indexOfOldBook, newBook);
		}
		//sau,
		//		books.remove(indexOfOldBook);
		//		books.add(indexOfOldBook, newBook);
	}
	
	@Override
	public void viewInventory() {
		books.forEach(book -> System.out.println(book));
	}
}
