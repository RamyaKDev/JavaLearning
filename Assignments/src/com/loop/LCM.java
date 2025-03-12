package com.loop;

public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int no1=4;
int no2=6;
int big=0;
if(no1>no2)
	big=no1;
else
	big=no2;
int limit=1,lcm=1;
while(limit<100) {
	if(big%no1==0 && big%no2==0) {
		lcm=big;
	}
	big=big+1;
	limit=limit+1;
	
}
System.out.println(lcm);

	}

}
