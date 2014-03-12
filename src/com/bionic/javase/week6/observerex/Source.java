package com.bionic.javase.week6.observerex;

import java.util.ArrayList;

public class Source {
	ArrayList<Listener> al = new ArrayList<>();
	
	public void addListener(Listener l) {
		al.add(l);
	}
	
	public void genEvent() {
		notifyObservers();
	}
	
	private void notifyObservers() {
		for(Listener l : al) {
			l.doSomething();
		}
	}

}
