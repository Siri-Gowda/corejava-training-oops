package com.java.exception;

public class ArithmeticException {
	public static void main(String args[]) {
		int a = 35;
		int b = 0;
		try {
		int c = a/b;//35/0
				System.out.println(c);
		}catch(Exception ex) {
			System.out.println(ex);
		}
	}
}


