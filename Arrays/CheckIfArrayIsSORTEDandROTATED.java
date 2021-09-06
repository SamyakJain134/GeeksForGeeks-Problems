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
 
 public static boolean checkRotatedAndSorted2(int arr[], int num){
	 //In case of increasing
	 //1-MAximum element should be just before the minimum element
	 //2-First element should be greater then last element
	 //3-0 se lekr min Index tak increasing hai and maxx index se lekr end tak bhi increewasing hai
	 
	 
	 //In case of decreasing (phle decrease hogi) 
	 //1-maximum element should be just after minimum element 
	 //2-First element should be smaller then last element
	 //3- 0 se lekr min index tak decreasing hai and maxIndex se lakr end tak bhi decreasing hai 
     
	 int minIndex=0;
	 int maxIndex=0;
	 for(int i=0;i<num;i++)
	 {
		 if(arr[i]<arr[minIndex])
		 {
			 minIndex=i;
		 }
		 if(arr[i]>arr[maxIndex])
		 {
			 maxIndex=i;
		 }
	 }
	 boolean res=false;
     //Checking wheather increasing hone ki possibility hai ya decreasing hone ki 
	 if(maxIndex==minIndex-1) //phle increase ho rahai hai then mid index aa raha hai 
	 {
		 res=incPossibility( arr, num , minIndex , maxIndex);
		//now check karenge agar 0 se min index increasing hai aur 
		 //maxIndex se lakr end tak bhi increasiing hai 
	 }
	 if(minIndex==maxIndex-1) //decreasing hone ki possibility hai 
	 {
		 res=decPossibility( arr, num , minIndex , maxIndex);
		//now check karenge agar 0 se min index decreasing  hai aur 
		 //maxIndex se lakr end tak bhi decreasing hai 
	 }
	 
	 return res; 
 }
 public static boolean isIncreasing(int arr[] ,int start , int end )
 {
	 for(int i=start+1;i<=end;i++)
	 {
		 if(arr[i-1]>arr[i])
		 {
			 return false;
		 }
	 }
	 return true;
 }
 public static boolean isDecreasing(int arr[] ,int start , int end )
 {
	 for(int i=start+1;i<=end;i++)
	 {
		 if(arr[i-1]<arr[i])
		 {
			 return false;
		 }
	 }
	 return true;
 }
private static boolean incPossibility(int[] arr, int num, int minIndex, int maxIndex) {
	if(arr[0]<arr[num-1])
	{
		return false;
	}
	return isIncreasing(arr, 0, maxIndex) && isIncreasing(arr, minIndex, num-1);
	
}
private static boolean decPossibility(int[] arr, int num, int minIndex, int maxIndex) {
	if(arr[0]>arr[num-1])
	{
		return false;
	}
	return isDecreasing(arr, 0, minIndex) && isDecreasing(arr, maxIndex, num-1);
}
 
}
