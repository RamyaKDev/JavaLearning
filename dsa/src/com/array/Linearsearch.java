package com.array;

public class Linearsearch {
public  static int search(int a[],int n,int s) {
	for(int i=0; i<n;i++) {
		if(a[i]==s) 
			return i;
			}
	return -1;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {4,8,1,3,0,6,89};
int n=arr.length;
int s=6;
int result=search(arr,n,s);
if(result==-1) {
	System.out.println("Element not found");
}
else {
	System.out.println("Element found at the index "+ result);
}
}
	}


