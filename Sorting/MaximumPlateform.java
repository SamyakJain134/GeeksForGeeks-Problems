package Sorting;

import java.util.Arrays;

public class MaximumPlateform {
	public static int findPlatform(int arr[], int dep[], int n)
	    {
	        Arrays.sort(arr);
	        Arrays.sort(dep);
	        int i=0;
	        int j=0;
	        int maxTrain=0;
	        int Platform=0;
	        while(i<arr.length && j <dep.length)
	        {
	            if(arr[i]<=dep[j]) // arrival phle ho raha hai departure se 
	            {
	                maxTrain++;
	                i++;
	            }
	            else //departure already ho gya hai platform khali ho gaya 
	            {
	                maxTrain--;
	                j++;
	            }
	            Platform=Math.max(Platform,maxTrain);
	        }
	        return Platform;
	        
	    }

}
