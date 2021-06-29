
package Sorting;

import java.util.Arrays;

public class MaximumtheMeetingGuest {
	public static int maximizeguest(int arr[] ,int brr[])
	{
		Arrays.sort(arr);
		Arrays.sort(brr);
		int i=1;//Considering atleast one member is here in the party/
		int j=0; //departure time 
		int count=1; //Atleast one member is here beacuse we have taken i=1
		int res=1;
		while( i<arr.length && j <arr.length )
		{
			if(arr[i]<=brr[j]) //we have another guest before the departure of first
			{
				count++;
			
				i++;
				
			}
			else //here departure time is more so earlier guest entered has left so new guest will be compared
			{
				count--;
				j++;
			}
			res=Math.max(res,count);
		}
		return res;
		
	}
}
