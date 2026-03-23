package genZ;

import java.util.Scanner;

public class CountNoOfWords {

		 public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.println("Enter a sentence:");
		        String sentence = scanner.nextLine();
		        
		        int count = countWords(sentence);
		        System.out.println("The number of words in the sentence is: " + count);
		        
		        scanner.close();
		    }

		    /**
		     * Counts the number of words in a given string.
		     * Handles leading, trailing, and multiple spaces between words.
		     */
		    public static int countWords(String str) {
		    	String[] words=str.trim().split("\\s+");
		      return words.length;
		    }
}
