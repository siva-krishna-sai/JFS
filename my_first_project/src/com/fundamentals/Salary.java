package com.fundamentals;

public class Salary {
	
	static int salary =10000;
	float TA = 0.12f;
	float internet = 0.03f;
	float ID = 0.02f;
	
	static void TA(Salary s) {
		s.TA = salary*s.TA;
		System.out.println("Travel Allowance : "+s.TA);
		s.internet = salary * s.internet;
		System.out.println("Internet : "+s.internet);
	}

	void ID() {
		ID = salary * ID;
		System.out.println("Insurance deduction : "+ID);
	}
	
	void salary() {
		TA(this);
		ID();
		salary = salary + (int)internet + (int)TA;
		System.out.println("Toatal Salary : "+salary);
		salary = salary - (int)ID;
		System.out.println("NET Salary : "+salary);
		salary = salary * 12;
		System.out.println("Annual Salary : "+salary);
	}
	

	public static void main(String[] args) {
		Salary s1 = new Salary();
		s1.salary();
		
	}

}
