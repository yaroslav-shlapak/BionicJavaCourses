package com.bionic.javase.week3;

import java.lang.reflect.Method;

public class DynamicLoadMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class cl = Class.forName("com.bionic.javase.week3.DynamicLoad");
		DynamicLoad obj = (DynamicLoad) cl.newInstance();
		Method m = cl.getDeclaredMethod("foo");
		m.invoke(obj);
		

	}

}
