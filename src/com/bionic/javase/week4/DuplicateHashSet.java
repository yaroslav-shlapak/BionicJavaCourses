package com.bionic.javase.week4;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;



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
		
		System.out.println("HashSet");
		for(Integer i : hs)
			System.out.println(i);
		
		TreeSet<Integer> ts = new TreeSet<Integer>(new Comparator<Integer>() {

			@Override
			public int compare(Integer arg0, Integer arg1) {
				// TODO Auto-generated method stub
				return 1;
			}
			
		});
		
		System.out.println("TreeSet");
		ts.add(10);
		ts.add(10);
		for(Iterator<Integer> i = ts.iterator(); i.hasNext(); ) {
			System.out.println(i.next());
		}
		
		

	}

}
