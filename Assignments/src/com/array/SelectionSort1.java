package com.array;

public class SelectionSort1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {5,2,1,4};
		  System.out.print("Before Sorting ");
		  for(int i=0; i<ar.length; i++)
				System.out.print(ar[i]+ " ");
		  
	     for (int j = 0;  j<ar.length-1; j++)
	     {
			int big = 0, big_index = 0;
			for(int i=0; i<ar.length-j; i++)
			    {
			    if(ar[i]>big)
			        {
			        big_index = i;
			        big = ar[i];
			        }
			    }
			//System.out.println(big_index);
			int len = ar.length-(j+1);
			int temp = ar[len]; //temp = 87
			ar[len] = big;
			ar[big_index] = temp;
	    }
	     System.out.print("After Sorting ");
			for(int i=0; i<ar.length; i++)
				System.out.print(ar[i]+ " ");

	}

}
