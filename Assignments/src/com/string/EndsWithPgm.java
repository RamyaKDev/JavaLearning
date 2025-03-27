package com.string;

public class EndsWithPgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="wednesday";
		String key="day";
		int key1=key.length()-1;
		int s1=s.length()-1;		
		for(int i=s1;i>=0;i--) {		
		if(key.charAt(key1)==s.charAt(i)) {			
			System.out.println("present in index : "+i);
			if(key1==0)
				break;
			key1--;
		}
		
		}
		
	}

}
