package com.loop;

public class ChocolateWrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
////int chocolate=15;
//int wrapper=15,re_wrapper;
//int total=15;
//	while(wrapper>=3) {
//		wrapper=wrapper/3;
//		total=total+wrapper;
//		if(wrapper%3!=0) {
//			re_wrapper=wrapper%3;
//			wrapper=wrapper/3;
//			System.out.println("remaining wrappers  :"+re_wrapper);
//			
//			total=total+wrapper;
//			wrapper=re_wrapper+wrapper;
//		}
//		
//	}
		int chocolate=15;
		int wrapper =15;
		while(wrapper>=3) {
			wrapper=wrapper-3;
			chocolate=chocolate+1;
			wrapper=wrapper+1;
		}
		System.out.println("total chocolates :"+chocolate);
	//System.out.println("total chocolates :"+total);
	}

}
