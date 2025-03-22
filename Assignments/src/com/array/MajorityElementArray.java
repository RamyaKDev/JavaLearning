package com.array;

public class MajorityElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a= {5,2,6,5,5,2,5,3,5,4,5};
int max=(a.length)/2;

int key=0;
for(int j=0;j<a.length;j++) {
	 key=a[j];
	 int count=1;
	for(int i=j+1;i<a.length;i++) {
		
		if(a[i]==key) {
			a[i]=0;
			count++;
		}		
	
	}
	if((key!=0) && (count>max)) {
		System.out.println(key+" presents "+count+" times");
	}

}
	}
}
