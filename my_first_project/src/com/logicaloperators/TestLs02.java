package com.logicaloperators;

import java.util.Scanner;

public class TestLs02 {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Six subject marks : ");
		double mat = sc.nextDouble();
		double soc = sc.nextDouble();
		double sci = sc.nextDouble();
		double java = sc.nextDouble();
		double c = sc.nextDouble();
		double html = sc.nextDouble();
		
		double total = mat+soc+sci+java+c+html;
		System.out.println("Total Marks : "+total);
		
		if(total>=540 && total<=600) {
			System.out.println("Grade A+");
		}else if(total>=450 && total<=539) {
			System.out.println("Grade A");
		}else if(total>=360 && total<=449) {
			System.out.println("Grade B");
		}else if(total>=270 && total<=359) {
			System.out.println("Grade C");
		}else if(total>=0 && total<270) {
			System.out.println("Failed");
		}else {
			System.out.println("Invalid marks");
		}
		
	}

}
