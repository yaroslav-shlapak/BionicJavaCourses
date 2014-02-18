package com.bionic.javase.week1;

public class RegisterChange {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(changeRegister('A'));
		System.out.println(changeRegister('a'));
		System.out.println(changeRegister('B'));
		boolean b = true;
        int i = 0;
        do {
            if (i++>3) b=false;
            System.out.println(i);
        } 
      while (b);







	}
	
	public static char changeRegister(char ch) {
		int key = 32;
		if(ch >= 'a' && ch <= 'z')
			return (char) (ch - key);
		if(ch >= 'A' && ch <= 'Z')
			return (char) (ch + key);
		return '0';
	}

}
