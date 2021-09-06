package Arrays;

public class MinimumAdjacentDifferenceInCircularArray {
		//Given an array Arr of n integers arranged in a circular fashion. 
		//Your task is to find the minimum absolute difference between 
		//adjacent elements.
	public static int minimumAdjacentElements(int arr[])
	{
		int min=Integer.MAX_VALUE;
		for(int i=1;i<arr.length;i++)
		{
			int x= Math.abs(arr[i]-arr[i-1]);
			if(min>x)
			{
				min=x;
			}
		}
		//for First and LAst Element
		if(Math.abs(arr[0]-arr[arr.length-1])<min)
		{
			min=Math.abs(arr[0]-arr[arr.length-1]);
		}
		/*
		 *  int res = Math.abs(arr[1] - arr[0]); 
		 *  for (int i = 2; i < n; i++) 
		 *   res= Math.min(res, Math.abs(arr[i] - arr[i - 1])); // // // Checking circular
		 * link 
		 *  res = Math.min(res, Math.abs(arr[n - 1] - arr[0]));
		 */		return min;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
