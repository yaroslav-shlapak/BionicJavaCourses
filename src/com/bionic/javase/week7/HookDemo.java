package com.bionic.javase.week7;

public class HookDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runtime rt = Runtime.getRuntime();
		
		Runnable hook = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("ololo");
			}
		};
		
		rt.addShutdownHook(new Thread(hook));

	}

}
