package Searching;

import java.util.Arrays;

public class RepeatingElementsInArray {
//Super Naive Solution
	public static int repeatingElements(int arr[],int n)
	{
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					return arr[i];
				}
			}
		}
		return -1;
	}
	public static int Repeatingelementsbetter(int arr[],int n) 
	{
		Arrays.sort(arr); //modifies the original array which is not allowed 
		for(int i=0;i<n-1;i++)
		{
			if(arr[i]==arr[i+1])
			{
				return arr[i];
			}
		}
		return -1;
	}
	//O(N) and O(1) auxillary spce solutuon
}
