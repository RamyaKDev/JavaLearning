package com.string;

public class StringMethods1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Adhithishri";
		System.out.println(s);
		for(int i=0;i<s.length();i++) {
			System.out.println("charAt: "+s.charAt(i));
		}
		System.out.println();
		System.out.println("charAt: "+s.charAt(5));
		System.out.println("indexOf: "+s.indexOf('r'));
		System.out.println("lastIndexOf: "+s.lastIndexOf('i'));
		System.out.println("toUpperCase: "+s.toUpperCase());
		System.out.println("toLowerCase: "+s.toLowerCase());
		System.out.println("contains: "+s.contains("hai"));
		System.out.println("startsWith: "+s.startsWith("Ad"));
		System.out.println("endsWith: "+s.endsWith("ri"));
		
	}

}
