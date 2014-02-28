package com.bionic.javase.week4;

import java.util.List;

public class CycledArrayListMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CycledArrayList<Integer> cal = new CycledArrayList<Integer>();
		for(int i = 0; i < 30; i++)
			cal.add(i);
		
		for(int i : cal.getCycled(cal.size())) {
			System.out.println(i);
		}
	}

}
