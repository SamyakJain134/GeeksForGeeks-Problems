package Searching;

public class FloorinSortedArray {
	public static int findFloor(long arr[], int n, long x)
    {
       
        int start=0;
        int end=n-1;
        long res=-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]==x)
            {
                return (int)mid;
            }
            if(arr[mid]>x)
            {
                end=mid-1;
            }
            else
            {
                if(arr[mid]>res)
                {
                res=mid;    
                }
                start=mid+1;
            }
        }
        return (int) res;
    }

}
