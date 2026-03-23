package genZ;

public class Fibonacci {

	public static void main(String[] args) {
	int a=0;
	int b=1,c=0;
	int n=5;
//	for(int i=0;i<n;i++) {
//		System.out.print(a);
//	c=a+b;
//	a=b;
//	b=c;
//	}
	int res=fib(n);
	System.out.println(res);
	}

	private static int fib(int n) {
		if(n<=1)
			return 1;
		else
		return fib(n-2)+fib(n-1);
		
		
	}

}
