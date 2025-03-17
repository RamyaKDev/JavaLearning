package com.array;

public class SecHighest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a= {4,19,17,6,10,0};

find_highest(a);
find_secondhighest(a);
find_thirdhighest(a);
	}

	private static void find_thirdhighest(int[] a) {
		// TODO Auto-generated method stub
		int highest=a[0],second=a[0],third=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>highest) { 
				second=highest;
				highest=a[i];
			}
				else if(a[i]>second) {
					third=second;
				second=a[i];
				}
				else if(a[i]>third) 
					third=a[i];
					
		}
		
		System.out.println("third highest number in the list is "+third);
	
	}

	private static void find_highest(int[] a) {
		// TODO Auto-generated method stub
		int highest=a[0];
		for(int i=0;i<a.length;i++) {
			if(highest<=a[i]) { 
				
				highest=a[i];
			}
		}	
		System.out.println("highest number in the list is "+highest);
		
	}

	private static void find_secondhighest(int[] a) {
		// TODO Auto-generated method stub
		int highest=a[0],second=a[0];
		for(int i=0;i<a.length;i++) {
			if(highest<=a[i]) { 
				second=highest;
				highest=a[i];
			}
				else if(second<a[i] ) 
				second=a[i];
			
		}
		//System.out.println(highest);
		System.out.println("second highest number in the list is "+second);
	}

}
