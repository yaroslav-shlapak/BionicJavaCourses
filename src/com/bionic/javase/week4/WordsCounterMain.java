package com.bionic.javase.week4;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

public class WordsCounterMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path filePath = Paths.get(
				"C:\\y.shlapak\\java\\BionicJavaCourses\\src\\com\\bionic\\javase\\week4\\JavaDescription.txt"
				//"D:\\sources\\github\\java\\BionicJavaCourses\\src\\com\\bionic\\javase\\week4\\JavaDescription.txt"
				);
		WordsCounter wc = new WordsCounter();
		wc.readFile(filePath);
		wc.inflateMap();
		Map<String, Integer> map = wc.getSortedMap();
		System.out.println(map);

	}

}
