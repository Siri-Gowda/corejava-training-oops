package com.oops.polymorphism;

public class MethodOverloading {
	
	public static void main(String args[]) {
		//object creation 
		Overloading overload = new Overloading();
		overload.add();
		overload.add(444, 555); 
		overload.add(10, 20, 30);
		
		Overloading overloading= new Overloading("Shireesha ", 'S');
		}
	}
