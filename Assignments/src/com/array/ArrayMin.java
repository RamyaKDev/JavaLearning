package com.array;

public class ArrayMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] marks= {77,67,98,85,55};   
String[] subject= {"Tamil","English","Maths","Science","Social"};
int count=0, min=0,max=0;
for(int i=0;i<marks.length;i++) {
	if(marks[i]>=90)
		System.out.println(subject[i]+" "+marks[i]);
	if(marks[i]<=70)
	{
		count=count+1;
		System.out.println(subject[i]+" "+marks[i]);		
	}
	//finding lowest mark
	min=marks[0];
	if(min>marks[i]) {
		min=marks[i];
	}
	
}
System.out.println(count+" subjects are below 70 marks");
System.out.println(min +" is lowest mark ");


max=marks[0];
for(int i=0;i<marks.length;i++) {
	
if(max<marks[i]) {
	max=marks[i];
	}
	
}
System.out.println(max +" is highest mark ");
}}