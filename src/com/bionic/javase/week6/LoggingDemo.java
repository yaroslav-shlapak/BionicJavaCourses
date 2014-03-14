package com.bionic.javase.week6;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggingDemo {

	public static void main(String[] args) throws SecurityException, IOException {
		// TODO Auto-generated method stub
		Logger log1 = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
		Logger log2 = Logger.getLogger("my");
		Logger log3 = Logger.getLogger("my.other");
		log3.addHandler(new FileHandler("MyLog"));
		
		
		log2.setLevel(Level.FINE);
		
		log3.info("Started");
		log3.info("Finished");

	}

}
