package com.fundamentals.constructors;

class Book{
	String bookName;
	double bookPrice;
	
	Book(){
		
	}
	
	Book(String bookName,double bookPrice){
		System.out.println("Details of book : ");
		this.bookName=bookName;
		this.bookPrice=bookPrice;	
	}	
}

class Author extends Book{
	
	String authorName;
	String authorState;
	
	Author(){
		
	}
	
	Author(String bookName,String authorName, String authorState, double bookPrice){
		super(bookName,bookPrice);
		System.out.println("Author Details : ");
		this.authorName=authorName;
		this.authorState=authorState;
	}
	
	void display() {
		System.out.println("****************************");
		System.out.println("Book Name : "+bookName);
		System.out.println("Author Name : "+authorName);
		System.out.println("Author State : "+authorState);
		System.out.println("Book Price : "+bookPrice);
	}
}
public class Details extends Author {

	public static void main(String[] args) {
		System.out.println("main method started !!");
		
		Author a = new Author("Nuvu version 2.o","Sathish","TG",295.00);
		a.display();
	}
	
}
