package DynamicProgramming;

public class CoinChangeCombination {
	public static int cointchange(int coins[],int amount)
	{
		//Coin array given 
		//Amount kitna chukana hai 
		int dp[]=new int[amount+1];
		dp[0]=1; //0 ko pay krne ka ek tarika hai pay hi mat karo 
		for(int i=0 ; i<coins.length;i++) //I ko pay karne ke kitn tarike hai  //coins ka loop 
		{
			for(int j=coins[i];j<dp.length;j++) //dp ka loop hai 
			{
				dp[j]=dp[j]+dp[j-coins[i]];
			}
		}
		//In combination Bahar combination ka loo lenge 
		return dp[amount];
		
		
	}
}
