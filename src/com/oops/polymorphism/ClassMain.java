package com.oops.polymorphism;

public class ClassMain {
	public static void main(String args[]) {
		Pet p = new Pet();
		Dog d = new Dog();
		Cat c = new Cat();
		p.petSound();
		d.petSound();
		c.petSound();
	}

}
