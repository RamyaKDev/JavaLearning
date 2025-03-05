package com.loop;

public class Neon_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=9,sum=0;
		int squareNo=no*no;
		System.out.println(squareNo);
		while(squareNo>0) {
		sum=sum+squareNo%10;
		squareNo=squareNo/10;
		}
		System.out.println(sum);
		if(sum==no)
			System.out.println(no+" is neon number");
		else
			System.out.println(no+" is not neon number");
	}

}
