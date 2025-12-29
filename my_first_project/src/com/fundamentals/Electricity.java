package com.fundamentals;

public class Electricity {
	
	int units = 120;
	static double GST = 0.05;
	double rateperUnit = 6;
	double total;
	
	void totalBill() {
		total = units * rateperUnit;
		System.out.println("Bill per Units without GST : "+total);
	}
	
	static void Calculate(Electricity e) {
		e.totalBill();
		GST = e.total * GST;
		System.out.println("GST Amount : "+GST);
	}
	
	void generateBill() {
		Calculate(this);
		total = GST + total;
		System.out.println("Total Bill Generated Amount : "+total);
	}

	public static void main(String[]args) {
		System.out.println("Electricity Bill");
		Electricity e = new Electricity();
//		e.totalBill();
//		Calculate(e);
		e.generateBill();
		
	}

}
