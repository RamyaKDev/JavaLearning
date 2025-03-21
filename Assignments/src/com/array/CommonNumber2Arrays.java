package com.array;

public class CommonNumber2Arrays {
//Finding Common numbers or intersection of 2 arrays
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,3,5,8,4};
		int[] b= {3,1,4,7,2,6};
		System.out.println("common numbers ");
		for(int i=0;i<a.length;i++) {
			int key=a[i];
			for(int j=0;j<b.length;j++) {
				if(key==b[j]) {
					
					System.out.print(key+" ");
				}
			}
		}
	}

}
