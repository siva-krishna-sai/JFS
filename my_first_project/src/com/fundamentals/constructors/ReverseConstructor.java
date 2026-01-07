package com.fundamentals.constructors;

class Reverse {
	
	Reverse(){
		System.out.println("Three arg constructor called ");
	}
}
	
class constructor extends Reverse{
	constructor(){
		super();
		System.out.println("Constructor");
	}
	
	constructor(int a, int b, int c, int d){
		super();
		System.out.println("Four arg constructor called ");
	}
}
public class ReverseConstructor{
	public static void main(String[] args) {
		System.out.println("Main Method Started !!");
		new constructor();
		
		new constructor(0,0,0,0);
		
		
	}

}
