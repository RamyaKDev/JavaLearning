package com.string;

public class StringBufferBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s=new StringBuffer();
		System.out.println(s+" "+s.hashCode());
		s.append('R');
		System.out.println(s+" "+s.hashCode());
		s.append('a');
		System.out.println(s+" "+s.hashCode());
		s.append('m');
		System.out.println(s+" "+s.hashCode());
		s.append('y');
		System.out.println(s+" "+s.hashCode());
		s.append('a');
		System.out.println(s+" "+s.hashCode());
		System.out.println("toString() returns: "+s.toString()+" "+s);
	}

}
