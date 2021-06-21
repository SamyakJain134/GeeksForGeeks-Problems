package Searching;

public class CountRecuranceOfElement {
	public static int firstOccurancerecursive(int arr[], int n , int start , int end)
	{
		/*
		 * int start=0; 
		 * int end=arr.length-1;
		 */
		if(start>end)
		{
			return -1;
		}
		int mid=(start+end)/2;
		if(arr[mid]>n)
		{
			return firstOccurancerecursive(arr,n , start , mid-1);
		}
		else if(arr[mid]<n)
		{		
			return firstOccurancerecursive(arr , n , mid+1,end );
		}
		else
		{
			if(mid==0 || arr[mid-1]!=arr[mid])  //mid==0 first element
			{
				return mid;
			}
			else
			{
				return firstOccurancerecursive(arr,n , start , mid-1);
			}
		}
	}
	public static int lastOccurancerecursive(int arr[], int n , int start , int end, int len)
	{
		/*
		 * int start=0; 
		 * int end=arr.length-1;
		 */
		if(start>end)
		{
			return -1;
		}
		int mid=(start+end)/2;
		if(arr[mid]>n)
		{
			return lastOccurancerecursive(arr,n , start , mid-1 , len);
		}
		else if(arr[mid]<n)
		{		
			return lastOccurancerecursive(arr , n , mid+1,end,len );
		}
		else
		{
			if(mid==len-1 || arr[mid]!=arr[mid+1])  //mid==0 first element
			{
				return mid;
			}
			else
			{
				return lastOccurancerecursive(arr,n , mid+1 , end,len);
			}
		}
	}
	public static int countOccurances(int arr[] ,int num)
	{
		int firstOccurance=firstOccurancerecursive(arr, num, 0,arr.length);
		if(firstOccurance==-1) // element not  present 
		{
			return -1;
		}
		else
		{
			return (lastOccurancerecursive(arr, num, 0, arr.length, arr.length)- firstOccurance +1);
			// +1 because index starts from 0 
		}
	}
}
