package com.loop;

public class PrimeNoGeneration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int low=3,high=10;
		int div=2;	
		boolean prime=true;
		while(low<high) {
		
		while(low>div) {
			if(low%div==0) {				
				prime=false;
				break;
			}
			div++;
							
		}
		
		if(prime==true) {
			System.out.print(low+" ");
			
			
		}
		low++;
		
		}
	}
	
}
