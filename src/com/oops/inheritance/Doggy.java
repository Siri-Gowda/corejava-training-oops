package com.oops.inheritance;

public class Doggy extends Dog {
	public static void main(String args[]) {
		String i = "Snoopy";
		System.out.println(i);
		//creating object
		Doggy d = new Doggy();
		d.eat();
		d.run();
		d.play();
		d.bark();
		
		
	}

}
