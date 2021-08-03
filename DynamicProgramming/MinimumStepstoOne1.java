package DynamicProgramming;
//Given a positive integer 'n', find and return the minimum number of steps that 'n' has to take to get reduced to 1. You can perform any one of the following 3 steps:
//1.) Subtract 1 from it. (n = n - ­1) ,
//2.) If its divisible by 2, divide by 2.( if n % 2 == 0, then n = n / 2 ) ,
//3.) If its divisible by 3, divide by 3. (if n % 3 == 0, then n = n / 3 ).  
public class MinimumStepstoOne1 {
	public static int counntMinimumSteps (int n)
	{
		if(n==1)
		{
			return 0;
		}
		int a1=counntMinimumSteps(n-1);
		int a2=Integer.MAX_VALUE;
		int a3=Integer.MAX_VALUE;
		if(n%2==0)
		{
			a2=counntMinimumSteps(n/2);
		}
		if(n%3==0)
		{
			a2=counntMinimumSteps(n/3);
		}
		return 1+Math.min(a1, Math.min(a2, a3));
	}
	//USING Memorisation
	public static int countMinStepsToOne(int n) {
		
       int storage[]=new int[n+1];
       return countMinStepsToOne(n,storage);
       
	}
	public  static int countMinStepsToOne(int n, int[] storage) 
	{
		if(n==1)
		{
			storage[n]=0;
			return storage[n];
		}
		if(storage[n]!=0)
		{
			return storage[n];
		}
		int a1=countMinStepsToOne(n-1, storage);
		int a2=Integer.MAX_VALUE;
		int a3=Integer.MAX_VALUE;
		if(n%2==0)
		{
			 a2=countMinStepsToOne(n/2, storage);
		}
		if(n%3==0)
		{
			 a3=countMinStepsToOne(n/3, storage);
		}
		storage[n]=1+Math.min(a1, Math.min(a2, a3));
		
		return storage[n];
		 
		
	}
	public  static int countMinStepsToOneDP(int n, int[] storage) 
	{
		
		 int storage1[] = new int[n+1];
		 storage1[1]=0;
		 
	        for(int i = 2 ; i <= n ; i++ )
	        {
	            int min = storage1[i-1];
	           
	            if( i%3 == 0 )
	            {
	            	if(min>storage1[i/3])
	            	{
	            		min = storage1[i/3];
	            	}
	            		
	            }
	            if( i%2 == 0 && min > storage1[i/2])
	            {
	            	min = storage1[i/2];
	           	}
	            storage1[i] = min + 1;
	        }
	        return storage1[n];	
	
	}
	public static void main(String args[])
	{
	System.out.println(countMinStepsToOne(10));	
	}
}
