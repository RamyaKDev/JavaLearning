package com.array;

public class NumberChange101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a= {0,1,1};
for(int i=0;i<a.length;i++)
{
	System.out.print(a[i]+" ");
}
System.out.println(" ");

for(int i=0;i<a.length-1;i++)
{
	if(a[i]==a[i+1]) {
		int temp= a[i-1];
		a[i-1]=a[i];
		a[i]=temp;
	}
}

for(int i=0;i<a.length;i++)
{
	System.out.print(a[i]+" ");
}
	}

}