package com.array;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a= {5,2,1,4};

//System.out.println("Finding max value");
//highest(a);
//System.out.println("Finding second max value");
//sechighest(a);
//System.out.println("Sorting array");
sort(a);

	}

	private static void sechighest(int[] a) {
		// TODO Auto-generated method stub
		int max=0;
		int max_index=0;
		for(int i=0;i<a.length;i++) {
			
			if(a[i]>max) {		
				max=a[i];
				max_index=i;
			}
			
		}
		System.out.println("highest value "+max+" "+max_index);
		int last_index=a.length-1;
		int temp= a[max_index];
		a[max_index]=a[last_index];
		a[last_index]=temp;
		
//		for(int i=0;i<a.length;i++) {
//			System.out.print(a[i]+" ");
//			}
		//moving second highest value to 3rd index
		//dont include the highest value bcoz its already in correct position
		max=0;
		 max_index=0;
		for(int i=0;i<a.length-1;i++) {
			
			if(a[i]>max) {		
				max=a[i];
				max_index=i;
			}
			
		}
		System.out.println("second max "+max+" "+max_index);
		last_index=a.length-2;
		temp= a[max_index];
		a[max_index]=a[last_index];
		a[last_index]=temp;
		System.out.println("second max value moved to 3rd index : ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
			}
	}

	private static void highest(int[] a) {
		// TODO Auto-generated method stub
		//moving highest value to the last index
		int max=0;
		int max_index=0;
		for(int i=0;i<a.length;i++) {
			
			if(a[i]>max) {		
				max=a[i];
				max_index=i;
			}
			
		}
		System.out.println(max+" "+max_index);
		int last_index=a.length-1;
		int temp= a[max_index];
		a[max_index]=a[last_index];
		a[last_index]=temp;
		System.out.print("Highest value moved to last index : ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
			}
	}

	private static void sort(int[] a) {
		// TODO Auto-generated method stub
		int max=0;
		int max_index=0;
	for(int j=0;j<a.length-1;j++) {
		for(int i=0;i<a.length-j;i++) {
			
			if(a[i]>max) {		
				max=a[i];
				max_index=i;
			}
			
		}
		//System.out.println(max+" "+max_index);
		int last_index=a.length-(j+1);
		int temp= a[max_index];
		a[max_index]=a[last_index];
		a[last_index]=temp;
		
////		System.out.println();
//		System.out.print(a[j]+" ");
	}
	for(int i=0;i<a.length;i++) {
		System.out.print(a[i]+" ");
	}
	}
}

