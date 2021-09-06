package Arrays;

import java.security.acl.LastOwnerException;

public class FrequencyinSortedArray {
	public static void frequencyinSortedArray(int arr[])
	{
		int freq=1;
		int i=1;
		while(i<arr.length)
		{
			while(i<arr.length && arr[i-1]==arr[i])
			{
				freq++;
				i++;
			}
			System.out.println(arr[i-1]+" "+freq);
			freq=1;
			i++;
		}
		//if only one element or last element not equal
		if(arr.length==1 || arr[arr.length-1]!=arr[arr.length-1])
		{
			System.out.println(arr[arr.length-1]+" "+ 1);
		}
	}

	public static int countFrequencyofNumber(int arr[] , int x)
	{
		int first=firstOccurance(arr,  x , 0 , arr.length-1);
		if(first==-1)
		{
			return -1;
		}
		int last=lastoccurance(arr,x,0,arr.length-1,arr.length);
		return last-first+1;
		
	}

	private static int lastoccurance(int[] arr, int x, int i, int j, int len) {
		if(i<=j)
		{
		int mid=(i+j)/2;
		if(mid== len-1|| arr[mid] == x && arr[mid+1] > x)
		{
			return mid;
		}
		else if(arr[mid]>x)
		{
			lastoccurance(arr, x, i, mid-1,len);
		}
		else
		{
			lastoccurance(arr, x, mid+1, j,len);
		}
		}
		return -1;
	}

	private static int firstOccurance(int[] arr, int x, int i, int j) {
		if(i<=j)
		{
		int mid=(i+j)/2;
		if(mid==0 || arr[mid] == x && arr[mid-1] < x)
		{
			return mid;
		}
		else if(arr[mid]>x)
		{
			firstOccurance(arr, x, i, mid-1);
		}
		else
		{
			firstOccurance(arr, x, mid+1, j);
		}
		}
		return -1;
			
		
	}

}
