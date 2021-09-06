package MatrixArray;

public class SearchinRowMajorOrder {
	public static boolean search(int arr[][],int target)
	{
		//Integers in each row are sorted from left to right.
		//The first integer of each 
		//row is greater than the last integer of the previous row.
		if(arr.length==0)
		{
			return false;
		}
		int row=arr.length;
		int column=arr[0].length;
		int low=0;
		int high=(row*column)-1;
	
		while(low<=high)
		{
			int mid=(low+(high-low)/2);
			if(arr[mid/column][mid%column]==target)
			{
				//System.out.println("Element found at "+(mid/column+1)+ " row "+(mid%column+1)+" Column");
				return true;
			}
			else if(arr[mid/column][mid%column]<target)
			{
				low=mid+1;
				
			}
			else
			{
				high=mid-1;
			}
		}
		System.out.println("Element Not Found");
		return false;
		
	}
//	 static boolean binarySearch1D(int arr[], int K)
//	    {
//	        int low = 0;
//	        int high = N - 1;
//	        while (low <= high) {
//	            int mid = low + (high - low) / 2;
//	 
//	            // if element found return true
//	            if (arr[mid] == K) {
//	                return true;
//	            }
//	 
//	            // if middle less than K then
//	            // skip the left part of the
//	            // array else skip the right part
//	            if (arr[mid] < K) {
//	                low = mid + 1;
//	            }
//	            else {
//	                high = mid - 1;
//	            }
//	        }
//	 
//	        // if not found return false
//	        return false;
//	    }
	 
	    // Function to search an element
	    // in a matrix based on
	    // Divide and conquer approach
//	    static boolean searchMatrix(int matrix[][], int K)
//	    {
//	        int low = 0;
//	        int high = matrix.length - 1;
//	        int N=matrix[0].length-1;
//	        while (low <= high) {
//	            int mid = low + (high - low) / 2;
//	 
//	            // if the element lies in the range
//	            // of this row then call
//	            // 1-D binary search on this row
//	            if (K >= matrix[mid][0]
//	                && K <= matrix[mid][N - 1]) {
//	                return binarySearch1D(matrix[mid], K);
//	            }
//	 
//	            // if the element is less then the
//	            // starting element of that row then
//	            // search in upper rows else search
//	            // in the lower rows
//	            if (K < matrix[mid][0]) {
//	                high = mid - 1;
//	            }
//	            else {
//	                low = mid + 1;
//	            }
//	        }
//	 
//	        // if not found
//	        return false;
//	    }
//	public static void main(String args[])
//	{
//		  int mat[][] = { { 10, 20, 30, 40 },
//                  { 15, 25, 35, 45 },
//                  { 27, 29, 37, 48 },
//                  { 32, 33, 39, 50 } };
//
//		  if(searchMatrix(mat, 29))
//		  {
//			  System.out.println("Found:");
//		  }
//		  else
//		  {
//			  System.out.println("Not Found:");
//		  }
//	}
}
