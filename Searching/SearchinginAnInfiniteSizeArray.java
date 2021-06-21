package Searching;

public class SearchinginAnInfiniteSizeArray{
	//infinote size sorted array
	public static int Search(int arr[], int x)
	{
		int i=0;
		 while(true)
		 {
			 if(arr[i]==x)
			 {
				 return i;
			 }
			 else if(arr[i]>x)
			 {
				 return -1;
			 }
			 i++;
		 }
	}
	//we can't apply binary search because we have to get low + high by 2
	//high is not defined because it is of infinite size array
	public static int searchelement(int arr[],int x)
	{
		if(arr[0]==x)
		{
			return 0;
		}
		int i=1;
		while(arr[i]<x)
		{
			i=i*2;
		}
		if (arr[i]==x)
		{
			return i;
		}
		return binarySearch(arr,i/2+1,i-1,x); 
		//i/2 se toh already check ho gaya tha uspr element chota tha x se and i-1 tak check karenge 
		
	}

		private static int binarySearch(int[] arr,  int startIndex , int endIndex,int x) 
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
				return binarySearch(arr, x, mid+1, endIndex);
			}
			else
			{
				return binarySearch(arr, x, startIndex, mid-1); 
			}
		}
	
}
