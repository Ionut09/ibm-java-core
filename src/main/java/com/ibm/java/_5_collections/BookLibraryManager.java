package com.ibm.java._5_collections;

public interface BookLibraryManager {
	
	boolean addBookToLibrary(Book book);
	boolean removeBookToLibrary(Book book);
	Book findBookInLibrary(String title);
	void replaceOldBook(Book oldBook, Book newBook);
	
	void viewInventory();
}
