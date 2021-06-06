package DynamicProgramming;

import java.util.Scanner;

public class GoldMinePathWithMaximumGold {
//Man digs from left to right he can eight go right , uwardright or downward right 
	//answer ould be first column ka maximum 
	//last column same hi rahega 
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Number for Rows");
		int n=s.nextInt(); 
		System.out.println("Enter Number for columns");
		int m=s.nextInt();
		int ary[][]=new int [n][m];
		for(int i=0;i<ary.length;i++)
		{
			for (int j=0;j<ary[0].length;j++)
			{
				System.out.println("Enter Element for "+i +"th Row and"+j+"Column");
				ary[i][j]=s.nextInt();
			}
		}
		
		int dp[][]=new int [n][m]; //same size ki dp banegi 
		for(int j=ary[0].length-1;j>=0;j--) //last column
		{
			for(int i=ary.length-1;i>=0;i--) //last index nice se upar
			{
				if(j==ary[0].length-1)//last column
				{
				dp[i][j]=ary[i][j];
				}
				else if(i==0)//first row
				{
					dp[i][j]=ary[i][j]+Math.max(dp[i][j + 1],dp[i + 1][j + 1]);
				}
				else if(i==ary.length-1) //last row
				{
					dp[i][j]=ary[i][j]+Math.max(dp[i][j + 1],dp[i -1][j + 1]);
				}
				else //baki elements ke liye 
				{
					dp[i][j]=ary[i][j]+Math.max(dp[i][j + 1],Math.max(dp[i -1][j + 1], dp[i + 1][j + 1]));
				}
			}
		}
		int max=dp[0][0];
		for(int i=1;i<dp.length;i++)
		{
			if(dp[i][0]>max)
			{
				max=dp[i][0];
			}
		}
		System.out.println(max);
	}
	}


