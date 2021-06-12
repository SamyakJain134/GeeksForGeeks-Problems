package Arrays;

import java.util.ArrayList;

public class ReverseAnArrayInGroup {
//Given an array 
	//arr[] of positive integers of size N. 
	//Reverse every sub-array group of size K.
	
	public static void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
	       
	       for(int i = 0; i < n; i = i + k)
	       rev( arr, i, i + (k-1));
	        
	      
	    }
	    public static void rev(ArrayList<Integer> arr, int start, int end)
	    {
	        if(end >= arr.size()) 
	            end = arr.size() - 1;
	        while(start <= end)
	        {
	            int temp = arr.get(start);
	            arr.set( start, arr.get(end));
	            arr.set( end, temp);
	            start++; end--;
	        }
	    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
