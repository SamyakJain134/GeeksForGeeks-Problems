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
		return min;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
