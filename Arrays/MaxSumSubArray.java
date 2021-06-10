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
	
	public static int maxSumEfficient(int arr[])
	{
		int res=arr[0];
		int maxEnding=arr[0]; //max sum that must end with this element 
		//phle first element ko lenge then saare element me uske phle wka sum add karenge 
		for(int i=1;i<arr.length;i++)
		{
			maxEnding=Math.max(maxEnding+arr[i], arr[i]);
			res=Math.max(res, maxEnding);
		}
		return res;
	}
	
}
