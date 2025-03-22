package com.array;

import java.util.Scanner;

public class UserInputTwoDimen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[][] a=new int[2][2];
		
		for(int rows=0;rows<a.length;rows++) {
			int total=0;
			for(int cols=0;cols<a[rows].length;cols++) {
				System.out.println("Enter the value: ");
				a[rows][cols]=sc.nextInt();
				total=total+a[rows][cols];
	}
			System.out.println(total);
			
		}
	}

}
