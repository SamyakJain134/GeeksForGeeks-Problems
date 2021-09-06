package Searching;

public class RoofTop {
	public static int  rooftop(int arr[])
	{
		 int count=0;
			int max=0;
			for(int i=1;i<arr.length;i++)
			{
				if(arr[i-1]<arr[i])
				{
					count++;
					max=Math.max(count, max);
				}
				else
				{
					
					count=0;
				}
				/*
				 * if(arr[i]==arr[i-1]) { count=0; max=1; }
				 */
			}
			return max;
	}
	

}
