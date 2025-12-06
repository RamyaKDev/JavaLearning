package streaminterviewquestions;

import java.util.stream.IntStream;

public class CheckPrime {

	public static void main(String[] args) {
		int n=23;
		if(isPrime(n))
			System.out.println("prime");
		else
			System.out.println("Not prime");
	}

	private static boolean isPrime(int n) {
		if(n<=1)
		return false;
		
//		for(int i=2;i<n/2;i++) {
//			if(n%i==0)
//				return false;
//		}
//		return true;
		
		//using streams api
		return IntStream.rangeClosed(2, (int)Math.sqrt(n))
				.noneMatch(i->n%i==0);
	}

}
