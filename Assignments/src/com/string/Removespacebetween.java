package com.string;

public class Removespacebetween {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="     Hello    new      world        ";
		boolean firstSpace=true;
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c!=' ') {
				System.out.print(c);
		
				firstSpace=true;
			}
			else
			{
				if((firstSpace==true) && (i!=0))					
				System.out.print(c);
				firstSpace=false;
			}
		}
	}

}
