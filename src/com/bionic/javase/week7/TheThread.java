package com.bionic.javase.week7;

import java.util.concurrent.CountDownLatch;

public class TheThread extends Thread {
	CountDownLatch latch = null;

	public TheThread(CountDownLatch latch) {
		this.latch = latch;
	}

	public static int x = 0;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int temp;
		temp = x;
		temp++;
		try {
			latch.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		try {
			Thread.sleep(0);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		x = temp;

	}

}
