package com.features;

interface it1{
	int add(int a,int b);
}
public class lamb2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
it1 i=(int a, int b)->{
	int c=a+b;
	return c;
};
int x= i.add(60, 10);
System.out.println(x);
	}

}
