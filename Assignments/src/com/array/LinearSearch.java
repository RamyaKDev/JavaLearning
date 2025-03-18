package com.array;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a= {23,12,45,24,56};
int find=12;
boolean flag=false;
for(int i=0;i<a.length;i++) {
	if(a[i]==find) {
		System.out.println("found in "+i+" position");
		flag=true;
		break;
	}
	
}
if(flag==true)
	System.out.println("found");
else
	System.out.println("not found");
	}

}
