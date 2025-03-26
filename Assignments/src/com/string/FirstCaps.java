package com.string;

public class FirstCaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="ramya";
		char s=name.charAt(0);
		System.out.print((char)(s-32));
		for(int i=1;i<name.length();i++) {
			char s1=name.charAt(i);
			System.out.print(s1);
		}
		
	}

}
