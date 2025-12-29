package com.fundamentals;

public class StationaryCompany {
	
	int rM = 18000;
	int lC = 12000;
	int fC = 6000;
	float wofM = 0.03f;
//	float sWS = 0.02f;
	int add = 3500;
	float tP = 2000;
	float cost;
	float M;
	
	void wasteageMaterial() {
		M = rM * wofM;
		System.out.println("Wasteage material amount : $"+M);
//		sWS = M * sWS;
//		System.out.println(sWS);
		rM = (int) (rM - M);
		System.out.println("After removing wastage material : $"+rM);
	}
	void MaterialCost() {
		cost = lC + fC + rM;
		System.out.println("Total Spending cost : $"+cost);
		System.out.println("Additional Cost : $"+add);
		cost = cost+add;
		System.out.println("Total Spending cost : $"+cost);
	}
	void production() {
		tP = (cost/tP);
		System.out.println("one pen cost : $"+tP);
	}
	
	public static void main(String[] args) {
		
		StationaryCompany s = new StationaryCompany();
		s.wasteageMaterial();
		s.MaterialCost();
		s.production();
	}

}
