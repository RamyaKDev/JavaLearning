package com.string;

public class Alternativelyupperlower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="HELLOWORLD";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			
			if((i%2!=0) && (c>='A' && c<='z')) {
				//System.out.println(i+" "+c);
				System.out.print((char)(c+32));
			}
			else {
				
				System.out.print(c);
			}
		}
	}

}
