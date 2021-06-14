package Searching;

public class IndexOfFirstOccurance {
	public static int firstOccurance(int arr[], int n)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==n)
			{
				return i;
			}
		}
		return -1;
	}
	//recursive COde
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
//	Iterative Funvtion
	public static int firstOccuranceiterative(int arr[], int n)
	{
		int start=0;
		int end=arr.length-1;
		while(start<=end)
		{
			int mid=(start+end)/2;
			if(arr[mid]>n)
			{
				end=mid-1; //satrt same rahega 0 se end=mid tak
			}
			else if(arr[mid]<n)
			{
				start=mid+1; //end= arr.length-1 hoga
			}
			else
			{
				if(mid==0 || arr[mid-1]!=arr[mid])
				{
					return mid;
				}
				else
				{
					end=mid-1; 
				}	
			}
		}
		return -1;
	}

	public static void main(String[] args) 
	{
		int arr[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		System.out.println(firstOccurance(arr, 10));
		System.out.println(firstOccurancerecursive(arr, 10,0,arr.length-1));
		System.out.println(firstOccuranceiterative(arr, 5));
	}

}
