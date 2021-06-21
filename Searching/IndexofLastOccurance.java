package Searching;

public class IndexofLastOccurance {
	//recursive COde
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
				if(mid==len-1 || arr[mid]!=arr[mid+1])  //mid==len-1 first element
				{
					return mid;
				}
				else
				{
					return lastOccurancerecursive(arr,n , mid+1 , end,len);
				}
			}
		}
//		Iterative Funvtion
		public static int lastOccuranceIterative(int arr[], int n , int len)
		{
			
			  int start=0; 
			  int end=arr.length-1;
			  while(start<=end)
			  {
				  int mid=(start+end)/2;
				  if(arr[mid]>n)
				  {
						end=mid-1;
				  }
				  else if(arr[mid]<n)
				  {
					  start=mid+1;
				  }
				  else
				  {
					   if(mid==len-1 || arr[mid]!=arr[mid+1])  //mid==0 first element
						{
							return mid;
						}
						else
						{
							start=mid+1;
						}
				  }
			  }
			  return -1;
		}
}
