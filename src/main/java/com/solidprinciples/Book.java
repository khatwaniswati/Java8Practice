package com.solidprinciples;

//Single Responsibility Principle
public class Book {

	private String bookName;
	private String author;
	private String text;

	// Duty related to books property
	public boolean findByAuthor(String authorName) {
		return author.contains(authorName);
	}

	public boolean findByName(String bookName) {
		return bookName.contains(bookName);
	}

	// printing it on console
	/*
	 * void printTextToConsole() {
	 * 
	 * }
	 */

}

class BookPrinter {

	// methods for outputting text
	void printTextToConsole(String text) {

	}

	void shareTextToOtherMedium(String text) {

	}

}