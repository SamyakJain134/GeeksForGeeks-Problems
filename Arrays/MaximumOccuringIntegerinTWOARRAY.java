package Arrays;
//Given n integer ranges, the task is to find the maximum occurring integer in 
//these ranges. If more than one such integer exits, find the smallest one.
//The ranges are given as two arrays L[] and R[]. 
//L[i] consists of starting point of range and R[i] consists of corresponding end point of the range.

//For example consider the following ranges.
//L[] = {2, 1, 3}, R[] = {5, 3, 9)
//Ranges represented by above arrays are.
//[2, 5] = {2, 3, 4, 5}
//[1, 3] = {1, 2, 3}
//[3, 9] = {3, 4, 5, 6, 7, 8, 9}
//The maximum occurred integer in these ranges is 3.
public class MaximumOccuringIntegerinTWOARRAY {
	 public static int maxOccured(int L[], int R[], int n, int maxx){
	      int arr[]=new int[1000000];
	      for(int i=0;i<arr.length;i++)
	      {
	    	  arr[i]=0;
	      }
	      for(int i=0;i<n;i++)
	      {
	    	  arr[L[i]]++; // L ke elments +1 kar denge initially zero the 
	    	  //If elemet in left array comes again , increase count 
	    	  arr[R[i]+1]--; //Right ke elements -1 kar denge 
	      }
	      //Now Find Prefix Sum
	      int max=arr[0];
	      int res=0;
	      for(int i=1;i<arr.length;i++)
	      {
	    	  arr[i]=arr[i]+arr[i-1];
	    	  if(arr[i]>max)
	    	  {
	    		  max=arr[i];
	    		  res=i; //returning the index of max Element
	    	  }
	      }
	      return res;
 	        
	        
	    }

}
