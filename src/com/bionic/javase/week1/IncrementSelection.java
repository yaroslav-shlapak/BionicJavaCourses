package com.bionic.javase.week1;

public class IncrementSelection {
	
	public static void main(String[] a) { 
		double q = 100;
		double x = findX(q);
		System.out.println(x++ / x);
		
	}
	
	public static double findX(double q) {
		
		 return q / (1 - q);
	}

}
