package com.edu;

public class Fibonacci1 {

	public static void main(String[] args) {
		int count = 8;
		System.out.println(count + "th fibonacci: " + fibNth(count - 1) + "; steps: " + counterNth);
		
		System.out.println();
		System.out.println(count + "th fibonacci: " + fibSeriesNth(count, 0, 1) + "; steps: " + counterSNth);
		
		System.out.println();
		fibSeries(count, 0, 1);
		System.out.println("Series till N: " + count + "; steps: " + counterS);
	}

	static int counterNth = 0;
	public static int fibNth(int number) {
		counterNth++;
		if(number > 1) {
			return fibNth(number - 1) + fibNth(number - 2);
		}
		return number;
	}
	
	static int counterS = 0;
	static int indexS = 1;
	public static void fibSeries(int count, int n1, int n2) {
		counterS++;
		if (count > 0) {
			if (n1 == 0) {
				count--;
				System.out.println(indexS++ + " -> " + n1);
			}
			count--;
			System.out.println(indexS++ + " -> " + n2);
			fibSeries(count, n2, n1 + n2);
		}
	}
	
	static int counterSNth = 0;
	public static int fibSeriesNth(int count, int n1, int n2) {
		counterSNth++;
		if (count > 0) {
			if (n1 == 0) {
				count--;
			}
			count--;
			return fibSeriesNth(count, n2, n1 + n2);
		}
		return n1;
	}

	public static int fact(int number) {
		if (number == 0) {
			return 1;
		}
		return number * fact(number - 1);
	}

}
