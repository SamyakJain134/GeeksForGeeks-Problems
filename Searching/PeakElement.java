package Searching;

public class PeakElement {
	public static int peakelement(int arr[])
	{
		if(arr.length==1)
		{
			return arr[0];
		}
		if(arr[0]>arr[1])
		{
			return arr[0];
		}
		if(arr[arr.length-1]>arr[arr.length-2])
		{
			return arr[arr.length-1];
		}
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]>arr[i-1] && arr[i]>arr[i+1])
			{
				return arr[i];
			}	
		}
		return -1;
	}
	//using binary search
	public static int peakelementiterative(int arr[], int n)
	{
		int low = 0, high = n - 1;

	while(low <= high)
	{
		int mid = (low + high) / 2;
		//mid==0 means first element
		if((mid == 0 || arr[mid - 1] <= arr[mid]) &&
			(mid == n - 1 || arr[mid + 1] <= arr[mid]))
			return mid;
		if(mid > 0 && arr[mid - 1] >= arr[mid])
			high = mid -1;
		else
			low = mid + 1;
	}
	
	return -1;
	}
}
