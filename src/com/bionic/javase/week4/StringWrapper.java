package com.bionic.javase.week4;

import java.util.Iterator;

public class StringWrapper implements Iterable<Character> {
	private String s;
	private int ind = 0;

	public Iterator<Character> iterator() {
		return new Iterator<Character>() {
			public boolean hasNext() {
				return (ind <= s.length() - 1);
			}

			public Character next() {
				char q = s.charAt(ind);
				ind++;
				return q;
			}

			public void remove() {
				throw new UnsupportedOperationException("Not supported yet.");
			}
		};
	}

	StringWrapper(String s) {
		this.s = s;
	}
}
