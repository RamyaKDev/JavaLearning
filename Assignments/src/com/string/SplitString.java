package com.string;

public class SplitString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Good Morning Have a nice day";
		System.out.println(s.split(" "));// Prints array
		//so store in String array
		String[] words=s.split(" ");
		for(int i=0;i<words.length;i++) {
			System.out.println(words[i]);
		}
	}

}
