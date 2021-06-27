package Sorting;

import java.util.Arrays;

public class KthSmallestelement {
	public static int kthSmallestelement(int arr[] ,int k)
	{
		Arrays.sort(arr);
		return arr[k-1];
	}
	public static int kthSmallestlementefficient(int arr[] ,int n , int k)
	{
		int left=0;
		int right=arr.length-1;
		while(left<=right)
		{
			int p=partition(arr,left,right);
			if(p==k-1)
			{
				return p;
			}
			else if(p>k-1)
			{
				right=p-1;
			}
			else
			{
				left=p+1;
			}
		}
		return -1;
	}
	private static int partition(int[] arr, int left, int right) //Lomuto partition 
	{
		int i=left-1;
		int pivot=arr[right];
		for(int j=left;j<=right-1;j++)
		{
			if(arr[j]<pivot)
			{
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		int temp=arr[i+1];
		arr[i+1]=arr[right];
		arr[right]=temp;
		
		
		return i+1;//index of pivot element which was last
	}
	public static void main(String args[])
	{
		int arr[]={2 ,4,5,7,9,6,8,1,5,3};
		System.out.println(kthSmallestlementefficient(arr,arr.length,3));
	}
}
