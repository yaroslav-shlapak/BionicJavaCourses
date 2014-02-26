package com.bionic.javase.week4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListNullSort {
	
	public static void main(String... argds) {
		List<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(null);
		list.add(20);
		list.add(5);
		list.add(null);
		
		System.out.println(list);
		
		Collections.sort(list, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				if(o1 == null) return -1;
				if(o2 == null) return 1;
				
				return o1.compareTo(o2);
			}
			
		});
		
		System.out.println(list);
	}

}
