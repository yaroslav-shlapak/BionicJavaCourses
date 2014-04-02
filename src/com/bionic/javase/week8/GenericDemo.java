package com.bionic.javase.week8;

public class GenericDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		G<K3> g = new G<K3>();

	}

}


class G<T> {
	
}

class K {}
class K1 extends K {}
class K2 extends K1 {}
class K3 extends K2 {}
class K4 extends K3 {}
class K5 extends K4 {}
