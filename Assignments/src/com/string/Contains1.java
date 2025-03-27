package com.string;

public class Contains1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="today is wednesday";
		String key="day";
		int len=key.length();
		for(int i=0;i<=s.length()-len;i++) {
		String n=s.substring(i,len+i);
		if(key.equalsIgnoreCase(n))
			System.out.println("Present at "+i);
	}
	}

}
