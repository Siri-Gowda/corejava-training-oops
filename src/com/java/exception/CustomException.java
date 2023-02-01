package com.java.exception;

public class CustomException {
	public static void main(String args[]) throws NullPointerException, Exception
	{
		int i = 10;
		int j = 0;
		CustomException cust = new CustomException();
		try {
			int k = i/j;
		int k1 = cust.get(i, j);
		}catch(Exception ex){
		 System.out.println(ex);
			
			
		
		
		}
	
		
		
	}
	//using throws keyword
	public int get(int i,int j)throws NullPointerException,Exception {
		int k = i/j;
		return k;
		
		
	}

}
