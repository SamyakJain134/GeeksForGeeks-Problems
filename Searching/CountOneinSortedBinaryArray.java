package Searching;

public class CountOneinSortedBinaryArray {
	public static int CountOne(int arr[],int length)
	{
		int start=0;
		int end=length-1; 
		while(start<=end)
		{
			int mid=start+end/2;
			if(arr[mid]==0) 
			{
				start=mid+1;
			}
			else
			{
				if(mid==0 || arr[mid]!= arr[mid-1])
				{
					return length-mid; //because array is sorted and binary so after 0 there will be only 1
					//till end of array
				}
				else
				{
					end=mid-1;
				}
			}
		}
		return 0;
	}
}
