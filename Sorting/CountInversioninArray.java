package Sorting;

public class CountInversioninArray {
	public static int countInversion(int arr[])
	{
		int count=0;
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;i<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					count++;
				}
			}
		}
		return count;
	}
	//Efficient solution 
	public static int countInversionefficient(int arr[],int left,int right)
	{
		int count=0;
		if(left<right)
		{
			int mid=left+(right-left)/2;
			count=count+countInversionefficient(arr,left,mid); //they also sort the left half
			count=count+countInversionefficient(arr,mid+1,right);
			count =count+merge(arr,left,mid,right); //merges two sorted arrays and also count inversions
		}
		return count;
	}
	private static int merge(int[] arr, int left, int mid, int right) {
     
		int n1=mid-left+1;
		int n2=right-mid;
		int leftary[]=new int[n1];
		
		int rightary[]=new int[n2];
		for(int i=0;i<n1;i++)
		{
			leftary[i]=arr[i+left];
		}
		for(int j=0;j<n2;j++)
		{
			rightary[j]=arr[mid+j+1];
		}
		int i=0;
		int j=0;
		int count=0;
		int k=left;
		while(i<n1 && j< n2)
		{
			if(leftary[i]<=rightary[j])
			{
				arr[k]=leftary[i];
				i++;
			}
			else //leftary[i]> rightary[j]
			{
				arr[k]=rightary[j]; //every element after leftary[i] will be greater then rightary[j]
				j++; //this element woiuld be smaller then all the index after index i
				count=count+(n1-i);
			}
			k++;
		}
		while(i<n1)
		{
			arr[k]=leftary[i];
			i++;
			k++;
		}
		while(j<n2)
		{
			arr[k]=rightary[j];
			j++;
			k++;
	
		}
		return count;
	}
	public static long inversionCount(long arr[], long N)
    {
       long temp[] = new long[(int)N];
       //returning the count of inversions in the array.
       return _mergeSort(arr, temp, 0, N - 1); 
    }
	//Function to mergesort the array, which uses divide and conquer algorithm
    //on left and right halves of array for mergesort operation.
    static long _mergeSort(long arr[], long temp[], 
        long left, long right)
    {
        long mid, inv_count = 0; 
        if (right > left) { 
            mid = (right + left) / 2;
            
            //Calling recursive function to sort left half of the array.
            inv_count = _mergeSort(arr, temp, left, mid);
            
            //Calling recursive function to sort right half of the array.
            inv_count += _mergeSort(arr, temp, mid + 1, right);
            
            //Calling merge function which sorts and merges both halves
            //of the array obtained after calling both recursive function.
            inv_count += merge(arr, temp, left, mid + 1, right); 
        } 
        //returning the count of inversions in the array.
        return inv_count; 
    }
    
    //Function to sort and merge two parts of array and return inversion count. 
    static long merge(long arr[], long temp[], long left,
    long mid, long right) 
    { 
        long i, j, k; 
        long inv_count = 0; 
        //i is pointer for left subarray.
        i = left;
        //j is pointer for right subarray.
        j = mid; 
        //k is index for resultant merged subarray.
        k = left; 
        
        //Using two pointers over the array which helps in storing the
        //smaller element and thus merging the subarray.
        while ((i <= mid - 1) && (j <= right)) {
            
            //Comparing element of the array at pointers i and j and accordingly
            //storing the smaller element and updating the pointers.
            if (arr[(int)i] <= arr[(int)j]) 
            { 
                temp[(int)k++] = arr[(int)i++]; 
            } 
            else { 
                temp[(int)k++] = arr[(int)j++]; 
                //Adding the inversions which is the number of elements which 
                //are smaller than arr[j] in the left half of the array.
                inv_count = inv_count + (mid - i); 
            } 
        } 
  
        //Copying the remaining elements of left subarray(if there are any) 
        //to temp.
        while (i <= mid - 1)  
            temp[(int)k++] = arr[(int)i++]; 
  
        //Copying the remaining elements of right subarray(if there are any)
        //to temp.
        while (j <= right) 
            temp[(int)k++] = arr[(int)j++]; 
  
        //Copying back the merged elements to original array.
        for (i = left; i <= right; i++) 
            arr[(int)i] = temp[(int)i]; 
  
        return inv_count; 
    }
	public static void main(String args[])
	{
		int arr[]= {4,3,2,1};
		System.out.println(countInversionefficient(arr, 0, arr.length-1));
	}
}
