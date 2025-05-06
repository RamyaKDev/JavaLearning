package com.first;

public class SecondHighestNum {

	public static void main(String[] args) {
		int[] a= {10,2,4,12};
		int largest=0;
		int second=0;
		for(int num:a) {
			if(num>largest) {//10>0 2>10 false 4>10 false 12>10 
				second=largest;//0 10
				largest=num;//10 12
			}
			else if(num>second && num!=largest) //2>0 4>2
			{
				second=largest;//2 4
			}
		}
		if(second==0)
			System.out.println("Not found");
		else
			System.out.println("Second Largest number is: "+second);
		
	}

}
