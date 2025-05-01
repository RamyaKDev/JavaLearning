package com.first;

public class Patternalternative0and1 {
	public static void main(String[] args) {
			
		int[] a= {1,1,1,1,-1,-1,-1,-1};	
		int n=a.length;
		int m=n-1;//last index
		for(int i=0;i<n/2;i++) {
			System.out.print(a[i]+" "+a[m-i]+" ");
		}
		
	}
}




//int[] a= {1,1,1,1,0,0,0,0};	