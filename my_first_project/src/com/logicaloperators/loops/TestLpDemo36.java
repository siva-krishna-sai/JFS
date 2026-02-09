package com.logicaloperators.loops;

import java.util.Scanner;

public class TestLpDemo36 {

	public static void main(String[] args) {
		System.out.println("Main method started");
		boolean status;
		int db = 0;
		int fb = 0;
		int mb = 0;
		int nb = 0;
		int tb = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Select the Food");
			System.out.println("Dum Briyani : DB Price : 150");
			System.out.println("Fry Briyani : FB Price : 160 ");
			System.out.println("Mogalai Briyani : MB Price : 180");
			System.out.println("Nattu kodi Briyani : NB Price : 200");
			System.out.println("Enter the item Name : ");
			String choice = sc.next();
			switch (choice) {
			case "DB", "db" -> {
				System.out.print("Enter the quantity : ");
				int quantity = sc.nextInt();
				db += quantity;
				tb += quantity * 150;
			}
			case "FB", "fb" -> {
				System.out.print("Enter the quantity : ");
				int quantity = sc.nextInt();
				fb += quantity;
				tb += quantity * 160;
			}
			case "MB", "mb" -> {
				System.out.print("Enter the quantity : ");
				int quantity = sc.nextInt();
				mb += quantity;
				tb += quantity * 180;
			}
			case "NB", "nb" -> {
				System.out.print("Enter the quantity : ");
				int quantity = sc.nextInt();
				nb += quantity;
				tb += quantity * 200;
			}
			default -> System.out.println("Invalid choice!");
			}

			System.out.println("Do you want to continue(true/false) :");
			status = sc.nextBoolean();

		} while (status);

		System.out.println("-------Print Bill--------");
		if (db > 0)
			System.out.println("Dum Briyani : " + db + " --> " + db * 150);
		if (fb > 0)
			System.out.println("Fry Briyani : " + fb + " --> " + fb * 160);
		if (mb > 0)
			System.out.println("Mogali Briyani : " + mb + " --> " + mb * 180);
		if (nb > 0)
			System.out.println("Nattu kodi Briyani : " + nb + " --> " + nb * 200);
		System.out.println("------------------");
		System.out.println("Total  : " + tb);

		sc.close();
	}

}
