package com.string;

public class StringPascal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String name="hello";
		String name="HELLO";
		for(int i=0;i<name.length();i++) {
		char s=name.charAt(i);
		//System.out.print((char)(s-32));
		System.out.print((char)(s+32));
			}
	}
}
