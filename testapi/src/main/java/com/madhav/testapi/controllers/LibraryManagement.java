package com.madhav.testapi.controllers;
class Book{
//	Attributes (Private)
//
//	bookId (int)
//
//	title (String)
//
//	author (String)
//
//	isIssued (boolean)
	private int bookid;
	private String title;
	private String author;
	private boolean isissued;
	public Book(int bookid, String title, String author, boolean isissued) {
		super();
		this.bookid = bookid;
		this.title = title;
		this.author = author;
		this.isissued = isissued;
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public boolean isIsissued() {
		return isissued;
	}
	public void setIsissued(boolean isissued) {
		this.isissued = isissued;
	}
//	issueBook()
//
//	If the book is not issued → issue the book.
//
//	If already issued → print "Book already issued
	public void issueBook()
	{
		if(isissued)
		{
			System.out.println("BOOK IS ISISSUED");
		}
		else {
			System.out.println("BOOK IS NOT ISISSUED");
		}
	}
//	returnBook()
//
//	If the book is issued → return the book.
//
//	If not issued → print "Book was not issued".
	public String returnBookString()
	{
		if (isissued) {
			return "book is isissued";
		}
		else {
			return "book is not isissued";
		}
	}
//	displayBookDetails()
//
//	Display:
//
//	Book ID:
//	Title:
//	Author:
//	Status (Issued / Available)
	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", title=" + title + ", author=" + author + ", isissued=" + isissued + "]";
	}
//	Methods
//	addBook(Book book)
//
//	Adds a new book to the library.
//
//	issueBook(int bookId)
//
//	Find the book and issue it.
//
//	returnBook(int bookId)
//
//	Find the book and return it.
//
//	displayBooks()
//
//	Display all books in the library.
	
	public String addBook(Book book)
	{
		if(isissued) {
			return "book is is isissued";
		}
		else
		{
			return  title;
		}
	}

}
public class LibraryManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
