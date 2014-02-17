package com.bionic.javase.week2;

import java.lang.reflect.Method;

public class CallPrivateMethodMain {

	public static void main(String[] args) throws Exception {
		Class cl = CallPrivateMethod.class;
		Method m = cl.getDeclaredMethod("method");
		CallPrivateMethod o = new CallPrivateMethod();
		m.setAccessible(true);
	    m.invoke(o);
		
	}
	}
