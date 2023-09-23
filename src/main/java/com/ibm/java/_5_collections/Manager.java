package com.ibm.java._5_collections;

public class Manager {
	
	public static void main(String[] args) {
		BookLibraryManager manager = new BookLibraryManagerMap();
		
		Book one = new Book("Head First Java", "Kathy Sierra", "123456789", 2010);
		Book two = new Book("Head First Java", "Kathy Sierra", "123456789", 2010);
		
		//		one = two;
		System.out.println("one == two -> " + (one == two));
		System.out.println("one.equals(two) -> " + one.equals(two));
		
		manager.addBookToLibrary(new Book("Head First Java", "Kathy Sierra", "123456789", 2010));
		manager.addBookToLibrary(new Book("Java 8 in Action", "Mario Fusco", "234567890", 2016));
		manager.addBookToLibrary(new Book("Thinking in Java", "Bruce Eckel", "345678901", 2020));
		System.out.println("\nLet's see library inventory");
		manager.viewInventory();
		
		Book headFirstJava = manager.findBookInLibrary("Head First Java");
		System.out.println("\nWe found: " + headFirstJava);
		
		manager.removeBookToLibrary(headFirstJava);
		System.out.println("\nLet's see library inventory after removing a book!");
		manager.viewInventory();
		
		manager.replaceOldBook(new Book("Thinking in Java", "Bruce Eckel", "345678901", 2020),
							   new Book("Moby Dick", "Herman Melville", "5678902345", 1880));
		System.out.println("\nLet's see library inventory after replacing a book!");
		manager.viewInventory();
	}
}
