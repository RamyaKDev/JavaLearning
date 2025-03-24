package com.array;

public class Merge2Sortarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,3,5};
		int[] b= {2,4,8};
		int n=a.length;
		int m=b.length;
		
		int i=0;
		int k=0,j=0;
		int[] c=new int[n+m];
		
					while(i<n&&j<m) {
				if(a[i]<b[j]) {					
					c[k]=a[i];			
					k++;
					i++;
				}
				else {
					c[k]=b[j];
					k++;
					j++;
					
					}
				
				}
					// following if - prints remaining elements 
				if(i<n) {// from a and b array
					System.out.println(i+" "+n);
					c[k++]=a[i++];	
				}
			if(j<m){
				System.out.println(j+" "+m);
				c[k++]=b[j++];
			}
		for(int y=0;y<c.length;y++) {
			System.out.print(c[y]+" ");
		}
	}

}
