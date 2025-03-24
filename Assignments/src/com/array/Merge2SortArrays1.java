package com.array;

public class Merge2SortArrays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,3,5};
		int[] b= {2,4,6};
		int a1=a.length;
		int b1=b.length;
		int c1=a1+b1;
		int[] c=new int[c1];
		
		int k=0;
		//copied a array into c
		for(int i=0;i<a1;i++) {
			c[k]=a[i];
			k++;
		}
		//System.out.println(k+" current k index after a added");
		//copied b array into c
		for(int j=0;j<b1;j++) {
			c[k]=b[j];
			k++;
		}
		System.out.println("Combined array Before sorting");
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]+" ");
		}
		sortarray(c,c1);
		System.out.println(" ");
		System.out.println("After sorting");
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]+" ");
		}
	}

	private static void sortarray(int[] c, int c1) {
		// TODO Auto-generated method stub
		
		for(int j=1;j<c.length;j++) {
			for(int i=0;i<c.length-j;i++) {
				if(c[i]>c[i+1]) {
					int temp=c[i];
					c[i]=c[i+1];
					c[i+1]=temp;
				}
				
			}
		}
	}

	

}