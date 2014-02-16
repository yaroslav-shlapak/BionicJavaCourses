package com.bionic.javase.week3;

import java.lang.reflect.Method;
import java.util.Scanner;

public class PublicMethodsPrint {
	
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		Class c = Class.forName(s);
		
		Method[] m = c.getDeclaredMethods();
		
		for(Method me : m) {
			System.out.println(me.toString());
		}
		
	}

}
