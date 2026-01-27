package com.logicaloperators;

import java.util.Scanner;

public class TestLs03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tomato=0;
		int potato=0;
		int onion=0;
		int carrot=0;
		int totalbill=0;
		boolean status;
		
		do {
			System.out.println("--Vegitables Menu--");
			System.out.println("1.Tomato kg : 30");
			System.out.println("2.potato kg : 40");
			System.out.println("3.onion kg : 25");
			System.out.println("4.Carrot kg : 50");
			
			System.out.println("Select any item based on the number : ");
			int choice = sc.nextInt();
			switch(choice) {
			case 1 -> {
				System.out.println("Enter  tomato quanty : ");
				int qty = sc.nextInt();
				tomato+=qty;
				totalbill+=qty*30;
			}
			case 2 -> {
				System.out.println("Enter potato quanty : ");
				int qty = sc.nextInt();
				potato+=qty;
				totalbill+=qty*40;
			}
			case 3 -> {
				System.out.println("Enter onion quanty : ");
				int qty = sc.nextInt();
				onion+=qty;
				totalbill+=qty*25;
			}
			case 4 -> {
				System.out.println("Enter carrot quanty : ");
				int qty = sc.nextInt();
				carrot+=qty;
				totalbill+=qty*50;
			}
			default -> System.out.println("Invalid choice ");
			}
			System.out.println("Do you want more vegetables(true/false) : ");
			status = sc.nextBoolean();
		} while(status) ;
		
		System.out.println("-------Print Bill--------");
		if(tomato>0) System.out.println("Tomato : "+tomato +" --> "+tomato*30);
		if(potato>0) System.out.println("potato : "+potato +" --> "+potato*40);
		if(onion>0) System.out.println("onion : "+onion +" --> "+onion*25);
		if(carrot>0) System.out.println("carrot : "+carrot +" --> "+carrot*50);
		System.out.println("------------------");
		System.out.println("Total  : "+totalbill);
	}

}
