package DynamicProgramming;

import java.util.Scanner;

public class ClimbStairswithMinimumMoves {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Number for stairs");
		int n=s.nextInt(); 
		int ary[]=new int[n];
		for(int i=0;i<n;i++) //contains ar[i] se kitne dhoor jaa sakte hai 
		{
			ary[i]=s.nextInt(); // konse element se n tak k kitne moves hai
		} 
		Integer[] dp=new Integer[n+1];
		dp[n]=0;//n se n zero moves lagte hai last element se //path ek hai 
		for(int i=n-1;i>=0;i--)
		{
			if(ary[i]> 0) //aga null hai toh null rahne denge //ary me 
			{
				int min=Integer.MAX_VALUE;
				for(int j=1;j<=ary[i] && i+j < dp.length ; j++) //j=1 kyuki dp[i] ke next elemet se shurur karna hai
				{
					if(dp[i+j]!=null) //kisi bhi elemen par already agar nulll hua toh 
					{
						min=Math.min(min, dp[i+j]);
					}
				}
				if(min!=Integer.MAX_VALUE)//kuch change hua hai 
				{
					dp[i]=min+1;//current elemet me add kar denge min aur 1 kyuki 1 moove khud ki hai 
				}
				//else ye already hai null
				//{
					//dp[i]=null; 
				//}
			}
		}
		System.out.println(dp[0]);
	}	

}


