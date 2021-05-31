package Arrays;

public class Recursion {
	//Binary Equivalent of a number 
	public static void BinaryEquivalent(int n)
	{
		if(n==0)
		{
			return ;
		}
		BinaryEquivalent(n/2);
		System.out.println(n%2);
		//13-1101
		//For decimal to binary conversion print the code in reverse order
		
	}
	//print n to 1 using Recursion
	public static int nto1(int n)
	{
		if(n==0)
		{
			return 1;
		}
		System.out.println(n);
		return nto1(n-1);
		//Time = O(n)
	}
	//print 1 to n using Recursion
	public static void print1toN(int n)
	{
		if(n==0)
		{
			return;
		}
		print1toN(n-1);
		//T(n)=T(n-1)+constant
		System.out.println(n+" ") ;
		//Time = O(n)
	}
//Tail Recursion - A recursive function is called tail recursive 
	//When the parent funcion has nothing more to do after child finishes
	//When the last thing that happens is recursive call and nothing after that 

	
	
	//factorial Of a function
	public static int factorial(int n)
	{
		if(n==0|| n==1)
		{
			return 1;
		}
		return n*factorial(n-1);
		
		
	}
	//For Tail Recursive
	public static int factorialtailRecursive(int n , int k)
	{
		//initailly pass k=1
		if(n==0|| n==1)
		{
			return k;
		}
		return factorialtailRecursive(n-1,k*n);
	}
	
	//Fibonacci Number 
	public static int fibonacci(int n)
	{
		if(n==0|| n==1)
		{
			return n;
		}
		return fibonacci(n-1)+fibonacci(n-2);
		
	}
	//Sumof first n Natural number
	public static int sumofN(int n)
	{
		if(n==0||n==1)
		{
			return n;
		}
		return n+sumofN(n-1);
		
		
	}
	//Palindrome using Recursion
	public static boolean isPalindrome(String s,int start,int end) //start=0 end=string.length-1
	{
		if(start>=end)
		{
			return true;
		}
	 return s.charAt(start)==s.charAt(end) && isPalindrome(s, start+1, end-1) ;	
	}
	//Palindrome of a number 
	public static boolean isPalin(int N)
    {
        if(solve(N,0)==N)
        {
            return true;
        }
        return false;
        
    }
 public static int solve(int N , int sum)
    {
        if(N==0)
        {
            return sum;
        }
        return solve(N/10,sum*10+N%10);
    }
	//Sum of digits 
	public static int SumofDigits(int n)
	{
		if (n==0||n<=9) //single digit number return same 
		{
			return n;
		}
		return SumofDigits(n/10)+ n%10;
	}
	//Rope Cutting PRoblem 
	//Cut rope in max possible ways 
	public static int RopeCuttin(int num , int a ,int b , int c)
	{
		if(num==0)
		{
			return 0;
		}
		if(num<0)
		{
			return -1;
		}
		//int result = Math.max(RopeCuttin(num-a, a, b, c), RopeCuttin(num-b, a, b, c),RopeCuttin(num-c, a, b, c));
	return 0;	
	}
	//Generate subsets of a string 
	public static void subsets(String s , String curr, int i)
	{
		if(i==s.length())
		{
			System.out.println(s);
			return;
		}
		subsets(s, curr, i+1);
		subsets(s, curr+s.charAt(i), i+1);
	}
	// Calculatig nCr
	public static int nCr(int n,int r)
    {
        if (r > n)
            return 0;
        if(r==0|| r==n)
		{
			return 1;
		}
        return nCr(n-1,r-1)+nCr(n-1,r);
    }
	//Priting array elements using recursion
	public static void printarray(int ary[])
	{
		if(ary.length==0)
		{
			return;
		}
		print1toN(ary[ary.length-1]);
		System.out.println(ary[ary.length]);
		
		
	}
	//Finding power of a number
	public static int power(int x, int n)
	{
		if(n==0)
		{
			return 1;
		}
		return x*power(x,n-1);
	}
	//sum of array
	public static int sumarray(int ary[], int index) //index zero milega
	{
		if(ary.length==index)
		{
			return 0;
		}
		return ary[index]+sumarray(ary,index+1);
		
	}
	//check number in array
	public static boolean checkNuminarray(int ary[] , int x,int index) //index zero milega
	{
		if(index==ary.length)
		{
			return false;
		}
		if (ary[index]==x)
		{
			return true;
		}
		return checkNuminarray(ary, x, index+1);
	}
//Finding index of a number in array
	public static int checkNumindex(int ary[] , int x,int index) //index zero milega
	{
		if(index==ary.length) //matllab nahi hai 
		{
			return -1;
		}
		if (ary[index]==x)
		{
			return index;
		}
		return checkNumindex(ary, x, index+1);
	}
	//Finding Last index of a number in array
	public static int lastIndex(int ary[] , int x,int index) //index = ary.length
	{
		if(index<0) //matllab nahi hai 
		{
			return -1;
		}
		if (ary[index]==x)
		{
			return index;
		}
		return checkNumindex(ary, x, index-1);
		//last index ke lie index piche se shuru kia 
	}
	
	//Multiply Two Integer
	public static int multiplyTwoIntegers(int m, int n){
		if(m==0 || n==0)
            return 0;
        return m+multiplyTwoIntegers(m,n-1);
    }
	//Count Zeros in a number
	public static int countZerosRec(int input){
		if(input == 0)
        {
            return 1;
        }
        if(input<10)
        {
            return 0;
        }
    	int lastdigit=input%10;
        int smallernumber=countZerosRec(input/10);
        if(lastdigit==0)
        {
            return smallernumber+1;
        }
        else
            return smallernumber;
	}
	//Remove X from String
	public static String removeX(String str)
	{
		if(str.isEmpty())
		{
			return str;
		}
		String ans="";
		if(str.charAt(0)!='x')
		{
			ans=ans+str.charAt(0);
		}
		String smallans=removeX(str.substring(1));
		return ans+smallans;
	}
	//Replace Character C1 by c2
	public static String replaceCharacter(String input, char c1, char c2) {
		if(input.isEmpty())
		{
			return input;
		}
		String ans="";
		if(input.charAt(0)==c1)
		{
			ans=ans+c2;
		}
		else
		{
			ans=ans+input.charAt(0);
		}
		String smallans=replaceCharacter(input.substring(1),c1,c2);
		return ans+smallans;

	}
	//Removing consecutuve duplicates
	public static String removeConsecutiveDuplicates(String s) {
		// Write your code here
		if(s.length()==1)
            {
                return s;
            }
		String small=s.substring(1);
        	String ans=removeConsecutiveDuplicates(small);
        	if(s.charAt(0)==ans.charAt(0))
            {
                return ans;
            }
        else
        {
            return s.charAt(0)+ans;
        }
	}
	//SumofMaximun and minimum in array
	public static int sumOfMaxandMin(int arr[], int n)
	{
	    if(n==1)
	    {
	        return arr[0];
	    }
	    return Math.max(arr[n-1],sumOfMaxandMin(arr,n-1));
	    //int max=maxofnumber(arr, n);
	   //int min=minofnumber(arr, n);
	   // return min+max;
	}
	public static int maxofnumber(int arr[], int n)
	{
		return Math.max(arr[n-1],sumOfMaxandMin(arr,n-1));
	}
	public static int minofnumber(int arr[], int n)
	{
		return Math.min(arr[n-1],sumOfMaxandMin(arr,n-1));
	}
	
	//Sum of product of corresponcing digits 
	public static int sumOfProductOfDigits(int n1, int n2)
	{
	    int sum = 0;
	       
	        while (n1 > 0 && n2 > 0) {
	            sum += ((n1 % 10) * (n2 % 10));
	            n1 /= 10;
	            n2 /= 10;
	        }
	 
	        return sum;

	}
	
	
	public static void main(String[] args) {
		//System.out.println(nto1(5));
		//System.out.println(factorialtailRecursive(5, 1));
		//System.out.println(sumofN(5));
		//String s ="abbaa";
		//System.out.println(isPalindrome(s, 0,s.length()-1 ));
		//System.out.println(SumofDigits(256));
		//System.out.println(nCr(13,11 ));
		int ary[]= {1,2,3,4};
		System.out.println(sumOfMaxandMin(ary, ary.length));
		//printarray(ary);
	}

}
