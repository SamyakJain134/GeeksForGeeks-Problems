package BitMagic;

public class OddAppearingNumber {
	public static void countoddappearig(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			int count =0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[j]==arr[i])
				{
					count ++;
				}
			}
			if(count % 2!=0)
			{
				System.out.println(arr[i]);
			}
		}
	}
			//x^0=x
			//x^y=y^x
			//x^(y^z)=(x^y)^z
	//x^x=0
	public static int findOdd(int arr[])
	{
		int res=0;
		for(int i=0;i<arr.length;i++)
		{
			res=res^arr[i];
		}
		return res;
	}
}
