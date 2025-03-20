package com.array;

public class CountFrequencyOfEachLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//char[] a= {'r','a','m','y','a'};
String s="ramyakamalasekaran";
char[] a=s.toCharArray();//converts string into char array
for(int i=0;i<a.length;i++) {
System.out.print(a[i]);
}
System.out.println();
char last=' ';
int max=0;
char max_occur=' ';
for(int j=0;j<a.length;j++) {//traversing each letter in a array
	char key=a[j];//first letter
	int count=1;
	
	for(int i=j+1;i<a.length;i++) {//why j+1 means already key is 0 don't want to do the comparison with same letter
	// this loop is for comparing with elements
		if(key==a[i]) {
			a[i]='*';
			count++;
		}
	}
	if(key!='*' && count>1) {		
		//System.out.println(key+" comes "+count+" times in a given string");
		//break;
		if(count >max) {
			max=count;
			max_occur=key;
		}		
	}//exit if	
	}//exit outer for loop
	System.out.println(max_occur+" occurs "+max+" times : This is the letter occurs maximum times");
	//System.out.println(last);
	
}//exit main()
}//exit class