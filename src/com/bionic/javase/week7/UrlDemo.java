package com.bionic.javase.week7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class UrlDemo {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://www.google.com");
			BufferedReader br= new BufferedReader(new InputStreamReader( url.openStream() ));
			String TempSt;
			while ((TempSt=br.readLine())!=null)
			{System.out.println(TempSt+'\n');}
			br.close();
			}
			catch (MalformedURLException e) {System.out.println("Error in URL");
			System.exit(2);}
			catch (IOException e) {System.out.println("Read Error");
			System.exit(3);}


	}

}
