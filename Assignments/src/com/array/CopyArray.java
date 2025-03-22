package com.array;

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {12,23,24,45,56};
		int[] c= new int[a.length];
		System.arraycopy(a, 1, c, 0, 4);
		System.out.println(String.valueOf(c));
		for(int i=0;i<c.length;i++) {
			 System.out.println(c[i]);
		}
//		 char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',    
//	                'i', 'n', 'a', 't', 'e', 'd' };    
//	        //declaring a destination array    
//	        char[] copyTo = new char[7];    
//	        //copying array using System.arraycopy() method    
//	        System.arraycopy(copyFrom, 2, copyTo, 0, 7);    
//	        //printing the destination array    
//	        System.out.println(String.valueOf(copyTo)); 
	}

}
