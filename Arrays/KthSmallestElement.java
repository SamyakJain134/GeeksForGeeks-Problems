package Arrays;

import java.util.Arrays;

public class KthSmallestElement {
	 public static int kthSmallest(int[] arr, int l, int r, int k) 
	    { 
	         // Sort the given array 
	        Arrays.sort(arr); 
	  
	        // Return k'th element in  
	        // the sorted array 
	        return arr[k-1]; 
		}

}
