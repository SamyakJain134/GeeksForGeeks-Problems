package Sorting;

public class IntersectionofTwoSortedArrays {
	public static void intersecion(int arr[], int brr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			if(i>0 && arr[i]==arr[i-1]) //to avoid duplicates
			{
				continue;
			}
			for(int j=0;j<brr.length;j++)
			{
				if(arr[i]==brr[j])
				{
					System.out.println(arr[i]);
					break;
				}
			}
		}
	}
	//using merge function in merge sort 
	public static void intesectionofsortedarray(int arr[], int brr[])
	{
		int i=0;
		int j=0;
		while(i<arr.length || j<brr.length )
		{
			if(i>0 && arr[i]==arr[i-1])
			{
				i++;
				continue;
			}
			if(arr[i]>arr[j])
			{
				j++;
			}
			else if(arr[i]<arr[j])
			{
				i++;
			}
			else
			{
				System.out.println(arr[i]);
				i++;
				j++;
			}
		}
	}

}
