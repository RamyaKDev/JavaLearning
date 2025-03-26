package com.string;

public class Removespaceinend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="     Hello         ";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c!=' ') {
				System.out.print(c);
			}
		}
	}

}
