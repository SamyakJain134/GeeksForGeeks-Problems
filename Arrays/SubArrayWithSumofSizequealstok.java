package Arrays;

public class SubArrayWithSumofSizequealstok {
	public static boolean winDowSlidingEfficient(int arr[], int k,int sum)
	{
		int max_sum=0;
		for(int i=0;i<k;i++)
		{
			max_sum=max_sum+arr[i]; //phle 3 element ka sum
		}
		int curr_Sum=max_sum;
		if(max_sum==sum)
		{
			return true;
		}
		for(int i=k;i<arr.length;i++)
		{
			curr_Sum=curr_Sum+(arr[i]-arr[i-k]);
			if(curr_Sum==sum)
			{
				return true;
			}
		}
		return false;
		
	
	}

	public static void main(String[] args) {
		int arr[]={1,8,30,-5,20,7};
		System.out.println(winDowSlidingEfficient(arr, 3,22));

	}

}
