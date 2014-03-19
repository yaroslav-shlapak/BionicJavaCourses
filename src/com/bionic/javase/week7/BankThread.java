package com.bionic.javase.week7;

import java.util.Random;

class BankThread implements Runnable {
	Random rg = new Random();

	public BankThread(Bank bank, int from, int maxtransfer, int delay) {
		this.bank = bank;
		this.from = from;
		this.maxtransfer = maxtransfer;
		this.delay = delay;
	}

	@Override
	public void run() {
		int to = rg.nextInt(bank.size());
		int amount = rg.nextInt(maxtransfer);

		CondLockDemo.theLock.lock();
		while (true) {
			try {
				if(bank.getSpecificAccount(from) < amount)
					CondLockDemo.cond.await();
				else 
					bank.transfer(from, to, amount, delay);
				CondLockDemo.cond.signalAll();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally {
				CondLockDemo.theLock.unlock();
			}
		}

	}

	private Bank bank;
	private int from;
	private int maxtransfer;
	private int delay;

}
