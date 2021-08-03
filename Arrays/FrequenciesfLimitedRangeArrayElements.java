package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FrequenciesfLimitedRangeArrayElements {
	public static void findFrequency(int [] arr,int n)
	{
		Map<Integer, Integer> mp = new HashMap<Integer, Integer>();

// traverse the array
	for (int i = 0; i < n; i++)
{

// update the frequency
		if (!mp.containsKey(arr[i]))
		{
			mp.put(arr[i],0);
		}
		else
		{
			mp.put(arr[i],mp.get(arr[i])+1);
		}
}

// traverse the hashmap
		for (Map.Entry<Integer, Integer> kvp : mp.entrySet())
		{
			System.out.println("Element " + kvp.getKey() +
         " occurs " + kvp.getValue() +
         " times");
}
		
}
	 public static void frequencyCount(int arr[], int N, int P)
	    {
	        //Decreasing all elements by 1 so that the elements
	        //become in range from 0 to n-1.
	        for (int j = 0; j < N ; j++) 
	            arr[j] = arr[j]-1; 
	        Arrays.sort(arr);
	        int ind = N;
	    	for(int i = 0 ; i < N ; i++)
	    	{
	    	   if(arr[i] >= N)
	    	   {
	    	       if(ind == N)
	    	           ind = i;
	    	       arr[i] = 0;
	    	   }
	    	}
	        //Using every element arr[i] as index.
	        //Updating the array elements using mathematical formula
	        //to find the frequencies of all elements from 1 to N.
	        for (int i = 0 ; i < ind; i++) 
	            //Adding n to element present at arr[i]%n to keep 
	            //track of count of occurrences of arr[i].
	            arr[arr[i]%N] = arr[arr[i]%N] + N; 

	         //Calculating the frequency of each element.
	        for (int i =0; i<N; i++) 
	            //Finally dividing the array elements by n to find the frequency.
	            arr[i] = arr[i]/N;
	    }
}
