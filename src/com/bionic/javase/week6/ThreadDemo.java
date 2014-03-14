package com.bionic.javase.week6;

public class ThreadDemo {
	public static void main(String[] args){
		Thread t1 = new Thread(new BaseThread(500, "second"));
		Thread t2 = new Thread(new BaseThread(1000, "third"));
		t1.start();
		t2.start();
		System.out.println("test1");
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("second");
		}
		System.out.println("test2");
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("third");
		}
		System.out.println("End of first thread");
	}
}
