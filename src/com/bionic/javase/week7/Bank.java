package com.bionic.javase.week7;

public class Bank {

	public Bank(int numbOfAccounts, int initialBalance) {
		accounts = new int[numbOfAccounts];
		for (int i = 0; i < accounts.length; i++) {
			accounts[i] = initialBalance;
		}

	}

	@Override
	public String toString() {
		String s = "";
		for (int v : accounts)
			s += (v + " ");
		return s;
	}

	public int getTotalBalance() {
		int s = 0;
		for (int v : accounts)
			s += v;
		return s;
	}

	public int getMin() {
		if (accounts.length == 1)
			return accounts[0];
		else {
			int mm = accounts[0];
			for (int v : accounts) {
				if (v < mm)
					mm = v;
			}
			return mm;
		}
	}

	public int size() {
		return accounts.length;
	}

	public int getSpecificAccount(int i) {
		return accounts[i];
	}

	public void transfer(int from, int to, int amount, int delay) {
		accounts[from] -= amount;
		try {
			Thread.sleep(delay);
		} catch (InterruptedException e) {

		}
		accounts[to] += amount;
	}

	private final int[] accounts;

}
