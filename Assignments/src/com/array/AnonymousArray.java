package com.array;

public class AnonymousArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
findno(new int[]{23,78,1,45,27});//anonymous array
	}

	private static void findno(int[] a) {
		// TODO Auto-generated method stub
		int no=1;
		for(int i=0;i<a.length;i++) {
		if(no==a[i])
			System.out.println("found the number "+a[i]);
		
	}
	}
}
