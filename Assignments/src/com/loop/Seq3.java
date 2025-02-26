package com.loop;

public class Seq3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//F2, __, D8, C16, B32
		char a[]= {'F','E','D','C','B','A'};
		int no=1,i=0;
		while(i<=5) {
			no=no*2;
			System.out.println(a[i]+""+no);
			i++;
		}
	}

}
