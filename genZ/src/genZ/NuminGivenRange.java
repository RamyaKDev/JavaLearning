package genZ;

import java.util.Arrays;

public class NuminGivenRange {

	
//		   // Function to find the missing numbers
//	    static void getMissingNumbers(int arr[], int N)
//	    {
//	      
//	        // traverse the array arr[]
//	        for (int i = 0; i < N; i++) 
//	        {
//	          
//	            // Update
//	            arr[(Math.abs(arr[i]) - 1)]
//	                = -(Math.abs(arr[(Math.abs(arr[i]) - 1)]));
//	        }
//	      
//	        // Traverse the array arr[]
//	        for (int i = 0; i < N; i++) 
//	        {
//	          
//	            // If Num is not present
//	            if (arr[i] > 0)
//	                System.out.print(i + 1 + " ");
//	        }
//	    }

	    // Driver Code
	    public static void main(String[] args)
	    {
	      
	        // Given Input
	        int N = 5;
	        int arr[] = { 5, 5, 4, 4, 2 };

	        // Function Call
	        getMissingNumbers(arr, N);
	        
	        
	    }
	


	

}
