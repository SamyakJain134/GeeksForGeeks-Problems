package Searching;

public class SmallestPositiveMissingNumber {
	public static int missingNumber(int arr[], int size)
    {
		// First separate positive and
        // negative number
        int countNegative=segeregate(arr,size);
        int arr2[]=new  int [size-countNegative];
        //This array with contain Positive elements
        int j=0;
        for(int i=countNegative;i<size;i++)
        {
        	arr2[j]=arr[i];
        	j++;
        }
        // Shift the array and call
        // findMissingPositive for
        // positive part
        return findMissingPositive(arr2,j);
    }
	 
	/* Utility function that puts all non-positive
    (0 and negative) numbers on left side of
    arr[] and return count of such numbers */
	private static int segeregate(int[] arr, int size) {
		int countNegative=0;
		int i;
		for(i=0;i<size;i++)
		{
			if(arr[i]<=0)
			{
				int temp=arr[i];
				arr[i]=arr[countNegative];
				arr[countNegative]=temp;
				// increment count of non-positive
                // integers
				countNegative++;
			}
		}
		return countNegative;
	}
	/* Find the smallest positive missing
    number in an array that contains
    all positive integers */
	private static int findMissingPositive(int[] arr, int size) {
		int i;
		 
        // Mark arr[i] as visited by making
        // arr[arr[i] - 1] negative. Note that
        // 1 is subtracted because index start
        // from 0 and positive numbers start from 1
        for (i = 0; i < size; i++) 
        {
            int x = Math.abs(arr[i]);
            if (x - 1 < size && arr[x - 1] > 0)
                arr[x - 1] = -arr[x - 1];
        }
 
        // Return the first index value at which
        // is positive
        for (i = 0; i < size; i++)
            if (arr[i] > 0)
                return i + 1; // 1 is added becuase indexes
        // start from 0
 
        return size + 1;
	}

}
