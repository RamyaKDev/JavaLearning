package com.patterns;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=5;
		
fibonacci(no);

	}

	

	private static void fibonacci(int no) {
		int f1=0,f2=1,f3=0,count=0;
		System.out.print(f1+" "+f2);
		while(count<no) {
			f3=f1+f2;
			if(f3>no)
				break;
			System.out.print(" "+f3);
			
			f1=f2;
			f2=f3;
			count++;
		}
		
			
		
	}

}
