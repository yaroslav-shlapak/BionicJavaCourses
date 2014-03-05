
package com.bionic.javase.week5;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class StudentSerealize {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		Student s = new Student(70, 70, "Lol");
		ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("Serial"));
		o.writeObject(s);
	}

}
