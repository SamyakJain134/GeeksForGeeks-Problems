package Arrays;

public class MaxSubArraySumofNelements {
	public static int maxSum(int arr[], int k)
	{
		int totalsum=0;
		for(int i=0;i<arr.length;i++)
		{
			int sum=0;
			for(int j=i;j<i+k;j++)
			{
				sum=sum+arr[j];
			}
			totalsum=Math.max(sum, totalsum);
		} 
		return totalsum;
		
	}

}
