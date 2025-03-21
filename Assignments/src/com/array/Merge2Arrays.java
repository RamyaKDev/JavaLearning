package com.array;

public class Merge2Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3};
		int[] b= {4,5,6};
		
		System.out.println("Merging 2 arrays ");
		
		int a1=a.length;//first array length
		int b1=b.length;//second array length
		
		int c1=a1+b1;//new array size is first+second
		
		int[] c=new int[c1]; //   Creating a new array
		// Loop to store the elements of first
        // array into resultant array
		
		for(int i=0;i<a1;i++) {
			// Loop to store the elements of first
	        // array into resultant array
			c[i]=a[i];
		}
		// Loop to store the elements of second
        // array into resultant array
		for(int i=0;i<b1;i++) {
			// Loop to store the elements of second
	        // array into resultant array
			c[a1+i]=b[i];// adding second array after 1st array so a1+i
		}
		for(int i=0;i<c1;i++) {//new array
			System.out.print(c[i]+" ");
			
		}
		
	}

}
