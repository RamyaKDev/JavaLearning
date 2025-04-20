package com.practise;

import java.util.Scanner;

public class Fibon_Prime_sum {
public static void main(String[] args) {
	 int total=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter First number");
	int start=sc.nextInt();
	System.out.println("Enter Second number");
	int end=sc.nextInt();
	System.out.println("Enter third number");
	int limit=sc.nextInt();
	findfibonacci(start,end,limit,total);	
	if( total<limit) {
		System.out.println("No");
	}
	else{
		System.out.println("yes");
	}
}

private static void findfibonacci(int start, int end,int limit,int total) {
	int f1=start;
	int f2=1;
	int f3=0;
	int n=end;	
	while(f1<n) {
		System.out.print(f1);
		 prime(f1,limit,total);
		f3=f1+f2;		
		f1=f2;
		f2=f3;		
	}	
}

private static void prime(int n,int limit,int total) {
	// TODO Auto-generated method stub
	
	boolean prime=true;
	if(n==1||n==0) {
		prime = false;		
	}
	else {
	for(int i=2;i<=n/2;i++) {
		if(n%i==0) {
			prime = false;
			break;
		}		
	}
	if(prime==true) {		
		 total=total+n;
		}
	
}
	
}
}

