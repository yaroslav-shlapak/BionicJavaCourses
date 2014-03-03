package com.bionic.javase.week4;

import java.util.HashSet;
import java.util.Set;

public class AnagramTestMeain {
	
	String[] s = {"автор", "товар", "апельсин", "спаниель"};

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		Integer i1 = 45;
		Integer i2 = 46;
		Integer i3 = 100;
		set.add(i1);
		set.add(i1);
		set.add(i2); 
		set.remove(i1);
		i2 = 47;
		set.remove(i2);
		System.out.println(set.size());
		System.out.println(set);
	}


}
