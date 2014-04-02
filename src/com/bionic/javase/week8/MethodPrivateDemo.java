package com.bionic.javase.week8;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodPrivateDemo {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		
		MethodPrivate o = new MethodPrivate();
		System.setSecurityManager(new SecurityManager());
		Method m = MethodPrivate.class.getDeclaredMethod("foo");
		
		m.setAccessible(true);
		
		m.invoke(o, null);
		
		

	}

}
