package com.edu;

import java.io.CharArrayReader;
import java.io.IOException;

public class AssertTest {

	public static void main(String[] args) {
		/*String name = null;
		try {
			assert name != null;
		} catch (AssertionError e) {
			e.printStackTrace();
		}

		try {
			assert name != null : "Name must not be null";
		} catch (AssertionError e) {
			e.printStackTrace();
		}*/
		
			String s = "abcdefgh";
			int stringLength = s.length();
			char chars[] = new char[stringLength];
		        s.getChars(0, stringLength, chars, 0);
		        CharArrayReader reader1 = new CharArrayReader(chars);
		        CharArrayReader reader2 = new CharArrayReader(chars, 1, 4);
		        int i;
		        int j;
		        try {
		            while ((i = reader1.read()) == (j = reader2.read())) {
		                System.out.print((char) i);
		            }
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
		    }

		
		
}