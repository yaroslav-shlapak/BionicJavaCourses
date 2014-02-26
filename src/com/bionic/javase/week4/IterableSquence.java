package com.bionic.javase.week4;

import java.util.Iterator;

public class IterableSquence {
	
	public static void main(String... args) {
		IterableSquence is = new IterableSquence();
		for(int i : is.getSequence(20)) {
			System.out.println(i);
		}
	}
	
	public static Iterable<Integer> getSequence(final int n) {
		
		return new Iterable<Integer>() {

			@Override
			public Iterator<Integer> iterator() {
				// TODO Auto-generated method stub
				return new Iterator<Integer>() {
					int count = 0;
					
					@Override
					public boolean hasNext() {
						// TODO Auto-generated method stub
						return count <= n;
					}

					@Override
					public Integer next() {
						// TODO Auto-generated method stub
						return count++;
					}

					@Override
					public void remove() {
						//throw new UnsupportedOperationException("Not supported yet");
						
					}
					
				};
			}
			
		};
		
	}

}
