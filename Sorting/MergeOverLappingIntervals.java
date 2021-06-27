package Sorting;

import java.util.Arrays;

class Interval implements Comparable<Interval>
{ 
    int s, e;
    
    Interval(int s, int e) //constructor
    {
        this.s = s;
        this.e = e;
    }
    
    public int compareTo(Interval a)  
    { 
    	return this.s - a.s; 	
    }
};

public class MergeOverLappingIntervals 
{
	public static void mergeIntervals(Interval arr[], int n)
	{
		Arrays.sort(arr); //Sort accourding to start index of interval
		int res=0;
		for(int i=1 ; i< arr.length;i++)
		{
			if(arr[res].e>=arr[i].s) 
			{
				arr[res].s=Math.min(arr[res].s, arr[i].s);
				arr[res].e=Math.max(arr[res].e, arr[i].e);
			}
			else
			{
				res++;
				arr[res]=arr[i]; //which is not a pair so alag se res form karega vo 
			}
		}
		for(int i=0;i<=res;i++)
		{
			System.out.print( "[" + arr[i].s + ", " + arr[i].e + "] ");
		}
	}
	public static void main(String args[])
	{
		Interval arr[] = {new Interval(5,10),new Interval(3,4),new Interval(3,15),new Interval(18,30),
                new Interval(2,7)};
		int n=arr.length;
		mergeIntervals(arr, n);
	}

}
