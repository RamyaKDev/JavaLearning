package com.array;

public class MissingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a= {1,2,3,5,6};
for(int i=0;i<a.length;i++) {
	if(a[i]+1==a[i+1]) {
		continue;
	}
	else {
		a[i+1]=a[i]+1;
		System.out.println("Missing number "+a[i+1]);
		break;
	}
	
}

	}

}
