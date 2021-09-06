package Sorting;

public class MergeSort {
	public static void merge(int arr[])
	{
		mergehelper(arr,0,arr.length-1);
		
	}
	public static void printArrays(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
	private static void mergehelper(int[] arr, int start, int end) 
	{
		if(start<end)
		{
			int mid=(start+end)/2;
			mergehelper(arr, start, mid-1);
			mergehelper(arr, mid+1, end);
			mergearray(arr,start,mid,end);
		}
		
	}

	private static void mergearray(int[] arr, int start, int mid, int end) {
		int n1[]=new int[mid-start+1];
		int n2[]=new int[end-mid];
		for(int i=0;i<n1.length;i++)
		{
			n1[i]=arr[i+start];
		}
		for(int i=0;i<n2.length;i++)
		{
			n2[i]=arr[mid+1+i];
		}
		int i=0,j=0;
		int k=start;
		while(i<n1.length && j<n2.length)
		{
			if(n1[i]<n2[j])
			{
				arr[k]=n1[i];
				k++;
				i++;
			}
			else
			{
				arr[k]=n2[j];
				k++;
				j++;
			}
		}
		while(i<n1.length)
		{
			arr[k]=n1[i];
			k++;
			i++;
		}
		while(j<n2.length)
		{
			arr[k]=n2[j];
			k++;
			j++;
		}
		
		
	}
	public static void main(String[] args) {
		int arr[] = { 12, 11, 13, 5, 6, 7 };
		merge(arr);
		printArrays(arr);
	}

}
