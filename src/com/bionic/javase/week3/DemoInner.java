package com.bionic.javase.week3;

public class DemoInner {
	private int a = 10;
	public static void main(String[] args) {
		DemoInner inner = new DemoInner();
		DemoInner.Inner inn = inner.new Inner();
	}

	class Inner {
		public Inner() {
			System.out.println("ololo");
		}
		
	}
	
	public void m(){
		
	}
}
