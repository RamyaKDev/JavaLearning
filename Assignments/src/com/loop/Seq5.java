package com.loop;

public class Seq5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		while(count<=4) {
	for(int i=1;i<=5;i++) {
		System.out.print(i+" ");
	}
	count=count+1;
	if(count==5) 
		break;
	System.out.println(" ");
	for(int j=5;j>=1;j--) {
		System.out.print(j+" ");
	}
	count=count+1;
	System.out.println(" ");
	if(count==5) 
		break;
}
}}