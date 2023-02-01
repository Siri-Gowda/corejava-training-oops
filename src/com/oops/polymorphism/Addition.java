package com.oops.polymorphism;
public class Addition{

	
	public void sum(int a,int b) { 
		int c = a+b;
		System.out.println("Addition of two numbers:"+c);
		}
	/*public void sum (int a,int b,int c) {
		int d = a+b+c;
		System.out.println("Addition of three numbers:"+d);}*/
	public static void main(String args[]) {
	
	//creating object
	Addition obj = new Addition();
	obj.sum(50, 30);
	//obj.sum(105, 200,300 );
	}
		
	
	}



	
   
	     
	

	


