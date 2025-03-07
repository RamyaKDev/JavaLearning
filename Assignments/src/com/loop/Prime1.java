package com.loop;

public class Prime1 {

	public static void main(String[] args) {
		
		int low=3,high=15;
		while(low<high)
		{boolean flag=false;
			for(int j=2;j<=low/2;j++) {
				if(low%j==0) {
					flag=true;
					break;
				}
							
			}
			
		
		if(flag==false && low!=0 && low!=1)
			System.out.println(low+" ");
		low++;
	}
	}
}
