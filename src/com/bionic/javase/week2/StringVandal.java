package com.bionic.javase.week2;

import java.lang.reflect.Field;

public class StringVandal {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		// TODO Auto-generated method stub
		
		String s = "hello";
		Class cl = String.class;
		Field f = cl.getDeclaredField("value");
		f.setAccessible(true);
		
		f.set(s, new char[] {'w', 'o', 'r', 'l', 'd'});
		
		System.out.println("hello");
		
		
		
	}

}
