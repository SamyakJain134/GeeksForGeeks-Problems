package Arrays;

public class WindowSlidingTechnique {
	//given an array of integers and a number k
	//find the maximum sum of k consecutive integers
	//Naive approach
	public static int winDowSliding(int arr[], int k)
	{
		int max_sum=Integer.MIN_VALUE;
		for(int i=0;i+k-1<arr.length;i++)
		{
			int sum=0;
			for(int j=0;j<k;j++)
			{
				 sum=sum+arr[i+j];
			}
			max_sum=Math.max(max_sum,sum );
		}
		return max_sum;
	}
	//efficient Approach
	public static int winDowSlidingEfficient(int arr[], int k)
	{
		int max_sum=0;
		for(int i=0;i<k;i++)
		{
			max_sum=max_sum+arr[i]; //phle 3 element ka sum
		}
		int curr_Sum=max_sum;
		for(int i=k;i<arr.length;i++)
		{
			curr_Sum=curr_Sum+(arr[i]-arr[i-k]); //kth element me se first elemet - karenge to k consecutive term ka sum aayega 
			max_sum=Math.max(max_sum, curr_Sum);
		}
		return max_sum;
	}
	

	public static void main(String[] args) {
		int arr[]={1,8,30,-5,20,7};
		System.out.println(winDowSlidingEfficient(arr, 3));

	}

}
