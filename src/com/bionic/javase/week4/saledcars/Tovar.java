package com.bionic.javase.week4.saledcars;

abstract public class Tovar {
	abstract public double getBasicPrice();
	abstract public double getDiscount();
	public double getPrice() {
		return getBasicPrice()*getDiscount();
	}

}
