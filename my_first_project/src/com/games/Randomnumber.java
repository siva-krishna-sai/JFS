package com.games;

import java.util.Random;
import java.util.Scanner;


public class Randomnumber {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		calling using method
//		int random = (int) (Math.random() * 10);
		
//		calling using class
		Random r = new Random();
		int random = r.nextInt(100);
		
		System.out.println("Guess the number......");
		System.out.println("Enter the number :");
		int n = sc.nextInt();
		int choice = 3;
		while (choice > 0) {
			if (n == random) {
				System.out.println("You won!");
				break;
			} else if (n < random) {
				System.out.println("your values is less than the number");
				choice--;
			} else if (n > random) {
				System.out.println("your values is Greater than the number");
				choice--;
				
			} if(choice > 0 ) {
				System.out.println("You have left " + choice + " chances : ");
				System.out.println("Enter the number :");
				n = sc.nextInt();
			}else {
				System.out.println("You Lost!");
				System.out.println("The number is : "+random);
				break;
			}
		}
		sc.close();
	}
}
