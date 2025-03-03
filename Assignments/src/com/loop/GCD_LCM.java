package com.loop;

public class GCD_LCM {
	int no1=36;
	static int lcm=0;
	int no2=60;
	static int gcd = 0;
	//static int ;
	//GCD= Greatest Common Divisor
	public static int findgcd(int no1,int no2) {
	for(int i=1;i<Math.min(no1, no2);i++) {
		if(no1%i==0 && no2%i==0) {
			gcd=i;
		}
		
	}
	return gcd;

	}
	
	//LCM=Least Common Multiplier
	public static int findlcm(int no1,int no2) {
		lcm=(no1*no2)/findgcd(no1,no2);
		return lcm;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int gcd=findgcd(36,60);
		int lcm=findlcm(36,60);
System.out.println("Greatest Common Divisor :"+gcd);
System.out.println("Least Common Multiplier :"+lcm);


	}

}
