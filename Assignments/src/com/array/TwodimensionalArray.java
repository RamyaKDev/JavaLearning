package com.array;

public class TwodimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int[][] a=new int[3][2];
//a[0][0]=1;
//a[0][1]=2;
//a[1][0]=3;// This is how we can instantiate and initialize array
		
//		int[][] a= {{1,2,3},//00 01 02
//					{4,5,6},//10 11 12
//					{7,8,9}//20 21 22
//					};// 3 rows and 3 cols
		int count=0;
		int[][] a=new int[3][2];
		for(int rows=0;rows<a.length;rows++) {
			for(int cols=0;cols<a[rows].length;cols++) {
				a[rows][cols]=count;
				
				System.out.print(a[rows][cols]+" ");
				count++;
			}
			System.out.println(" ");
		}
	}

}
