package com.array;

public class RotateArrayLeft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a= {1,2,3,4,5};
int n=a.length;
int d=2;// d elements have to move to left
rotatearray(a,n,d);
for(int i=0;i<n;i++) {
	System.out.print(a[i]+" ");
}
	}

	private static void rotatearray(int[] a, int n, int d) {
		//reversearray(array,start_index,end_index)
		reversearray(a,0,d-1);//1st block array 1,2 index
		reversearray(a,d,n-1);
		reversearray(a,0,n-1);
		
	}

	private static void reversearray(int[] a, int start, int end) {
		// TODO Auto-generated method stub
		while(start<end) {//0<1
			int temp=a[start];// temp=1;
			a[start]=a[end];// 0th_index=2
			a[end]=temp;//1st index=1    [2,1]
			start++;
			end--;// to terminate the loop start++ and end--
			// do same for next 2 methods too
		}
	}

}
