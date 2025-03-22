package com.array;

public class RotateArrayLeft1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a= {10,20,30,40,50};
int temp=a[0];
for(int i=0;i<a.length-1;i++) {
	a[i]=a[i+1];
}
a[4]=temp;
for(int i=0;i<a.length;i++){
System.out.print(a[i]+" ");	
}
	}

}
