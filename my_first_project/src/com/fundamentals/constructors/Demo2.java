package com.fundamentals.constructors;

public class Demo2 {
	
	static int count = 0;
	String name;
	
	Demo2(String name){
		count++;
		this.name=name;
	}
	
	void display() {
		System.out.println(name + "- object count -"+count);
	}

	public static void main(String[] args) {
		Demo2 d = new Demo2("A");
		d.display();
		
		Demo2 d1 = new Demo2("B");
		d1.display();
		
		Demo2 d2 = new Demo2("C");
		d2.display();

	}

}
