package Arrays;

public class MaxSumSubArray {
	public static int maxSum(int arr[])
	{
		int res=0;
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			for(int j=i;j<arr.length;j++)
			{
				count=count+arr[i];
				res=Math.max(count, res);
			}
		}
		return res;
	}
}
