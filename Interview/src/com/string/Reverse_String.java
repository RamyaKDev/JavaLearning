package com.string;

public class Reverse_String {

	public static void main(String[] args) {
		String original="example";
		String reverse="";		
		char[] c=original.toCharArray();
		for(int i=c.length-1;i>=0;i--) {
			reverse+=c[i];
		}
		System.out.println(reverse);
	}

}
