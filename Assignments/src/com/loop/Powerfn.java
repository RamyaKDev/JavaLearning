package com.loop;

public class Powerfn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int p=3,b=2;

//System.out.println(Math.pow(b,p ));
powerfn(p,b);


	}

	private static void powerfn(int p, int b) {
		// TODO Auto-generated method stub
		int result=1,n=0;
		
		while(true) {
			if(p==0) {
				System.out.println("power is 0 "+1);
				break;
			}
			result=result*b;
			System.out.println(result);
			n++;
			if(n==p)
				break;
	}
		System.out.println(b+" power of "+p+" is "+result);

}
}