package com.ibm.java._5_collections;

import com.ibm.java._3_oop.inheritance.Animal;
import com.ibm.java._3_oop.inheritance.Cat;
import com.ibm.java._3_oop.inheritance.Dog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListPlay {
	
	public static void main(String[] args) {
		//creating lists
		List<String> list = new ArrayList<>();
		list.add("one");
		list.add("two");
		//		list.add(1);
		
		String two = list.get(1);//two
		System.out.println(two);
		
		List listUngeneric = new ArrayList();
		listUngeneric.add("one");
		listUngeneric.add(1);
		
		Object oneObj = listUngeneric.get(1);
		Integer one = (Integer) oneObj;
		Integer myInt = 3;// new Integer(3); //Integer.valueOf(3);
		int myIntPrimitive = 3;
		
		myIntPrimitive = myInt; //unboxing
		myInt = myIntPrimitive; //boxing
		//auto boxing
		System.out.println(one + 1);
		
		Object oneStrObj = listUngeneric.get(0);
		if (oneStrObj instanceof String) {
			String oneStr = (String) oneStrObj;
			System.out.println(oneStr.toUpperCase());
		}
		
		List<Integer> listOfInts = new ArrayList<>();
		listOfInts.add(5);
		listOfInts.add(6);
		listOfInts.add(5);
		System.out.println(listOfInts);
		
		List<String> names = List.of("John", "Bob", "Pete"); //immutable
		names = Arrays.asList("John", "Bob", "Pete"); //unmodifiable
		
		//		names.add("Ionut");
		
		List<Animal> animals = new ArrayList<>(); //pot adauga si sub-tipuri (subclase) ale clasei generice
		
		animals.add(new Dog("Rex", "Ciobanesc caucazian"));
		animals.add(new Cat("maidaneza", "red"));
		
		Animal cat = animals.get(1);
		
		BookLibraryManagerList manager = new BookLibraryManagerList();
		manager.addBookToLibrary(new Book("Thinking in Java", "Bruce Eckel", "345678901", 2020));
		manager.addBookToLibrary(new Book("Head First Java", "Kathy Sierra", "123456789", 2010));
		manager.addBookToLibrary(new Book("Java 8 in Action", "Mario Fusco", "234567890", 2016));
		
		List<Book> books = manager.getBooks();
		//		Collections.sort(books);
		books.sort(null);
		System.out.println("Sorted by title");
		books.forEach(book -> System.out.println(book));
		
		MyBookComparator bookComparator = new MyBookComparator();
		books.sort(bookComparator);
		System.out.println("\nSorted by author");
		books.forEach(book -> System.out.println(book));
		
		//      comparator built with Lambda expression
		books.sort((Book book1, Book book2) -> {
			Integer year1 = book1.getYear();
			Integer year2 = book2.getYear();
			return -1 * year1.compareTo(year2); //year in descending
		});
		System.out.println("\nSorted by year");
		books.forEach(book -> System.out.println(book));
		
		
	}
	
}
