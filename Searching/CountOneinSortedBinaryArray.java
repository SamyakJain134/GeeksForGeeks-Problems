package Searching;

public class CountOneinSortedBinaryArray {
	public static int CountOne(int arr[],int n)
	{
		int start=0;
		int end=n-1;
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
					return n-mid;
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
