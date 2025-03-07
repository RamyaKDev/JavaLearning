package com.loop;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int no=5;
boolean flag=false;
if(no>1) {
	flag=false;
for(int i=2;i<no/2;i++) {
	if(no%i==0) {
		flag=true;
		break;
	}
}
if(flag==false)
System.out.println(no+" is a prime number");
else
	System.out.println(no+" is not a prime number");	
	}
}}