package com.array;

public class SubarraywithSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4,1,3,5,6};
		int sum=7;
		System.out.println("Finding subarrays with sum");
		for(int j=0;j<a.length;j++) {
		int num=a[j];
		for(int i=j+1;i<a.length;i++) {
			if(num+a[i]==sum)
			{
				System.out.println(num+" "+a[i]);
			}
			
		}
		}
	}

}
