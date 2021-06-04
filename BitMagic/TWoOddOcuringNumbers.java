package BitMagic;

public class TWoOddOcuringNumbers {
	public static int missingnunber(int n[])
	{
		int res=0;
		int s=n.length+1;
		for(int i=0;i<s;i++)
		{
			res=res^i;
		}
		for(int i=0;i<n.length;i++)
		{
			res=res^n[i];
		}
		return res;
	}

}
