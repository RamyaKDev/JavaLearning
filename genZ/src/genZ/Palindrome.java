package genZ;

public class Palindrome {

	public static void main(String[] args) {
		String s="madama";
		boolean p=palindrome(s);
		if (p)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}

	private static boolean palindrome(String s) {
		int left=0;
		int right= s.length()-1;
		while(left<right) {
			if(s.charAt(left)!=s.charAt(right))
				return false;
			left++;
			right--;
		}
		return true;
		
	}

}
