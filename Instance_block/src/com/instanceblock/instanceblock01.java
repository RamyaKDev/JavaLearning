package com.instanceblock;

public class instanceblock01 {
	{
		System.out.println("Instanceblock");
	}
	{
		System.out.println("Instanceblock1");
	}
	{
		System.out.println("Instanceblock2");
	}
	public instanceblock01(){
		System.out.println("Constructor");
	}
	public instanceblock01(int a){
		System.out.println("1 arg Constructor");
	}
	public instanceblock01(int a,int b){
		System.out.println("2 arg Constructor");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		instanceblock01 ib=new instanceblock01();
		instanceblock01 ib1=new instanceblock01(10);
		instanceblock01 ib2=new instanceblock01(10,20);
		
	}

}
