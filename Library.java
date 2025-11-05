package org;

import java.util.ArrayList;
import java.util.ListIterator;

public class Library 
{
	private String location;
	private Book b;
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Book getB() {
		return b;
	}
	public void setB(Book b) {
		this.b = b;
	}
	
	ArrayList<Book> book=new ArrayList<Book>();
	
	//addbook
	public void addBook(Book b)
	{
		book.add(b);
		System.out.println("book addaed successsfully");
	}
	
	//displaybook
	public void displayBooks()
	{
		if(book.isEmpty())
		{
			throw new NoBooksException();
		}
		else
		{
			for(Book b:book)
			{
				b.bookDetails();
			}
		}
	}
	//searchbookbyid
	public void searchBookById(int id)
	{
		boolean isFound=false;
		if(book.isEmpty())
		{
			throw new NoBooksException();
		}
		else {
			for(Book b:book)
			{
				if(b.getBookId()==id) {
					System.out.println("Book Found ..:Details are ");
					b.bookDetails();
					isFound=true;
				}
			}
		}
		if(isFound==false) {
			throw new InvalidBookException();
		}
	}
	//search Book by Id and title
	public void searchBookByIdandTitle(int id,String tittle)
	{
		boolean isFound=false;
		if(book.isEmpty())
		{
			throw new NoBooksException();
		}
		else
		{
			for(Book b: book)
			{
				if(b.getBookId()==id)
				{
					if(b.getBookTittle().equalsIgnoreCase(tittle)) 
					{
						System.out.println("Book Found ..:Details are ");
						b.bookDetails();
						isFound=true;
					}
				}
			}
		}
		if(isFound==false)
		{
			throw new InvalidBookIdException();
		}
	}
	//update BookData based on ID
	public void updateBookData(int id) {
		boolean isFound=false;
		if(book.isEmpty())
		{
			throw new NoBooksException();
		}
		else
		{
			for(Book b: book)
			{
				if(b.getBookId()==id)
				{
					b.setCost(900);
					System.out.println("Book cost updated");
					isFound=true;
				}
			}
		}
		if(isFound==false) {
			throw new InvalidBookIdException();
		}
	}
	//remove book by ID
	public void removeBookById(int id) {
		ListIterator<Book> i=book.listIterator();
		boolean isRemoved=false;
		if(book.isEmpty())
		{
			throw new NoBooksException();
		}
		else
		{
			while(i.hasNext())
			{
				Book b1=i.next();
				if(b.getBookId()==id) {
					i.remove();
					System.out.println("Book removed SuccessFully");
					isRemoved=true;
				}
			}
		}
		if(isRemoved==false)
		{
			throw new InvalidBookIdException();
		}
	}
}





