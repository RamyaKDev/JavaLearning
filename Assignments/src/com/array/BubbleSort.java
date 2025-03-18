package com.array;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a= {24,78,34,45,19};
//for(int i=0;i<a.length;i++) {
//	System.out.print(a[i]);
//}
for(int j=1;j<a.length;j++) {
	for(int i=0;i<a.length-j;i++) {
		if(a[i]>a[i+1]) {
			int temp=a[i];
			a[i]=a[i+1];
			a[i+1]=temp;
		}
		
	}
}
	for(int i=0;i<a.length;i++) {
		System.out.print(a[i]+" ");
	}
	}

}
