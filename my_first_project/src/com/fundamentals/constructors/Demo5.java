package com.fundamentals.constructors;

public class Demo5 {
	
	String name;
	int age;
	String city;
	
	Demo5(String name){
		this.name=name;
	}
	
	Demo5(Demo5 d,int age){
		this.name=d.name;
		this.age=age;
	}
	
	Demo5(Demo5 d,String city){
		this.name=d.name;
		this.age=d.age;
		this.city=city;
		
	}

	public static void main(String[] args) {
		System.out.println("Main method started !!");
		Demo5 d1 = new Demo5("siva");
		d1.display();
		
		Demo5 d2 = new Demo5(d1,22);
		d2.display();
		
		Demo5 d3 = new Demo5(d2,"Hyd");
		d3.display();
	}
	
	void display() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(city);
		System.out.println("*************************");
	
	}

}
