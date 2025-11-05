package org;

public class Book 
{
	private int bookId;
	private String bookTittle;
	private int cost;
	private int noOfPages;
	private String author;
	
	public Book()
	{
		
	}

	public Book(int bookId, String bookTittle, int cost, int noOfPages, String author) {
		this.bookId = bookId;
		this.bookTittle = bookTittle;
		this.cost = cost;
		this.noOfPages = noOfPages;
		this.author = author;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookTittle() {
		return bookTittle;
	}

	public void setBookTittle(String bookTittle) {
		this.bookTittle = bookTittle;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getNoOfPages() {
		return noOfPages;
	}

	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	public void bookDetails()
	{
		System.out.println("ID of the book : "+getBookId());
		System.out.println("Title of the Book : "+getBookTittle());
		System.out.println("Author of the Book : "+getAuthor());
		System.out.println("No. of pages in the Book : "+getNoOfPages());
		System.out.println("Cost of the Book : "+getCost());
	}
}

	
	
	
