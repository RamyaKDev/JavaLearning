package com.array;

public class Merge2Sortarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,3,5};
		int[] b= {2,4,8};
		int n=a.length;
		int m=b.length;
		int num=0;
		int num1=0;
		int i=0;
		int k=0,j=0;
		int[] c=new int[n+m];
		
					while(i<n&&j<m) {
				if(a[i]<b[j]) {
					
					c[k++]=a[i++];			
					
				}
				else {
					c[k++]=b[j++];
					
					
					}
				
				}
					while(i<n) {
						c[k++]=a[i++];	
					}
			while(j<m){
				c[k++]=b[j++];
			}
//			num=c[i];
//			//num1=c[i+1];
//			System.out.print(num+" "+num1+" ");
		
		
		

		for(int y=0;y<c.length;y++) {
			System.out.print(c[y]+" ");
		}
	}

}
