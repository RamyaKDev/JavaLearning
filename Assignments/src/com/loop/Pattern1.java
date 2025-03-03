package com.loop;
//1 0 1 0 1  
//1 0 1 0 1  
//1 0 1 0 1  
//1 0 1 0 1  
//1 0 1 0 1  
public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=1;
for(int i=1;i<=5;i++) {
	for(int j=1;j<=5;j++) {
		if(j%2!=0) {
			System.out.print(no);
			System.out.print(" ");
		}
		else{
		System.out.print(no-1);
		System.out.print(" ");
		}
}
	System.out.println(" ");
	}
	}
}
