package com.bionic.javase.week4;

import java.util.ArrayList;
import java.util.List;

public class RectOperation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Strategy> l = new ArrayList<>();
		Strategy r = new StrategicRect();
		Strategy s = new Square();
		l.add(r);
		l.add(s);
		for(Strategy i : l) {
			i.show();
		}
		

	}

}
