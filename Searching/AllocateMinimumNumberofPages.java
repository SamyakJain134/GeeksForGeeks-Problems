package Searching;

public class AllocateMinimumNumberofPages {
	  public static int findPages(int[]arr,int n,int m)
	    {
		  int max=arr[0];
	        for(int i=1;i<n;i++)
	        {
	        	if(arr[i]>max)
	        	{
	        		max=arr[i];
	        	}
	        }
	        int low=max;
	        int sum=0;
	        for(int i=0;i<n;i++)
	        {
	        	sum=sum+arr[i];
	        } 
	        int high=sum;
	        int res=-1;
	        while(low<=high)
	        {
	        	int mid=low+(high-low)/2;
	        	if(allocationisPosible(mid,arr,m))
	        	{
	        		res=mid;
	        		high=mid-1; 
	        	}
	        	else
	        	{
	        		low=mid+1;
	        	}
	        }
	        return res;
	    }

	private static boolean allocationisPosible(int barrier,int arr[],int k) 
	{
		// TODO Auto-generated method stub
		int allocatedStudent=1;
		int pages=0;
		for(int i=0;i<arr.length;i++)
		{
			 if(barrier<arr[i])//cannot be allocated
			 {
				 return false;
			 }
			 if(pages+arr[i]>barrier)
			 {
				 allocatedStudent++;
				// pages=pages+arr[i];
				pages=arr[i];
			 }
			 else
			 {
				 pages=pages+arr[i];
			 }
		}
		if(allocatedStudent>k)
		{
			return false;
		}
		else
		{
			return true;
		}
	}

}
