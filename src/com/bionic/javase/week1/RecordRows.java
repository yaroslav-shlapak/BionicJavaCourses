package com.bionic.javase.week1;

public class RecordRows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int minIndex = 0;
		int maxIndex = 0;
		int maxLen = 0;
		int minLen = 0;
		if(args.length == 0) {
			System.out.println("No input");
			return;
		}
		minLen = args[0].length();
		for(int i = 0; i < args.length; i++) {
		    int curLen = args[i].length();
			if(curLen >= maxLen) {
				maxIndex = i;
				maxLen = curLen;
			}
			if(curLen <= minLen) {
				minIndex = i;
				minLen = curLen;
			}
		}
		System.out.println("Max: " + args[maxIndex]);
		System.out.println("Min: " + args[minIndex]);

	}

}