package Sorting;

public class ThreeWayPartitioning {
	public void threeWayPartition(int arr[], int a, int b)
    {
        int low=0;
        int mid=0;
        int high=arr.length-1;
        while(mid<=high)
        {
            if(arr[mid]<a)
            {
                int temp=arr[mid];
                arr[mid]=arr[low];
                arr[low]=temp;
                mid++;
                low++;
            }
            else if(arr[mid]>b)
            {
                int temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;
            }
            else
            {
                mid++;
            }
        }
    }
}
