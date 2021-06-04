package Recursion;

public class JosephusProblem {
	public static int josephuss(int n, int k)
	{
		if(n==1)
		{
			return 0;
		}
		return (josephuss(n-1,k)+k)%n;
	}
	//If n starts from 1 them add 1 in result !!!
	
}
