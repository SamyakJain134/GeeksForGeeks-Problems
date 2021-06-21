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
		//dry run for num=16
		int low=1;
		int high=num;
		//high=16
		int ans=-1;
		//ans=-1;
		while(low<=high)
			//second iteration
			//checking for 1<=7
		{
			int mid=low+high/2;
			//mid=8
			//mid=4
			
			int midsqr=mid*mid;
			//midsqr=64
			//midsqr=16
			if(midsqr==num)//doesnt fall
			{
				return mid;
				//return 4
			}
			else if(midsqr>num)//fall 
			{
				high=mid-1;
				//high becomes 7
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
