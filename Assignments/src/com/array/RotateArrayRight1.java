package com.array;

public class RotateArrayRight1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {10,20,30,40,50};
		int temp=a[4];
		for(int i=4;i>0;i--) {
			a[i]=a[i-1];
		}
		a[0]=temp;
		for(int i=0;i<a.length;i++){
		System.out.print(a[i]+" ");	
		}
	}

}
