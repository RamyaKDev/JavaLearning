package com.exceptionhandling;

import java.util.Scanner;

public class Exception2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no1=12,no2=0;
		try{
			System.out.println(no1/no2);
		}
		catch(ArithmeticException ae) {
			System.out.println("Give other than 0");
			Scanner sc=new Scanner(System.in);			
			no2=sc.nextInt();
			try {
				System.out.println(no1/no2);
			}
			catch(ArithmeticException ae1) {
				System.out.println("check input");
			}
		}
	
}
}
		
		
		

