package com.oops.polymorphism;

public class OverrideMain {
	public static void main(String args[]) {
		
		ParentOverride parent = new ParentOverride();
		parent.getPersonDetails("Gagan Vihar", 2, 'M');
		System.out.println( "Name= " +parent.name+",Age = "+parent.age+",Gender =" +parent.gender);
						
	   ChildOverride child = new ChildOverride();
	   child.getPersonDetails("Deekshitha", 5, 'F');
	   System.out.println("Name =" +child.name+",Age = "+child.age+" ,Gender =" +child.gender);
	   
	}

}
