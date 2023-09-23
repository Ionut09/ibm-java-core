package com.ibm.java._5_collections;

public class Book implements Comparable<Book> {
	
	private String title;
	private String author;
	private String isbn;
	private int year;
	
	public Book(String title, String author, String isbn, int year) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.year = year;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getIsbn() {
		return isbn;
	}
	
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public boolean equals(Object o) { //Dog
		if (!(o instanceof Book)) {//null instanceof OriceClass -> false
			return false;
		}
		String otherBookTitle = ((Book) o).getTitle();
		return title.equals(otherBookTitle);
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String toString() {
		return "Book{" +
			       "title='" + title + '\'' +
			       ", author='" + author + '\'' +
			       ", year='" + year + '\'' +
			       '}';
	}
	
	/**
	 * Compares 2 books by title
	 */
	public int compareTo(Book book) {
		return this.title.compareTo(book.title);
	}
}
