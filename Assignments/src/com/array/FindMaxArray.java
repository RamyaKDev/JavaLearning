package com.array;

public class FindMaxArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {4,2,9,6,7,3};
		int max=find_max(a);
		System.out.println("max num is "+max);
	}

	private  static int find_max(int[] a) {
		// TODO Auto-generated method stub
		int max=a[0],count=0;
		for(int i=0;i<a.length;i++) {
			 //max=a[0];
		if(max<a[i]) {
			max=a[i];
			
		}
		
	}
		return max;
	}

}
