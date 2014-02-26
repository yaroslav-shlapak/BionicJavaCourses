package com.bionic.javase.week4;

import java.util.ArrayList;

public class DublicatesCollection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(10);
		hs.add(10);
		for(int i : hs) {
			System.out.println(i);
		}
		
		

	}

}

class HashSet<Integer> extends ArrayList<Integer> {
	
}