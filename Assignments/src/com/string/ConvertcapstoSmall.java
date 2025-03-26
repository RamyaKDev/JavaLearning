package com.string;

public class ConvertcapstoSmall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="HELLO123";
		for(int i=0;i<name.length();i++) {			
		char s=name.charAt(i);
		if((s>='A' && s<='Z')||(s>='a' && s<='z'))
			System.out.print((char)(s+32));
		else
			System.out.print(s);
			}
	}

}
