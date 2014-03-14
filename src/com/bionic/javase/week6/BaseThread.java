package com.bionic.javase.week6;

public class BaseThread implements Runnable{
	private int speed;
	private String name;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i <10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(speed);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("End of " + name + "thread");
	}
	public BaseThread() {
		this(1000, "default");
	}
	
	public BaseThread(int speed, String name) {
		
		this.speed = speed;
		this.name = name;
	}
	

}
