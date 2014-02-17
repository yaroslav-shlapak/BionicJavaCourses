package com.bionic.javase.week3;

import java.lang.reflect.Method;

public class FunctionsParameters {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Class cl = Class.forName("");
		FunParam fp = (FunParam) cl.newInstance();
		Method m = cl.getDeclaredMethod("foo");
		System.out.println(m.invoke(fp, args));

	}
	
	public void showTable(Method m, int start, int end, int pointsNumber) {
		
	}

}
