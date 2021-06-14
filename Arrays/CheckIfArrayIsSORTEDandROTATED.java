package Arrays;

/*Given an array arr[] of N distinct integers, 
check if this array is Sorted (non-increasing or non-decreasing) and 
Rotated counter-clockwise. Note that input array may be 
sorted in either increasing or decreasing order, then rotated.
A sorted array is not considered as sorted and rotated, i.e., 
there should be at least one rotation.*/
public class CheckIfArrayIsSORTEDandROTATED {
 public static int pivotElement(int arr[], int startIndex,int end)
 {
	 if(startIndex>end) //there is no pivot element
	 {
		 return -1;
	 }
	 if(startIndex==end) //Start end and mid are pointing on same position 
	 {
		 return startIndex; //this will be pivot element
	 }
	 int mid=(startIndex+end)/2;
	 //For element to be pivot /
	 //ARR[PIVOT+1]<arr[pivot]>arr[pivot-1]
	if(arr[mid]> arr[mid+1] && mid<end)
	{
		return mid;
	}
	if(mid>startIndex && arr[mid-1]> arr[mid] )
	{
		return mid-1;
	}
	if(arr[startIndex]>arr[mid])
	{
		return pivotElement(arr, startIndex, mid-1); 
	}
	else
	{
		return pivotElement(arr, mid, end);
	}
	
 }
 public static boolean checkRotatedAndSorted(int arr[], int num){
     int start=0;
     int end = num-1;
    int pivot=-1;
    if(arr[start]>arr[end])
    {
    	pivot=pivotElement(arr, start,end);	
    	int temp=pivot;
    	// To check if the elements to the left
        // of the pivot are in descending or not
    	if(start<pivot)
    	{
    		while(pivot>start)
    		{
    			if(arr[pivot]<arr[pivot-1])
    			{
    				return false;
    			}
    			pivot--;
    		}
    	}
    	// To check if the elements to the right
        // of the pivot are in ascending or not
      // pivot=temp;
       else
       {
    	pivot++;
    	while(pivot<end)
    	{
    		 if (arr[pivot] > arr[pivot + 1]) 
    		 {
                 return false;
             }
             pivot++;
    	}
       }
    	 // If any of the above if or else is true
        // Then the array is sorted rotated
    	return true;
    }
    else
    {
    	return false;
    }
     
 }
 
}
