package com.oops.polymorphism;

public class Overloading  {
	// method with no parameters
	void add() {
		int a = 20, b = 50;
		int c = a + b;
		System.out.println("Sum=" + c);
	}

	// method with parameters
	void add(int x, int y) {
		int z = x + y;
		System.out.println("Sum=" + z);
	}
	void add(int i,int j,int k) {
		int  s= i*j*k;
		System.out.println("Multiplication of three parameters= "+s);
	}

	// Constructor with no arguments
	Overloading() {
		System.out.println("Constructor without arguments");
	}

	// Constructor with arguments
	Overloading(String name, char firstLetter) {
	System.out.println("Constructor with arguments " + name + "" + firstLetter);

	}
}
