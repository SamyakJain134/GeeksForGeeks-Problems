package Searching;

public class SquareRoot {
	public static int squareRoot(int num)
	{
		int i=1;
		while(i*i<=num)
		{
			i++;
		}
		return i-1;
	}
	//Iterative Time -logx
	public static int squareRootIterative(int num)
	{
		int low=1;
		int high=num;
		int ans=-1;
		while(low<=high)
		{
			int mid=low+high/2;
			int midsqr=mid*mid;
			if(midsqr==num)
			{
				return mid;
			}
			else if(midsqr>num)
			{
				high=mid-1;
			}
			else //(midsqr<num)
			{
				low=mid+1;
				ans=mid;
			}
		}
		return ans;
	}

}
