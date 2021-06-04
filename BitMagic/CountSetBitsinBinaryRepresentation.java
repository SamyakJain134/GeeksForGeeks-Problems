package BitMagic;


public class CountSetBitsinBinaryRepresentation {
	public static int countSet(int n)
	{
		int res=0;
		while(n>0)
		{
			if(n%2!=0) //OR if((n&1)==1)
			{
				res++; //alst bit is set
				n=n/2; //removing last bit  //OR n=n>>1	 
			}
		}
		return res;
	} //Time Compelcity is theta of total bit in N 
}
