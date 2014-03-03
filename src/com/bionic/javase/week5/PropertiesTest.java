package com.bionic.javase.week5;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

public class PropertiesTest {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Properties props = new Properties();
		props.load(new FileReader("my.properties"));
		System.out.println(props.getProperty("author"));
		props.setProperty("author", "Other author");
		props.store(new FileWriter("my.properties"), "My configuration");
		System.out.println(System.getProperty("my.property"));

	}

}
