/**
 * 
 */
package com.loop;

/**
 * 
 */
public class GCD {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int no1=120;
int no2=100;
int small=0,div=1,gcd=0;
if(no1>no2)
	small=no2;
else
	small=no1;
while(div<=small) {
	if(no2%div==0 && no1%div==0) {
		gcd=div;		
	}
	
	div=div+1;
	
	
}
System.out.println(gcd);
	}

}
