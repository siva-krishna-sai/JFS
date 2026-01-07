package com.fundamentals.constructors;


class Bank{
	
	int x ;
	String name;
	
	Bank(){
		System.out.println("No arg Constructor :1");
	}
	
	Bank(int x,String name){
		System.out.println("Parameterised constructor :1");
	}
	
}

public class Demo4  extends Bank{
	
	Demo4(){
		
		System.out.println("no arg constructor :2");
	}
	
	Demo4(int x,String name){
//			super(x,name);
			System.out.println("Parameterised constructor :2");
		} 

	public static void main(String[] args) {
//		new Bank(0,"siva");
		
		new Demo4(0,"sai");
		
//		new Demo4();
	}

}
