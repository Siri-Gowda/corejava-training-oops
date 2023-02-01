package com.oops.inheritance;

public class Cat extends Doggy {
	public static void main(String args[]) {
		String i = "Catty";
		System.out.println(i);
		//creating object
		Cat c = new Cat();
		
		c.meow();
		
		
		
	}
	void meow() {
		System.out.println("meow....");
	}

}
