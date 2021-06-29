package Sorting;

public class ClosertoSort {
	public static long closer(int arr[], int n, long x)
    {
        int low=0;
        int high=n-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(arr[mid]==(int)x)
            {
                return mid;
            }
            if(mid >low && arr[mid-1]==(int)x )
            {
                return mid-1;
            }
            if(mid<high && arr[mid+1]==(int)x  )
            {
                return mid+1;
            }
            if(arr[mid]>(int)x)
            {
                high=mid-2;
            }
            else
            {
                low=mid+2;
            }
        }
        return -1;
    }
}
