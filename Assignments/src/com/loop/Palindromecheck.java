package com.loop;

public class Palindromecheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=34543,n,sum=0,i1=34543;
		while(i>0) {
			n=i%10;
			sum=(sum*10)+n;
			i=i/10;
		}
	if(i1==sum) {
		System.out.println("Palindrome number");
	}
	else
		System.out.println("Not Palindrome number");
	}

}
