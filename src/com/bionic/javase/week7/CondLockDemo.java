package com.bionic.javase.week7;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class CondLockDemo {
	public static ReentrantLock theLock = new ReentrantLock();
	public static Condition cond = theLock.newCondition();

	public static void main(String[] args) throws InterruptedException {
		final int ACCOUNTS = 100;
		final int INITIALBALANCE = 1000;
		final int MAXTRANSFER = 200;
		final int DELAY = 5;
		Bank bank = new Bank(ACCOUNTS, INITIALBALANCE);

		for (int t = 0; t < ACCOUNTS; t++) {
			BankThread bt = new BankThread(bank, t, MAXTRANSFER, DELAY);
			Thread tr = new Thread(bt);
			tr.start();
		}
		theLock.unlock();
		while (true) {
			try{
				System.out.println("Total balance is " + bank.getTotalBalance());
				System.out.println("Minimal account is " + bank.getMin());
	
				System.out.println("**********************************");
				Thread.sleep(1000);
			}
				finally {
					theLock.unlock();
			}

		}

	}

}
