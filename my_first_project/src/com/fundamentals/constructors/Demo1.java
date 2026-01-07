package com.fundamentals.constructors;

public class Demo1 {
	
	static int country = 91;
	String name;
	
	
	Demo1(){
		System.out.println("no arg constructor");
		this(country,"siva");
	}
	Demo1(int country,String name){
//		this();
		System.out.println("Constructed starts");
//		calling static data to  assign for local variable by using class name
		Demo1.country=country;
//		calling instance data into local data by using this keyword
		this.name=name;
		
	}

	public static void main(String[] args) {
		System.out.println("main method started !!");
		
//		Demo1 d = new Demo1(country,"india");
//		d.display();
//		
//		Demo1 d1 =new Demo1(811,"india");
//		d1.display();
//		
//		Demo1 d2 = new Demo1(country,"india");
//		System.out.println("updating data has been until you changed");
//		d2.display();
//		
//		Demo1 d3 =new Demo1(0,"india");
//		d3.display();
		
		Demo1 d4 = new Demo1();
		d4.display();
	}
	void display() {
		System.out.println("Country id : "+country);
		System.out.println("Country name : "+name);
		System.out.println("*******************************************");
	}

}
