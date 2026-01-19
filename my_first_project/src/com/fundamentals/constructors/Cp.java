package com.fundamentals.constructors;


class Child{
	
	int rollNo;
	
	Child(){
		System.out.println("No arg constructor");
	}
	
	Child(int rollNo){
		this.rollNo = rollNo;
		System.out.println("one arg constructor");
	}
}

public class Cp  extends Child{
	
	Cp(){
		System.out.println("Child constructor calls parent constructor");
	}
	
	Cp(int rollNo){
		super(rollNo);
		System.out.println("Roll NO : "+rollNo);
	}
	
	public static void main(String[] args) {
		
		Cp c = new Cp(4);
		
	}

}
