package com.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter two numbers");
int no1=sc.nextInt();
int no2=sc.nextInt();
try{
System.out.println(no1/no2);
int[] a=new int[no2];
System.out.println(a[a.length+1]);
}

catch(InputMismatchException | ArithmeticException | ArrayIndexOutOfBoundsException | NegativeArraySizeException exc ) {
	String msg=exc.getMessage();
	System.out.println(msg);
}
//catch(ArithmeticException ae) {
//	System.out.println("Enter number other than zero");
//}
//catch(ArrayIndexOutOfBoundsException abe) {
//	System.out.println("Enter number other than zero");
//}
//catch(NegativeArraySizeException abe) {
//	System.out.println("Enter number in positive");
//}
catch(Exception e) {
	System.out.println("check input");
}
finally {
	System.out.println("finally block");
}



	}

}
