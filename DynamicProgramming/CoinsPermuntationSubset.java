package DynamicProgramming;

public class CoinsPermuntationSubset {
	public static int coundPErmuntation(int coins[],int target)
	{
		int dp[]=new int[target+1];
		dp[0]=1;
		for(int i=1;i<dp.length;i++) //Dp[i] ko sum krne ke liye kine tarike hai 
		{
			for(int j=0;j<coins.length;j++)
			{
				if(coins[j]<=i)
				{
					dp[i]=dp[i]-dp[i-coins[j]]; //Kitne rupee banane hai - kitne rupee ke cin hai apne pas 
				}
			}
//			for(int amt=1;amt<=target;amt++)
//			{
//				for(int coin: coins)
//				{
//					if(coin <=amt)
//					{
//						dp[amt]=dp[amt]+dp[amt-coin];
//					}
//				}
//			}
		}
		return dp[target];
	}
}
