package DynamicProgramming;

import java.util.Scanner;

public class FibonacciNumber {
	public static int fibonacci(int n)
	{
		if(n==0||n==1)
		{
			return n;
		}
		return fibonacci(n-1)+fibonacci(n-2);
	}

	public static int fibonacciMemorisation(int n , int qb[])
	{
		if(n==0||n==1)
		{
			qb[n]=n;
			return n;
		}
		if(qb[n]!=0) //answer already calculate kar liya hai 
		{
			
			return qb[n];
		}
		int fibonaccivalue=fibonacciMemorisation(n-1, qb)+fibonacciMemorisation(n-2, qb);
		qb[n]=fibonaccivalue;
		return fibonaccivalue;
	}
	
		public static int fibonacciDp(int n)
	{
		int storage[]=new int[n+1];
		storage[0]=0;
		storage[1]=1;
		for(int i=2;i<=n;i++)
		{
			storage[i]=storage[i-1]+storage[i-2];
		}
		return storage[n];
	}

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Number for Fibonacci");
		int n=s.nextInt();
		
		System.out.println("Answer is "+fibonacci(n));
		System.out.println("Answer is "+fibonacciMemorisation(n, new int[n+1]));
		System.out.println("Answer is "+fibonacciDp(n));

	}

}
