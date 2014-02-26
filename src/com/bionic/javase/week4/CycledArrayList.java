package com.bionic.javase.week4;

import java.util.ArrayList;
import java.util.Iterator;

public class CycledArrayList extends ArrayList<Integer> {
	@Override
	public Iterator<Integer> iterator() {
		return new Iterator<Integer>() {

			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Integer next() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public void remove() {
				// TODO Auto-generated method stub
				
			}
			
		};
		
	}

}
