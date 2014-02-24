package com.bionic.javase.week4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CollTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ii = new ArrayList<Integer>();
		ii.add(40);
		ii.add(100);
		ii.add(50);
		ii.add(40);
		ii.add(10);
		ii.add(40);
		

		for(Iterator<Integer> i = ii.iterator(); i.hasNext(); ) {
			if(i.next() == (Integer) 40) i.remove();
		}

		System.out.println(ii);

		List<String> list = new LinkedList<String>();
		for (int i = 0; i < 100000L; i++) {
			list.add("aaaaa");
		}
		long beginMark = System.nanoTime();
		list.remove(50000);
		long endMark = System.nanoTime();
		double elapsedTime = (endMark - beginMark) / 1000.;
		System.out.printf("Elapsed time is%9.2f mks\n", elapsedTime);

		List<String>  list2 = new ArrayList<String>();
		for (int i = 0; i < 100000L; i++) {
			list2.add("aaaaa");
		}
		beginMark = System.nanoTime();
		list2.remove(50000);
		endMark = System.nanoTime();
		elapsedTime = (endMark - beginMark) / 1000.;
		System.out.printf("Elapsed time is%9.2f mks\n", elapsedTime);

	}

}
