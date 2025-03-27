package com.string;

public class StartswithPgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="today is wednesday";
		String key="to";
		int j=0;
		
		
		for(int i=0;i<key.length();i++) {
			char c=key.charAt(i);
		if(c==s.charAt(j)) {
			
			System.out.println("Yes present "+j);
			j++;
		}
		
		}
		
	}

}
