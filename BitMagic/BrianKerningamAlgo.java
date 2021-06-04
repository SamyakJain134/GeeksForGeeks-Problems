package BitMagic;

public class BrianKerningamAlgo {
	public static int countSet(int n)
	{
		int res=0;
		while(n>0)
		{
			n=(n&(n-1));
			res++;
		}
		return res;
	} //Time Compelcity is theta of total set bit in n  
}
