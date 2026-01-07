package com.fundamentals.constructors;

public class Demo3 {
	
	static int x ;
	
	static {
		x = 100;
		System.out.println("Static Block");
	}
	
	Demo3(){
		System.out.println("constructor :"+x);
		x++;
		System.out.println("Constructor :"+x);
	}

	public static void main(String[] args) {
		new Demo3();
		
		new Demo3();
	}

}
