package Searching;

public class MinimumElementinSortedRotatedArray {
	public static int minNumber(int arr[], int low, int high)
    {
        while(low<high)
        {
            int mid=low+(high-low)/2;
            if(arr[mid]>arr[high])
            {
                low=mid+1;
            }
            else if(arr[mid]<arr[high])
            {
                high=mid;
            }
            else
            {
                return arr[high];
            }
        }
        return arr[low];
    }
}
