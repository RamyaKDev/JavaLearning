package com.loop;

public class Emirp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int no=13;
boolean prime=isprime(no);
int emirpno=emirp(no);
boolean emirp=isprime(emirpno);
if(prime==false && emirp==false) {
	System.out.println(no+" is emirp number");		
}
else
	System.out.println(no+" is not emirp number");
	}
	public static boolean isprime(int no) {
		boolean flag=false;
		if(no>1) {
		 flag=false;
		for(int i=2;i<no/2;i++) {
			if(no%i==0) {
				flag=true;
				break;
			}
		}
		
		}
		return false;
		
	}
	public static int emirp(int no) {
		int emirp=0;
		while(no>0) {
			emirp=emirp+no%10;
			no=no/10;
			
		}
		return emirp;
		
	}
}
