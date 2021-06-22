package Searching;

import java.awt.Point;

public class CountOnlyRepeated {
	public static Point findRepeating(Integer arr[],int n)
    {
		Point p=new Point();
		if((arr[n-1]-arr[0])==n-1)
		{
			p.x= -1;
			p.y= -1;
			return p;
		}
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
        	int mid=start+(end-start)/2;
        	
        	if(arr[mid]>=arr[0]+mid)
        	{
        		start=mid+1;
        	}
        	else//(arr[mid]==arr[end])
        	{
        		end=mid;
        	}
        	int frequency=n-1-(arr[n-1]-arr[0]);
        	p.x=arr[mid];
        	p.y=frequency;
        	
        }
		return p;
    }
	public static void main(String args[])
	{
		Integer[] arr= {1,2,3,4,5,5,6,7,8};
		Point p= findRepeating(arr, arr.length);
		System.out.println(p.x+" "+p.y);
	}
	

}
