package Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class UnionoftwoSortedArrays {
	public static void union(int arr[],int brr[])
	{
		int newary[]=new int [arr.length+brr.length];
		for(int i=0;i<arr.length;i++)
		{
			newary[i]=arr[i];
		}
		for(int i=0;i<brr.length;i++)
		{
			newary[arr.length+i]=brr[i];
		}
		Arrays.sort(newary);
		for(int i=0;i<newary.length;i++)
		{
			if(i==0 || newary[i]!= newary[i-1])
			{
				System.out.println(newary[i]);
			}
		}
	}
	//using merge function
	public static void unionintersec(int arr[],int brr[])
	{
		int i=0;
		int j=0;
		while(i<arr.length && j<brr.length )
		{
			if(i>0 && arr[i]==arr[i-1])
			{
				i++;
				continue;
			}
			if(j>0 && brr[j]==brr[j-1])
			{
				j++;
				continue;
			}
			if(arr[i]>brr[j])
			{
				System.out.print(brr[j]+" ");
				j++;
				//break;
			}
			else if(arr[i]<brr[j])
			{
				System.out.print(arr[i]+" ");
				i++;
				//break;
			}
			else
			{
				System.out.print(arr[i]+" ");
				i++;
				j++;
			}
		}
		while(i<arr.length)
		{
			if(i==0 || arr[i]!=arr[i-1])
			{
				System.out.print(arr[i]+" ");
				i++;
			}
			
		}
		
		while(j<brr.length)
		{
			if(j==0 || brr[j]!=brr[j-1])
			{
				System.out.print(brr[j]+" ");
				j++;
			}
			
		}
	}
	 public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
	    {
	        int i = 0, j = 0; 
	        ArrayList<Integer> ans = new ArrayList<Integer>();
	        
	        //Using two pointers i and j over the two arrays which helps
	        //in storing the smaller element.
	        while (i < n && j < m) 
	        { 
	            //Updating the pointer i until we have identical 
	            //elements at consecutive position in arr1.
	            while(  i+1<n  &&  arr1[i]==arr1[i+1]  )
	                i++;
	                
	            //Updating the pointer j until we have identical 
	            //elements at consecutive position in arr2.
	            while(  j+1<m  &&  arr2[j]==arr2[j+1]  )
	                j++;
	                
	            //Comparing element of the arrays arr1 and arr2 at pointers
	            //i and j and accordingly storing the smaller element
	            //and updating the pointers.
	            if (arr1[i] < arr2[j]) 
	                ans.add(arr1[i++]);
	          
	            else if (arr2[j] < arr1[i]) 
	                ans.add(arr2[j++]);
	                
	            else
	            {
	                //If arr1[i] is same as arr2[j], we update both pointers.
	                ans.add(arr2[j++]);
	                i++;
	            }
	        } 
	        
	        //Storing the remaining elements of first array (if there are any).
	        while(i < n)
	        {
	            //Updating the pointer i until we have identical 
	            //elements at consecutive position in arr1.
	            while(  i+1<n  &&  arr1[i]==arr1[i+1]  )
	                i++;
	            
	            //Storing the elements.
	            ans.add(arr1[i++]);
	        }
	        //Storing the remaining elements of second array (if there are any).
	        while(j < m)
	        {
	            //Updating the pointer j until we have identical 
	            //elements at consecutive position in arr2.
	            while(  j+1<m  &&  arr2[j]==arr2[j+1]  )
	                j++;
	            
	            //Storing the elements.
	            ans.add(arr2[j++]);
	        }
	        
	        //returning the list containing the union of the two arrays. 
	        return ans;   
	        }
	 public static ArrayList<Integer> findUnion2(int arr1[], int arr2[], int n, int m)
	    {
	        ArrayList<Integer> arr=new ArrayList<>();
	        int i=0;
	        int j=0;
	        while(i<n && j< m)
	        {
	            if(i+1<n &&arr1[i]==arr1[i+1])
	            {
	                i++;
	                //continue;
	            }
	            if(j+1<m && arr2[j]==arr2[j+1])
	            {
	                j++;
	                //continue;
	            }
	            if(arr1[i]>arr2[j])
	            {
	                arr.add(arr2[j]);
	                j++;
	            }
	            else if(arr1[i]<arr2[j])
	            {
	                arr.add(arr1[i]);
	                i++;
	            }
	            else
	            {
	                arr.add(arr1[i]);
	                i++;
	                j++;
	            }
	        }
	        while(i<n)
	        {
	            if(i+1<n && arr1[i]==arr1[i-1])
	            {
	            arr.add(arr1[i]);
	            i++;    
	            }
	            
	        }
	        while(j<m)
	        {
	            if( j+1<m  &&  arr2[j]==arr2[j+1])
	            {
	                arr.add(arr2[j]);
	                j++;    
	            }
	            
	        }
	        return arr;
	    }
	public static void main(String args[])

	{
		int arr[]= {1, 4, 18, 19, 19, 28, 29, 32, 35, 35, 39, 39, 44, 49, 49, 50, 50};
		int brr[]= {8 ,34};
	//	printUnion(arr, brr,arr.length-1,brr.length-1);
		//String s="nn";
		//Integer i1=Integer.valueOf(s);
	}

}
