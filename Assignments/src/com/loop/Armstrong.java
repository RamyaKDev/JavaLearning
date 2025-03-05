package com.loop;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int no=153;
int no1=153,armstrong=0,no2=0;
while(no>0) {
	no2=no%10;
	armstrong=armstrong+(no2*no2*no2);
	no=no/10;
}
System.out.println(armstrong);
if(armstrong==no1) 
	System.out.println(no1+" is armstrong number");
else
	System.out.println(no1+" is not armstrong number");
	}

}
