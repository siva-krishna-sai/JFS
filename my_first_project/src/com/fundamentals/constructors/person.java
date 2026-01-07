package com.fundamentals.constructors;

public class person {
	int id;
	String name;
	int age;
	String city;
	
	person(){
		this(101);
		System.out.println("no arg constructor");
	}
	person(int id){
		this(id,"siva");
		System.out.println("one arg constructor ");
	}
	person(int id,String name){
		this(id,name,22);
		System.out.println("Two arg constructor");
	}
	person(int id,String name, int age){
		this(id,name,age,"hyd");
		System.out.println("Three arg constructor");
	}
	person(int id,String name,int age,String city){
		System.out.println("Four arg constructor");
		this.id=id;
		this.name=name;
		this.age=age;
		this.city=city;
		
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		
		person p =new person();
		p.show();
	}
	void show() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
		System.out.println(city);
	}

}
