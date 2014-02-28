package com.bionic.javase.week4;

//Написати клас, який спадкує від типованого ArrayList та надає додатковий ітератор
//для реалізації циклічного списку. Це означає, що цикл, який використовує цей ітератор, 
//при досягненні останнього елементу не зупиняється, а переходить до першого елементу, і цикл продовжується

import java.util.ArrayList;
import java.util.Iterator;

public class CycledArrayList<T> extends ArrayList<T> {
	
	public Iterable<Integer> getCycled(final int n) {
		
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
						if(count == n) count = 0;
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
