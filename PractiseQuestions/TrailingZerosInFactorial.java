package PractiseQuestions;

public class TrailingZerosInFactorial {
	//For an integer N find the number of trailing zeroes in N!.
	public static int countZeros(int n)
	{
		int count5=0;
		for(int i=5; n/i>=1;i=i*5)
		{
			count5=count5 + n/i;
		}
		return count5;
	}
	public static void main(String[] args) {
		System.out.println(countZeros(11));

	}

}
