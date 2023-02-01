package com.oops.abstraction;

public class Lion extends Animal {
	public static void main(String args[]) {
		//creating object
		Lion l = new Lion();
		l.n();
		l.animal();
		l.place();
		l.sound();
		l.sleep();
		
	}
	public void n() {
		System.out.println("Animal Details");
	}
	

}
