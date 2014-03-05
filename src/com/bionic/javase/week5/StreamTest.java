package com.bionic.javase.week5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class StreamTest {
	public static void main(String args[]) throws Exception {

		final String FILENAME = "C:\\y.shlapak\\java\\BionicJavaCourses\\src\\com\\bionic\\javase\\week4\\JavaDescription.txt";
		BufferedReader br = new BufferedReader(new FileReader(FILENAME));
		String st;
		while (( st = br.readLine()) != null) {
			System.out.println(st);
		}
		br.close();

	}

}
