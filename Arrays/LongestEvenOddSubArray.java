package Arrays;

public class LongestEvenOddSubArray {
	public static int countevenOdd(int arr[])
	{
		int res=0;
		for(int i=0;i<arr.length;i++)
		{
			int curr=1; //1 because atleast 1 element will be there in longest odd evenn subsequence
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]%2==0 && arr[i-1]%2 !=0 ||arr[i]%2!=0 && arr[i-1]%2 ==0 )
				{
					curr++;
				}
				else
				{
					break;
				}
				res=Math.max(curr, res);
			}
		}
		return res;
	}
	public static int countevenOddEfficient(int arr[])
	{
		int res=1;
		int count=1;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]%2==0 && arr[i-1]%2 !=0 ||arr[i]%2!=0 && arr[i-1]%2 ==0 )
			{
				count++;
				res=Math.max(count, res);
			}
			else
				count=1; //beginning a new sub array
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
