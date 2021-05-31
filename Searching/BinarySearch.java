package Searching;

public class BinarySearch {
	public static int BinarySearching(int arr[] , int x  )
	{
		
		return BinarySearchingHelper(arr, x, 0, arr.length-1);
	}

	private static int BinarySearchingHelper(int[] arr, int x, int startIndex , int endIndex) 
	{
		if(startIndex>endIndex)
		{
			return -1;
		}
		int mid=(startIndex+endIndex)/2;
		if(arr[mid]==x)
		{
			return mid;
		}
		if(arr[mid]<x)
		{
			return BinarySearchingHelper(arr, x, mid+1, endIndex);
		}
		else
		{
			return BinarySearchingHelper(arr, x, startIndex, mid-1); 
		}
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		System.out.println(BinarySearching(arr, 6));
	}
}
