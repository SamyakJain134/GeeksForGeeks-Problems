package Sorting;

public class PartitionMethodinQuickSort {
	public static int partition(int[] arr, int left, int right) //Lomuto partition 
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
	//Hoare's Partition
	public static int hoarepartion(int arr[],int low,int high)
	{
		int pivot=arr[low];
		int i=low-1;
		int j=high+1;
		while(true)
		{
			do
			{
				i++;
			}
			while(arr[i]<pivot);
			do {
				j--;
			}
			while(arr[j]>pivot);
			if(i>=j)
			{
				return arr[j];
			}
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;	
		}
	}
}
