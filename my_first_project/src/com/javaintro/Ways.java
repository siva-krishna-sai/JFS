package com.javaintro;

public class Ways {
	
	int id;
	String name;
	
	protected void finalize() {
		System.out.println("Final Called");
	}

	void hello() {
		System.out.println("static block");
		Ways w4 = new Ways();
	}
	public static void main(String[] args) {

		Ways w = new Ways();
		Ways w1 = new Ways();
		Ways w2 = new Ways();
		Ways w3 = new Ways();
//		1) Nullifying the object
//		w = null;
		
//		2) Re-assign the object
//		w1 = w3;
//		System.gc();
//		3) object inside a method
//		w2.hello();
//		System.gc();
//		4) " Anonymus object "we not get any output
		new Ways();
		System.gc();
		
		System.out.println(w);
		System.out.println(w1);
		System.out.println(w2);

	}

}
