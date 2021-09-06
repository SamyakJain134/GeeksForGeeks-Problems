package DynamicProgramming;

public class UnBoundedKnapsack {
public static int unbounded(int values[],int weight[], int target)
{
	int dp[]=new int[target+1];
	dp[0]=1;
	for(int bagCapacity=1;bagCapacity<=dp.length;bagCapacity++)
	{
		int max=0;
		for(int i=0;i<values.length;i++)
		{
			
			if(weight[i] <= bagCapacity) //hum use use kar sakt hai bag me 
			{
				int remainingbagcapacity=bagCapacity-weight[i]; //hum use bag me dalenge
				int remainingbagValue=dp[remainingbagcapacity];
				int totalbagValue=remainingbagValue +values[i];
				if(totalbagValue>max)
				{
					max=totalbagValue;
				}
			}
		}
		dp[bagCapacity]=max;
	}
	return dp[target];
}
}
