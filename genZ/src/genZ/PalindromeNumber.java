package genZ;

public class PalindromeNumber {

	public static void main(String[] args) {
		int s=4245;
		palindrome(s);	
	}

	private static void palindrome(int s) {
		int rev=0;
		int num=s;
		while(s>0) {
			int n=s%10;
			rev=(rev*10)+n;
			 s=s/10;
		}
		if(rev==num)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}

}
