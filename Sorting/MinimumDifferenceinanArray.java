	package Sorting;

import java.util.Arrays;

public class MinimumDifferenceinanArray {

	public static int Maximumdiff(int arr[])
	{
		int res=Integer.MAX_VALUE;
		for(int i=1;i<arr.length;i++)
		{
			for(int j=0;j<i;j++)
			{
				res=Math.min(res,Math.abs(arr[i]-arr[j]));
			}
		}
		return res; 
	}
	public static int Maximumdiffefficient(int arr[])
	{
		Arrays.sort(arr);
		int res=Integer.MAX_VALUE;
		for(int i=1;i<arr.length;i++)
		{
			res=Math.min(res, arr[i]-arr[i-1]);
		}
		return res; 
	}
} 
