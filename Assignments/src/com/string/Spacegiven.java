package com.string;

public class Spacegiven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="HelloNewWorld";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c>='A' && c<='Z' && i!=0) {
				System.out.print(" "+c);
			}
			else
				System.out.print(c);
		}
	}

}
