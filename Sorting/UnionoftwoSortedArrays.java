package Sorting;

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
	
	public static void main(String args[])

	{
		int arr[]= {1, 4, 18, 19, 19, 28, 29, 32, 35, 35, 39, 39, 44, 49, 49, 50, 50};
		int brr[]= {8 ,34};
	//	printUnion(arr, brr,arr.length-1,brr.length-1);
		//String s="nn";
		//Integer i1=Integer.valueOf(s);
	}

}
