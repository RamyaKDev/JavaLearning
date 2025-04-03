package com.exceptionhandling;

public class Exception3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no1=12,no2=3;
		try{
			System.out.println(no1/no2);
			try {
				int[] a=new int[no2];
				System.out.println(a[a.length+1]);
			}
			catch(ArrayIndexOutOfBoundsException aa) {
				System.out.println("Index out of bound");
			}
		}
		catch(ArithmeticException ae) {
			System.out.println("Give other than 0");
		}
	}
}
