package com.bionic.javase.week5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class StudentDeserialize {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stu
		
		ObjectInputStream o = new ObjectInputStream(new FileInputStream("Serial"));
		Student s = (Student) o.readObject();
		System.out.println(s.getJava());
		
	}

}
