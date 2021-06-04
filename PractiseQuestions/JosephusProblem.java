package PractiseQuestions;

public class JosephusProblem {
	public static int Josephus(int n, int k)
	{
		if(n==1)
		{
			return 0;
		}
		return (Josephus (n-1, k)+k)%n;
	}
	//If n starts from 1 them add 1 in result !!!
	
}
