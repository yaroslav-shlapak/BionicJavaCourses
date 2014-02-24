package com.bionic.javase.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DigitSum {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String st = bf.readLine();
		System.out.println(getDigitSum(st, 200)); 
		
		
	}
	
	public static int getDigitSum(String st, int maxDigNum) {
		int res = 0;
		int stLen = st.length();
		if(stLen > maxDigNum) 
			stLen = maxDigNum;
		for(int i = 1; i < stLen; i++) {
			res += Integer.parseInt(st.substring(i - 1, i));
		}
		
		return res;
	}

}
