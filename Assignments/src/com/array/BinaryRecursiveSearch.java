package com.array;

public class BinaryRecursiveSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {12,23,24,45,56};
		int find=100;
		int n=a.length;
		
			int low=0;
			int high=n-1;
			
			int result=binarysearch(a,find,low,high);
			if(result==1)
			System.out.println("found "+find );
			else
				System.out.println("not found" );
			}
	

	private static int binarysearch(int[] a, int find, int low, int high) {
		// TODO Auto-generated method stub
		int mid=(low+high)/2;
		if(low<=high) {
			if(find==a[mid])
				return 1;
			else if(find>a[mid])
				return binarysearch(a,find,mid+1,high);
			else if(find<a[mid])
				return binarysearch(a,find,low,mid-1);
		}
		return -1;		
	}

}
