package com.bionic.javase.week4.saledcars;

import java.util.ArrayList;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<SaledSlavuta> coll = new ArrayList<SaledSlavuta>();
		SaledSlavuta sl1 = new SaledSlavuta();
		sl1.year = 2;
		coll.add(sl1);
		SaledSlavuta sl2 = new SaledSlavuta();
		sl2.year = 10;
		coll.add(sl2);
		for (SaledSlavuta ssl : coll) {
			System.out.println(ssl.tovar.getPrice());
		}

	}

}
