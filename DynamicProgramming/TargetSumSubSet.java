package DynamicProgramming;

public class TargetSumSubSet 
{
	public static boolean isTargetSumSubset(int arr[],int target)
	{
		boolean dp[][]=new boolean[arr.length+1][target+1];
		for(int i=0;i<dp.length;i++)
		{
			for(int j=0;j<dp[0].length;j++)
			{
				if(i==0 && j==0) //first element 
				{
					dp[i][j]=true;
				}
				else if(i==0) //first row first element ko chod kar , cuz 0 kisike subset nahi bana payega
				{
					dp[i][j]=false;
				}
				else if(j==0)
				{
					dp[i][j]=true;
				}
				else
				{
					if(dp[i-1][j]==true)//phle ki team ne hi bana diye
					{	
						dp[i][j]= true; //Jab batting nahi ki toh tumse phle ki team ne run bana liye 
					}
					else
					{
						//Ye batting karega
						//Check if ye bande ka score jitna score banana hai usse kam hona chahiye 
						//And dp array ki i index given array ka i-1 index hai 
						int val=arr[i-1]; //ye current banda kitne score karta hai 
						//J run banane hai vop val se zyada hone chahitye tabhoi batting kara payenge 
						if(j>=val) //tabhi hum batting karayenge 
						{
							 //i-1 team ko j-1 store karna hoga
							if(dp[i-1][j-val]==true)
							{
								dp[i][j]= true;
							}
						}
					}
				}
			}
		}
		return dp[arr.length][target];	
	}
}
