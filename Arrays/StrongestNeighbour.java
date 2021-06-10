package Arrays;
//Given an array arr[] of n positive integers. 
//The task is to find the maximum for every adjacent pairs in the array.
public class StrongestNeighbour {
	// Function to find maximum for every adjacent pairs in the array.
   public static void maximumAdjacent(int sizeOfArray, int arr[])
   {
	   int max=arr[0];
   for(int i=1;i<sizeOfArray;i++)
   {
	   if(arr[i]>=max)
	   {
		   	max=arr[i];
	   }
	   System.out.print(max);
	   max=arr[i];
   }
        
        
    }

}
