package Searching;
//the array is rotated and sorted 
public class SearchInasortedArray {
	public static int Sorted(int arr[],int num)
	{
		int low=0;
		int high=arr.length-1;
		while(low<=high)
		{
			int mid=low+high/2;
			if(arr[mid]==num)
			{
				return mid;
			}
			if(arr[low]<arr[mid]) //left half is sorted
			{
				if(num>=arr[low] && num<arr[mid]) //element is present is left half
				{
					high=mid-1;
				}
				else //present in right half
				{
					low=mid+1;
				}
			}
			else //right half is sorted 
			{
				if(num<=arr[high] && num>arr[mid])
				{
					low=mid+1;
				}
				else
				{
					high=mid-1;
				}
			}
			
		}
		return -1;
	}
}
