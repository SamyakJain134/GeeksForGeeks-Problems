package Sorting;

import java.util.ArrayList;

public class IntersectionofTwoSortedArrays {
	public static void intersecion(int arr[], int brr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			if(i>0 && arr[i]==arr[i-1]) //to avoid duplicates
			{
				continue;
			}
			for(int j=0;j<brr.length;j++)
			{
				if(arr[i]==brr[j])
				{
					System.out.println(arr[i]);
					break;
				}
			}
		}
	}
	//using merge function in merge sort 
	public static void intesectionofsortedarray(int arr[], int brr[])
	{
		int i=0;
		int j=0;
		while(i<arr.length && j<brr.length )
		{
			if(i>0 && arr[i]==arr[i-1]) //two same elements 
			{
				i++;
				continue;
			}
			if(arr[i]>arr[j])
			{
				j++;
			}
			else if(arr[i]<arr[j])
			{
				i++;
			}
			else
			{
				System.out.println(arr[i]);
				i++;
				j++;
			}
		}
	}
	
	public static ArrayList<Integer> printIntersection(int arr1[], int arr2[], int n, int m) 
    {
        int i = 0, j = 0;
        boolean flag=false;
        
        ArrayList<Integer> sb = new ArrayList<Integer>();
        
        //Using two pointers i and j over the two arrays which helps
        //in storing the elements which are present in both the arrays.
        while (i < n && j < m)
        {
            //Updating the pointer i if we have identical 
            //elements at consecutive position in arr1.
            if (i > 0 && arr1[i-1] == arr1[i])
            {
                i++;
                continue;
            }
            //Comparing element of the arrays arr1 and arr2 at pointers
            //i and j and storing only the elements which are present in
            //both the arrays and updating the pointers.
            if (arr1[i] < arr2[j])
               i++;
            else if (arr2[j] < arr1[i])
               j++;
            else
            {
               sb.add(arr2[j]);
               flag=true;
               i++; j++;
            }
        }
        //If no common element is present in both arrays,
        //we store -1 in the list.
        if(flag==false)
            sb.add(-1);
            
        //returning the list containing the intersection of the two arrays.
        return sb;
    }

}
