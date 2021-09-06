package DynamicProgramming;

import java.util.Scanner;

public class CountNoOfClimbingStairsWith3Jumps {
//count number of paths from source o destination 
	public static int countPaths(int n)
	{
		
		if(n==0) //ek path hai  //oth  level pr ek hi valid path hai 
		{
			return 1;
		}
		else if(n<0) //not a valid path 
		{
			return 0;
		}
		System.out.println("Duplicacy Same problem ko bar bar call karega "+n);
		int nm1=countPaths(n-1);
		int nm2=countPaths(n-2);
		int nm3=countPaths(n-3);
		return nm1+nm2+nm3;
	}
	public static int countPathsMemorize(int n,int qb[]) //qb is of size n+1
	{
		
		if(n==0) //ek path hai 
		{
			return 1;
		}
		else if(n<0)
		{
			return 0;
		}
		if(qb[n]>0) //already value stored hai 
		{
			return qb[n];
		}
		System.out.println("Duplicacy Same problem ko Kam bar call karega "+n);
		int nm1=countPathsMemorize(n-1,qb);
		int nm2=countPathsMemorize(n-2,qb);
		int nm3=countPathsMemorize(n-3,qb);
		int cp=nm1+nm2+nm3;
		qb[n]=cp;
		return cp;
	}
	
	//Tabulation MEthod 
	//1- Storage AND meaning
	//2-Direction(<>)
	//3- Travel and Solve
	public static int countPathstabulation(int n)
	{
		int []dp=new int [n+1];
		dp[0]=1;
		for(int i=1;i<=n;i++)
		{
			if(i==1)
			{
				dp[i]=dp[i-1];
			}
			else if(i==2)
			{
				dp[i]=dp[i-1]+dp[i-2];
			}
			else
			{
				dp[i]=dp[i-1]+dp[i-2]+dp[i-3];	
			}
		}
		return dp[n];
	}
	//N stair se zero ana hai  paths batana hai 
		public static void printStairPath(int n, String path)
		{
			if(n<0)
			{
				return;
			}
			if(n==0)
			{
				System.out.println(path); // sahi rasta hai ye 
				return;
			}
			printStairPath(n-1 , path+ "1");
			printStairPath(n-2,  path+ "2");
			printStairPath(n-3,  path+ "3");
		}
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Number for stairs");
		int n=s.nextInt();
		//int cp=countPathsMemorize(n, new int [n+1]);
		//int cp=countPathstabulation(n);
		
		printStairPath(7, "sa");
		
		//System.out.println(cp);

	}

}
