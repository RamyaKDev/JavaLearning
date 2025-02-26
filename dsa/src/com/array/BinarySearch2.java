package com.array;

public class BinarySearch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				BinarySearch2 bs= new BinarySearch2();
				int a[]= {4,8,25,34,67,89,90,97};
				int n=a.length;
				int s=90 ,low=0,high=n-1;
				System.out.println("outside method");
				int result= bs.search(a,s,low,high);
				if(result==-1)
					System.out.println("Element not found");
				else
					System.out.println("Element found at the index "+result);
				
			}
		int search(int a[],int s, int low, int high) {
			//int low=0;
			//int high=a.length-1;
			if(low<=high) {
				int mid=(low+high)/2;
				if(a[mid]==s)
					return mid;
				if(a[mid]>s)
					return search(a,s,low,mid-1);
				if(a[mid]<s)
					return search(a,s,mid+1,high);
			}
			return -1;
	}

}
