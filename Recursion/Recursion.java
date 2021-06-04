package Recursion;

public class Recursion {
	public static int digitalRoot(int n)
    {
        int sum=0;
        while(n!=0)
        {
            sum=sum+n%10;
            n=n/10;
        }
        if(sum>9)
        {
            return digitalRoot(sum);
        }
        else
        	return sum;
    }
	public static void main(String args[])
	{
		System.out.println(digitalRoot(99999));
	}

}
