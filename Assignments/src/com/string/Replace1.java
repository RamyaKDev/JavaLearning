package com.string;

public class Replace1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello new world";
		int s1=s.length();
		String r="new";
		int r1=r.length();
		String c="happy";
	int begin=s.indexOf("n");
	int end=s.indexOf("w");
	System.out.println(begin);
	System.out.println(end);
	String result=s.substring(0,begin)+c+s.substring(end+1,s1 );
	System.out.println(result);
	}

}
