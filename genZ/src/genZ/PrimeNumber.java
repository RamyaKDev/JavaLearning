package genZ;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num = scanner.nextInt();
       boolean prime= primeNumber(num);
       if(prime)
    	   System.out.println("Prime number");
       else
    	   System.out.println("Not Prime number");
        scanner.close();
	}

	private static boolean primeNumber(int n) {
		if(n<=1)
			return false;
		else
			for(int i=2;i<n/2;i++) {
				if(n%i==0) {
					return false;
				}
			}
		
		
		
		return true;
	}
	
}
