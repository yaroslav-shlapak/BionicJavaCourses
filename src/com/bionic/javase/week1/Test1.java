package com.bionic.javase.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Test1 {
	
	public static void main(String[] args) throws IOException {
//		final int M = 10;
//		final int N = 8;
//		
//		int i = 1;
//		int j = 5;
//		
//		while((++i <= M) || (++j <= N)) {
//			System.out.println("i = " + i + "; j = " + j);
//		}
//		
////		double q = 
//		double x = Double.NaN;
//		System.out.println((x + x) / 2 == x);
//		int c = 10;
//		//c += c++;
//		System.out.println(c);
//		System.out.println(c++ - c++);
//		long x = Long.MAX_VALUE;
//		System.out.println(x++ >= x);
		
//		int i = -1;
//		int i1 = i >>> 1;
//		
//		System.out.println(i1);

//		String String = "";
//		
//		System.out.println("");
		
//		final int a = 5;
//		int b;
//		
//		if(a < 0) b = 10;
//		if(a >= 0) b = 50;
//		System.out.println(b);
		
//		int[] ar = new int[100];
//		ArrayList<Integer> arr = new ArrayList();
//		
//		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//		int ii;
//		int i = 0;
//		System.out.print("Enter number: ");
//		while((ii = Integer.parseInt(bf.readLine())) > 0) {
//			arr.add(ii);
//			System.out.print("Enter number: ");
//		}
//		for(int e : arr) {
//			System.out.println(e);
//			if(e == 0) break;
//		}
//		

//		System.out.println(ololo(0b01010101, 0b110011001100));
//		System.out.println(0b11000101);
//		
//		long t1 = System.nanoTime();
//		
//		//System.out.println(countSum(10000));
//		countSum(10000);
//		
//		long t2 = System.nanoTime();
//		
//		System.out.println((t2 - t1) / 1e9);
		
		
//		double a = 0;
//		
//		for(int i = 0; i <= 5; i++) {
//			a += i;
//			System.out.println(i);
//		}
//		
//		System.out.println(a);
		
		String s1 = "ololo";
		String s2 = "ololo";
		
		String s3 = new String("ololo");
		String s4 = new String("ololo");
		
		System.out.println(s1 == s2);
		System.out.println(s3 == s4);
		
//		String s = "";
//		StringBuilder sb = new StringBuilder();
//		long t1 = System.nanoTime();
//		
//		for(int i = 0; i < 100000; i++) {
//			sb.append(i);
//		}
//		
//		long t2 = System.nanoTime();
//		
//		
//		System.out.println((t2 - t1) / 1e9);
		
//		System.out.println(reverseTokens("I'm as mad as hell and I'm not gonna take this anymore"));
		 
		
		
	}
	
	public static String reverseTokens(String s) {
		String res = "";
		String ss[] = s.split(" ");
		System.out.println(Arrays.toString(ss));
		int len = ss.length;
		String temp;
		
		for(int i = 0; i < len / 2; i++) {
			temp = ss[i];
			ss[i] = ss[len - i - 1];
			ss[len - i - 1] = temp;
		}
		
		for(int i = 0; i < len; i++) {
			res += ss[i] + " ";
		}
		return res;
	}
	
	public static int ololo(int a, int b) {
		
		return (a & 0b00001111) | (b & 0b11110000);
		
	}
	
	public static long countSum(int n) {
		long res = 0L;
		for(int i = 1; i <= n; n++) {
			res += 1L / (long) i;
		}
		return res;
	}

}
