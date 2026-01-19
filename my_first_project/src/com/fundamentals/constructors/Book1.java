package com.fundamentals.constructors;

class Fields{
	
	String title;
	String author;
	String isbn;
	int shelfNumber;
	
	Fields(){
		System.out.println("Default ");
	}
	
	Fields(String title,String author,String isbn,int shelfNumber){
		this.title=title;
		this.author=author;
		this.isbn=isbn;
		this.shelfNumber=shelfNumber;
	}
	
	Fields(Fields f){
		this.title=f.title;
		this.author=f.author;
		this.isbn=f.isbn;
		this.shelfNumber=f.shelfNumber;
	}
	
	void display() {
		System.out.println("Title : "+title);
		System.out.println("Author : "+author);
		System.out.println("ISBN : "+isbn);
		System.out.println("Shelf Number : "+shelfNumber);
	}
	
}

public class Book1 {

	public static void main(String[] args) {
		
		Fields original = new Fields("My World","Sai","Hbn3200",04);
		System.out.println("Original Data");
		original.display();
		
		Fields copied = new Fields(original);
		System.out.println("Copied Data");
		
		copied.shelfNumber = 03;
		copied.display();
		
	}

}
