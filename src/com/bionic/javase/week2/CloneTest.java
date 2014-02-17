package com.bionic.javase.week2;

public class CloneTest implements Cloneable {
	private int a;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	@Override
	public String toString() {
		return "CloneTest [a=" + a + "]";
	}

	public CloneTest clone() throws CloneNotSupportedException {
		return (CloneTest) super.clone();
	}
}
