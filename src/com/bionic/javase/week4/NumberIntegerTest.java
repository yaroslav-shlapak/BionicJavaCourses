package com.bionic.javase.week4;



public class NumberIntegerTest {

	    public static void main(String[] args) {
	        Demo d = new Demo();
	        short c=5;
	        long l = 7;
	        d.f(c);
	        d.f(l);
	    }	
	}

	class Demo {

	void f(Long x) {
	    System.out.println("Long");
	}

	void f(Short x) {

	System.out.println("Short");
	}
	void f(int x) {
	    System.out.println("Int");

	}

}