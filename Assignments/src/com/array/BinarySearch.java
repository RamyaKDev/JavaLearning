package com.array;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {12,23,24,45,56};
		int find=60;
		int n=a.length;
		
			int low=0;
			int high=n-1;
			int mid=(low+high)/2;
			while(low<=high) {
				if(find==a[mid]) {
					System.out.println("found "+find+" in "+mid+" position");
				break;
				}
				else if(find>a[mid]) {
					low=mid+1;
				}
				else if(find<a[mid]) {
					high=mid-1;
				}
				mid=(low+high)/2;
			}
			
		if(low>high)
			System.out.println("No such value is present in the array");
		
		
	}

}
