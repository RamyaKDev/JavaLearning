package com.exceptionhandling;

import java.util.Scanner;

public class Exception6throw {

	public static void main(String[] args) throws PasswordException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter password");
		String pwd=sc.next();
		PasswordException pe=new PasswordException();
		
		 pe.check(pwd);

}
}