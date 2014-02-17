package com.bionic.javase.week2;

import java.util.Scanner;

public class SuperClassesCounterMain{

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Input class name to count its ancestors: ");
		String s = kb.nextLine();
		showSuperClasses(s);

	}
	
	public static void showSuperClasses(String className) throws ClassNotFoundException {
		Class s = Class.forName(className);
		while((s = s.getSuperclass()) != null)
			System.out.println(s);
		
	}

}
