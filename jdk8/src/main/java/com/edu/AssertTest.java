package com.edu;

public class AssertTest {

	public static void main(String[] args) {
		String name = null;
		try {
			assert name != null;
		} catch (AssertionError e) {
			e.printStackTrace();
		}

		try {
			assert name != null : "Name must not be null";
		} catch (AssertionError e) {
			e.printStackTrace();
		}
	}
}