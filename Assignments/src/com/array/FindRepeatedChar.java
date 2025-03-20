package com.array;

public class FindRepeatedChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="amma";
		char[] a=s.toCharArray();
for(int i=0;i<a.length-1;i++) {
	if(a[i]==a[i+1]) {
		System.out.println(a[i]+" repeats in the string");
	}
}
	}

}
