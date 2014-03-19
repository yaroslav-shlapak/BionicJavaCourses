package com.bionic.javase.week7;

import java.util.concurrent.CountDownLatch;

public class TehreadSyncDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		final int NUMBER_OF_THREADS = 10;
		CountDownLatch latch = new CountDownLatch(NUMBER_OF_THREADS);
		Thread[] t = new Thread[NUMBER_OF_THREADS];
		
		for(int i = 0; i < NUMBER_OF_THREADS; i++) {
			t[i] = new TheThread(latch);
			t[i].start();
			
		}
		
//		for(int i = 0; i  < NUMBER_OF_THREADS; i++) {
//			t[i].join();
//		}
		
		System.out.println(TheThread.x);

	}

}
