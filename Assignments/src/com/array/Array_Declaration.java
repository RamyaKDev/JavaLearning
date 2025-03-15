package com.array;

public class Array_Declaration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[5];// Array declaration and instantiation
		int[] b= {1,2,3,4,5};//Array literal or Declaration, instantiation and initialization.
		int c[];// or int []c  Array declaration
		c=new int[5];// instantiation
		//int[] d=new int[-5];// NegativeArraySizeException
		//System.out.println(a[6]);//java.lang.ArrayIndexOutOfBoundsException
		
		//initialization
		a[0]=11;
		a[1]=12;
		a[2]=13;
		a[3]=14;
		a[4]=15;
		// int[] b= {1,2,3,4,5}; we can do initialization this way too.
		
		for(int i=0;i<a.length;i++) {
			//System.out.println(a[i]);
			System.out.println(b[i]);
		}
		
		
		
	}

}
