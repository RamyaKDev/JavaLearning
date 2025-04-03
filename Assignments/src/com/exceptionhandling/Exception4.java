package com.exceptionhandling;

public class Exception4 {

	public static void main(String[] args) {
		try{
		checkoddeven();
		}
		catch(ArithmeticException ae) {
			System.out.println("give number");
		}
	}

	public static void checkoddeven() throws ArithmeticException
	{	// TODO Auto-generated method stub
		int no1=10;
	
		if(no1%0==0)
			System.out.println("Even number");
		else
			System.out.println("Odd number");
		
		
	}

}
