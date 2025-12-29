package com.javaintro;

public class Demo {
	
	static String instuName = "V Cube";
	int stuid ;
	String stuName;
	
	static {
		System.out.println("Static Block");
//		instuName = "V Cube";
		System.out.println(instuName);
	}
	
	{
		Demo d1 = new Demo();
		System.out.println("Instance Block");
		System.out.println(stuid);
		System.out.println(stuName);
	}
	
//	static void hello() {
//		instuName = "V Cube";
//		System.out.println("Static Method");
//		System.out.println(instuName);
//		
//	}
//	void welcome() {
//		System.out.println("Instance method");
//		System.out.println(stuid);
//		System.out.println(stuName);
//	}

	public static void main(String[] args) {
		Demo d = new Demo();
		d.stuid = 5;
		d.stuName = "Siva";
//		d.welcome();
//		hello();
	}

}
