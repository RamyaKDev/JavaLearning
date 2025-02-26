package com.array;

public class BinarySearch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearch1 bs= new BinarySearch1();
		int a[]= {4,8,25,34,67,89,90,97};
		//int n=a.length;
		int s=80;
		System.out.println("outside method");
		int result= bs.search(a,s);
		if(result==-1)
			System.out.println("Element not found");
		else
			System.out.println("Element found at the index "+result);
		
	}
int search(int a[],int s) {
	int low=0;
	int high=a.length-1;
while(low<=high) {
	 int mid=(low+high)/2;
	 if(a[mid]==s) {
		 return mid;
	 }
	if(a[mid]<s) {
		low=mid+1;}
	if(a[mid]>s) {
		high=mid-1;
	}
}
return -1;
}
}
