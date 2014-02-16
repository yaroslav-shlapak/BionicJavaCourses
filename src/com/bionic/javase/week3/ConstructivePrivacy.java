package com.bionic.javase.week3;

import java.lang.reflect.Constructor;

public class ConstructivePrivacy {
	
	public static void main(String[] args) throws Exception {
		
		Class c = Class.forName("com.bionic.javase.week3.ClassPrivateConstructor");
		
		Constructor m = c.getDeclaredConstructor();
		m.setAccessible(true);
		
		m.newInstance();
	}

}
