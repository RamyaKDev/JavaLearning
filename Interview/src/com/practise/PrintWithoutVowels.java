package com.practise;

import java.util.Scanner;

public class PrintWithoutVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the name to display without vowels");
	String name=scanner.next();
	
	for(int i=0;i<name.length();i++) {
		if(!(name.charAt(i)=='A'||name.charAt(i)=='a'||name.charAt(i)=='E'||name.charAt(i)=='e'
				||name.charAt(i)=='I'||name.charAt(i)=='i'||name.charAt(i)=='O'||name.charAt(i)=='o'
				||name.charAt(i)=='U'||name.charAt(i)=='u')) {
			System.out.print(name.charAt(i));
		}
	}
	}

}
