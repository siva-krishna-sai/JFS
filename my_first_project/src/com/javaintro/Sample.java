package com.javaintro;

public class Sample {
	static long no;
	int id;
	
	void display() {
		Sample s = new Sample();
		System.out.println("Instance Method");
		System.out.println(s.id);
		hello();
	}
	static void hello() {
		System.out.println("Static Method");
		System.out.println(no);
	}

	public static void main(String[] args) {
		Sample s1 = new Sample();
		s1.display();
		
	}

}
