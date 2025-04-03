package com.exceptionhandling;

public class Exception5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no1=12,no2=2;
		try{
			System.out.println(no1/no2);
		}
		catch(ArithmeticException ae) {
			System.out.println("check input");
		}
		finally {
			 no2=0;
			 try{
					System.out.println(no1/no2);
				}
				catch(ArithmeticException ae1) {
					System.out.println("check input");
				}
		}
	}

}
