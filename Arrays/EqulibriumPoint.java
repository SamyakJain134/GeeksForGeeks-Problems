package Arrays;

public class EqulibriumPoint {
//Given an array A of n positive numbers.
//The task is to find the first Equilibium Point in the array. 
//Equilibrium Point in an array is a position such that the sum of elements 
//before it is equal to the sum of elements after it.
	public static int equilibriumPoint(long arr[], int n) {

        long rightSum=0;
        long leftSum=0;
        for(long i=0;i<arr.length;i++)
        {
        	rightSum=rightSum+arr[(int)i];
        }
        for(int i=0;i<arr.length;i++)
        {
        	if(leftSum==rightSum-arr[i])
        	{
        		return i+1; // Position i+1=1st position when i =0 
        	}
        	leftSum=leftSum+arr[i];
        	rightSum=rightSum-arr[i];
        }
        return -1;
        
    }
	public static void main(String[] args) {
		
	}

}
