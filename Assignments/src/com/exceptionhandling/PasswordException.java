package com.exceptionhandling;

public class PasswordException extends Exception {
	public void check(String pwd) throws PasswordException {
		if(pwd.length()<8) {
			PasswordException pe=new PasswordException();
			throw pe;
		}
	}


}
