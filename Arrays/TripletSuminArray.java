package Arrays;

import java.util.Arrays;

public class TripletSuminArray {
	public static boolean tripletSum(int arr[], int sum)
	{
		Arrays.sort(arr);
		for(int i=0;i<arr.length-2;i++)
		{
			int j=i+1;
			int k=arr.length-1;
			while(j<k)
			{
				if(arr[i]+arr[j]+arr[k]==sum)
				{
					System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
					return true;
				}
				else if(arr[i]+arr[j]+arr[k]>sum)
				{
					k--;
				}
				else
				{
					j++;
				}
			}
		}
		return false;
	}
	public static void main(String[] args) {
		 int A[] = { 1, 4, 45, 6, 10, 8 };
	        int sum = 22;
		System.out.println(tripletSum(A, sum));
	}
}
