package com.bionic.javase.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class LongInt {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter first");
		String st1 = bf.readLine();
		System.out.println("Enter second");
		String st2 = bf.readLine();
		
		System.out.println(bigIntSum(st1, st2));
		
		

	}
	
	public static BigInteger bigIntSum(String st1, String st2) {
		return new BigInteger(st1).add(new BigInteger(st2));
	}

}
