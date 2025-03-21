package com.array;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {24,78,34,45,19};
		System.out.println("Array before Reverse");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println(" ");
		System.out.println("Array after Reverse");
		for(int i=4;i>=0;i--) {
			System.out.print(a[i]+" ");
		}
		
	}

}
