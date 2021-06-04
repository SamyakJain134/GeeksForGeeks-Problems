package BitMagic;

public class CheckIfKthBitisSet {
	public static void kThbit(int n,int k) //by left shift 
	{
		if((n&(1<<(k-1))) !=0)
		{
			System.out.println("Yes");
		}
		else
			System.out.println("No");
	}
	public static void kThbitRightShift(int n,int k) //by Right shift 
	{
		if(((n>>(k-1))&1)==1)
		{
			System.out.println("Yes");
		}
		else
			System.out.println("No");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
