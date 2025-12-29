package com.fundamentals;
import java.math.*;
public class Company {
	
	static BigDecimal salary = new BigDecimal("5000");
	BigDecimal DA = new BigDecimal("0.08");
	BigDecimal PF = new BigDecimal("0.03");
	BigDecimal CGST = new BigDecimal("0.07");
	BigDecimal Annual = new BigDecimal("12");
	BigDecimal NET;
	{
		System.out.println("*****************************");
		System.out.println("Salary with out allownace deducting PF and CGST");
		NET = salary.subtract(PF).subtract(CGST).add(DA).multiply(Annual);
		System.out.println("Annual salary : "+NET);
		System.out.println("*****************************");
		
		
		System.out.println("Salary with allownace deducting PF and CGST");
		System.out.println("Salary : "+salary);
		DA = salary.multiply(DA);
		System.out.println("Daily Allowance : "+DA);
		NET = salary.add(DA);
		System.out.println("Net Monthly Salary : "+NET);
		PF = NET.multiply(PF,new MathContext(3));
		System.out.println("PF Amount : "+PF);
		NET = NET.subtract(PF);
		System.out.println("Net Monthly Salary : "+NET);
		CGST = NET.multiply(CGST,new MathContext(3));
		System.out.println("CGST Amount : "+CGST);
		NET = NET.subtract(CGST);
		System.out.println("Net Monthly Salary : "+NET);
		NET = NET.multiply(Annual);
		System.out.println("Net Annual Salary : "+NET);
		
		
	}

	public static void main(String[] args) {
		
		Company c = new Company();
		
		
	}

}
