package DynamicProgramming;

import java.util.Scanner;

public class MinimumCostPath {

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
		for(int i=dp.length-1;i>=0;i--)
		{
			for (int j=dp[0].length-1;j>=0;j--)
			{
				if(i==dp.length-1 && j==dp[0].length-1) //last element of the array same rahega
				{
					dp[i][j]=ary[i][j];
				}
				else if(i==dp.length-1)//last row ke liye 
				{
					dp[i][j]=dp[i][j+1]+ary[i][j];
				}
				else if(j==dp[0].length-1)//last Column ke liye 
				{
					dp[i][j]=dp[i+1][j]+ary[i][j];
				}
				else//baki elemets ke liye
				{
					dp[i][j]=Math.min(dp[i+1][j], dp[i][j+1])+ary[i][j];
				}
			}
		}
		System.out.println(dp[0][0]);
	}
	}


