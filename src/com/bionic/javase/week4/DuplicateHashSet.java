package com.bionic.javase.week4;

import java.lang.reflect.Field;



public class DuplicateHashSet {

	/**
	 * @param args
	 * @throws SecurityException 
	 * @throws NoSuchFieldException 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		HashSet<Integer> hs = new HashSet<Integer>();
		
		hs.add(10);
		hs.add(10);
		
		for(Integer i : hs)
			System.out.println(i);

	}

}
