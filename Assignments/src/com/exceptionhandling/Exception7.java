package com.exceptionhandling;

public class Exception7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
validate(13);
		}
		catch(ArithmeticException ae) {
			
		}
System.out.println("rest of the code");
	}

	private static void validate(int i) {
		// TODO Auto-generated method stub
		if(i<18) {
			throw new ArithmeticException("Not eligible to vote");
		}
		else
		{
			System.out.println("Eligible to vote");
		}
	}

}
