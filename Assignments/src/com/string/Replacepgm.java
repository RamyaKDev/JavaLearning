package com.string;

public class Replacepgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	StringBuffer s=new StringBuffer("Today is monday Today is monday Today is monday Today is monday Today is monday");
//		String s="Ramya";
		//System.out.println(s);
		String key="is";
		String n="was";
		int key1=key.length();
		for(int i=0;i<s.length()-key1;i++) {
		String p=s.substring(i,key1+i);
		//System.out.println(p);
		if(p.equalsIgnoreCase(key)) {			
			s.replace(i,key1+i, n);		
		
		}
		
	}
		System.out.println(s);
	}
}
