package com.bionic.javase.week3;

import java.io.InputStream;

public class StreamSource extends MySourse {
	InputStream istream;
	
	public static void main(String args[]) {
		MySourse ms = new StreamSource(System.in);
	}
	
	public StreamSource() {
		
	}
	
	public StreamSource(InputStream istream) {
		this.istream = istream;
	}

	@Override
	public String getData() {
		// TODO Auto-generated method stub
		
		return null;
	}

}
