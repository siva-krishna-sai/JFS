package com.fundamentals.constructors;

public class Person1 {
	int id;
	String name;
	int age;
	String city;
	
	Person1(){
		this(101);
		System.out.println("no arg constructor");
	}
	Person1(int id){
		this(id,"siva");
		System.out.println("one arg constructor ");
	}
	Person1(int id,String name){
		this(id,name,22);
		System.out.println("Two arg constructor");
	}
	Person1(int id,String name, int age){
		this(id,name,age,"hyd");
		System.out.println("Three arg constructor");
	}
	Person1(int id,String name,int age,String city){
		System.out.println("Four arg constructor");
		this.id=id;
		this.name=name;
		this.age=age;
		this.city=city;
		
	}
	public static void main(String[] args) {
		System.out.println("main method started");
		new Person1();

		
	}

}
