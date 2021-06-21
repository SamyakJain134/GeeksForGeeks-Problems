package Searching;

import java.util.Arrays;

public class SortedArraySumusingTWOPOINTERAPPROach {
	public static boolean twopointer(int arr[] ,int sum)
	{
		int left=0;
		int right=arr.length-1;
		while(left<=right)
		{
			if(arr[left]+arr[right]==sum)
			{
				return true;
			}
			else if(arr[left]+arr[right]>sum)
			{
				right=right-1;
			}
			else
			{
				left++;
			}
		}
		return false;
	}
	public static boolean isPair(int arr[] ,int sum,int startIndex,int EndIndex)
	{
		int left=startIndex;
		int right=EndIndex;
		while(left<=right)
		{
			if(arr[left]+arr[right]==sum)
			{
				return true;
			}
			else if(arr[left]+arr[right]>sum)
			{
				right=right-1;
			}
			else
			{
				left++;
			}
		}
		return false;
	}
	//Triplet sum in array
	public static boolean tripletsum(int arr[] ,int sum)
	{
		//If array is unsorted 
		//Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			if(isPair(arr, sum-arr[i],i+1,arr.length-1))
			{
				return true;
			}
		}
		return false;
		
	}

}
