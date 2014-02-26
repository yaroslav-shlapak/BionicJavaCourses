package com.bionic.javase.week4;


interface Foo {}
class Alpha implements Foo {}
class Beta extends Alpha {}
public class TestCheck extends Beta {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Beta x = new Beta();
		Alpha f = (TestCheck)x;

	}

}
