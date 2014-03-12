package com.bionic.javase.week6.observerex;

public class DemoObservers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Source s = new Source();
		s.addListener(new Treater());
		s.addListener(new Treater());
		s.addListener(new Treater());
		
		s.genEvent();

	}

}
