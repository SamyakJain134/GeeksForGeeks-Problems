package Arrays;
//You are given two integers N and M, and print 
//all the terms of the series upto M-terms of the N-bonacci Numbers. For example, 
//when N = 2, the sequence becomes Fibonacci,
//when n = 3, sequence becomes Tribonacci.
public class NBonacciNumbers {
public static void nBonacciNumber(int n, int m)
{
	int arr[] =new int[m];
	arr[n-1]=1; //ni1 elements tak 0 rahega , n-1th element par 1 aayega '
	for(int i=n;i<m;i++)
	{
		for(int j=i-n;j<i;j++)
		{
			arr[i]=arr[i]+arr[j];
		}
	}
	for(int i=0;i<m;i++)
	{
		System.out.print(arr[i]+ " ");
	}
}
public static void nBonacciEfficilent(int n, int m)
{
	 int a[] = new int[m];
     for(int i = 0; i < m; i++)
     {
    	 a[i]=0; 
     }
          
     a[n - 1] = 1; 
     a[n] = 1;
  
     // Uses sliding window
     for (int i = n + 1; i < m; i++)
         a[i] = 2 * a[i - 1] - a[i - n - 1];
  
     // Printing result
     for (int i = 0; i < m; i++)
         System.out.print(a[i] + " ");
}
	public static void main(String[] args) {
		nBonacciNumber(5,15 );

	}

}
