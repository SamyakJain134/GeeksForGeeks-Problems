package DynamicProgramming;

public class ZeroONEKnapsack {
	
	public static int Knapsack(int value[],int weight[],int capacity)
	{
		int dp[][]=new int[value.length+1][capacity+1];
		// By default first row and first column me 0 hoga , 
		//Jab koi ball nahi hogi tab bhi zero run banenge 
		//Jab koi player nahi hoga tab bhi zero run banenge 
		
		for(int i=1;i<dp.length;i++) //Representing Player
		{
			for(int j=1;j<dp[0].length;j++) //representing balls
			{
				//Hamara dp array ka i value array ke i-1 se coincide karega 
				//agar battig nahi karwai 
				 //j balls par i tak ki team kitne score kar sakte hia 
				//agar i ne batting nahi kari toh jo uske upar row hai usko saari balls mil jayengi 
				//Agar ye batting akrta hia 
				//Zruri hai ke j balls hai 
				if(j>=weight[i-1]) //Total balls should be greater then weight[i-1] to do batting 
				{
					//When there are suffucient balls 
					int remainingBalls=j-weight[i-1];
					if(dp[i-1][remainingBalls] +weight[i-1] > dp[i-1][j])
					{
						dp[i][j]=dp[i-1][j-weight[i-1]]+weight[i-1];
					}
					else
					{
						dp[i][j]=dp[i-1][j];
					}
				}
				else
				{
					dp[i][j]=dp[i-1][j]; 
				}
			}
		}
		return dp[value.length][capacity];	
	}
}
