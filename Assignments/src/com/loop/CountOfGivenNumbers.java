package com.loop;

public class CountOfGivenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
long no=12345678789l;
int count=0,total=0,remainder=0;
while(no>0) {
	remainder=(int) (no%10);
	System.out.println("Remainder "+remainder);
	no=no/10;
	System.out.println("Number is "+no);
	total=total+remainder;
	count=count+1;
	
	
}
System.out.println("count is "+count);
System.out.println("Total is "+total);
	}

}
