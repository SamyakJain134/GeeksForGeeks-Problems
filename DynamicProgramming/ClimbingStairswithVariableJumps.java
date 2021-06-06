package DynamicProgramming;

import java.util.Scanner;

public class ClimbingStairswithVariableJumps {
	//public static int countwithVAriableJump()

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Number for stairs");
		int n=s.nextInt(); 
		int ary[]=new int[n];
		for(int i=0;i<n;i++) //contains ar[i] se kitne dhoor jaa sakte hai 
		{
			ary[i]=s.nextInt(); // konse element se n tak k kitne moves hai
		} 
		int dp[]=new int[n+1]; 
		dp[n]=1; //Last wale element se whaa jane ke liye ek hi rasta hai 
		for (int i=n-1;i>=0;i--)  //store karega i se n jane k kitne raste hai   
		{
			for(int j=1;j<=ary[i] && i+j < dp.length ; j++)
			{
				dp[i]=dp[i]+dp[i+j];
			}
		}
		System.out.println(dp[0]);
	}

}
