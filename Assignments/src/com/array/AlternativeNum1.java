package com.array;

public class AlternativeNum1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {3,6,9};
		int[] b= {5,10,15};
		int a1=a.length;
		int b1=b.length;
		int c1=a1+b1;
		int[] c=new int[c1];
		int k=0;
		for(int i=0;i<a1;i++) {
			if(k%2==0) {
				c[k]=a[i];
				k=k+2;
			}
		}

		k=1;
		for(int j=0;j<b1;j++) {
			if(k%2!=0) {
				c[k]=b[j];
				k=k+2;
			}
		}
		for(int i=0;i<c1;i++) {
			System.out.print(c[i]+" ");
			}
	}

}
