package com.string;

public class Contains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="today";
		String key="day";
		int j=0;
		for(int i=0;i<s.length();i++) {
		char c=key.charAt(j);
		if(c==s.charAt(i)) {
			j++;
			
		}
		if(j==key.length()) {
			System.out.println("Key found in "+j);                                                                                                                                                         
		}
	}
	}
}
