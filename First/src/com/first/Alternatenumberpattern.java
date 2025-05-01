package com.first;

public class Alternatenumberpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a= {1,2,3,4,5,6,7,8,9,10};
int n=a.length;
int m=n-1;//last index
for(int i=0;i<n/2;i++) {
	System.out.print(a[i]+" "+a[m-i]+" ");
}
	}

}
