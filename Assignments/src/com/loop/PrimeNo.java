package com.loop;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=7;
		int div=2;			
		boolean prime=true;
		while(no>=div) {
			if(no%div==0) {
				System.out.println(no+" Not a prime number");
				prime=false;
				break;
			}
			div++;
			
			
		}
		if(prime==true) {
			System.out.print(no+" ");
			
		}
		
		}
	}

