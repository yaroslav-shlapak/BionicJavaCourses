package com.bionic.javase.week5;

import java.io.*;

public class DemoSerial {

	public static void main(String[] args) throws Exception {
		final String FNAME = "ser";
		Sub sb = new Sub();
		FileOutputStream fw = new FileOutputStream(FNAME);
		ObjectOutputStream osw = new ObjectOutputStream(fw);
		osw.writeObject(sb);
		osw.close();

		FileInputStream fr = new FileInputStream(FNAME);
		ObjectInputStream osr = new ObjectInputStream(fr);
		Sub sbnew = (Sub) osr.readObject();
		osr.close();
		fr.close();
	}
}

class Base {

	Base() {
		System.out.println("b");
	}
}

class Sub extends Base implements Serializable {

	Sub() {
		System.out.println("s");
	}
}
