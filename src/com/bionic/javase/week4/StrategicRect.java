package com.bionic.javase.week4;

//Стратегічні прямокутники. Дано клас Rectangle  з полями, які відповідають довжинам сторін. 
//Забезпечити,  щоб при виведенні колекції, яка може складатися як зі звичайних прямокутників, 
//так і з квадратів, метод show() виводив слово Rectangle або Square в залежності від фактичного типу фігури. 
//Використати шаблони State/Strategy.

public class StrategicRect implements Strategy {
	public int length = 0;
	public int height = 0;

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Rectange");
	}

}

class Square implements Strategy  {
	public int length = 0;

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Square");
	}
	
}

interface Strategy {
	public void show();
	
}