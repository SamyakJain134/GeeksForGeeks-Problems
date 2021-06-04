package BitMagic;

public class CheckifPowerOfTWo {

	public static boolean powerof(int n)
	{
		if(n==0)
		{
			return false;
		}
		while(n!=1)
		{
			if(n%2!=0) //odd number
			{
				return false;
			}
			n=n/2;
		}
		return true;
	}
	public static boolean powerof2(int n)
	{
		if(n==0)
		{
			return false;
		}
		return ((n&(n-1))==0);
	}
}
