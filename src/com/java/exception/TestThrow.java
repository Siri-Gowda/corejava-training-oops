package com.java.exception;

public class TestThrow 
{
	public void div(int a,int b)
	{
		if(b==0)
		{
			throw new NullPointerException();
		}
		else
		{
			int c=a/b;
			System.out.println(c);
		
		}
		
	}
	public static void main(String args[]) {
		TestThrow t = new TestThrow();
		t.div(20, 0);
		
	}

}

