package com.array;

public class FindingTotal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] marks= new int[5];
		int total=0;
		marks[0]=91;
		marks[1]=86;
		marks[2]=100;
		marks[3]=94;
		marks[4]=90;
		for(int i=0;i<marks.length;i++) {
			total=total+marks[i];
			
		}
		System.out.println("Total marks : "+total+" "+" percentage is : "+total/5);
	}

}
