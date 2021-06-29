package Sorting;

import java.util.Arrays;

public class MinimumDifferenceinArray {
	public static int MinimumDifference(int arr[], int n)
    {
        Arrays.sort(arr);
        int min=Integer.MAX_VALUE;
        for(int i=1;i<n;i++)
        {
            if(arr[i]-arr[i-1]<min)
            {
                min=arr[i]-arr[i-1];
            }
        }
        return min;
    }
}
