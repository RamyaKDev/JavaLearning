package com.loop;
//1 2 3 4 5  
//10 9 8 7 6  
//11 12 13 14 15  
//20 19 18 17 16  
//21 22 23 24 25  
public class Seq9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=1,rev=0,times=1;
		while(count<=5) {
			
	for(int i=1;i<=5;i++) {
		System.out.print(times+" ");
		times=times+1;
	}
	count=count+1;
	System.out.println(" ");
	if(count==6)
		break;
	rev=times+4;
	
		for(int j=1;j<=5;j++) {
		
		System.out.print(rev+" ");
		rev--;
		times=times+1;
	}
	count=count+1;
	System.out.println(" ");
	if(count==6)
		break;

	}
	
	}
}

