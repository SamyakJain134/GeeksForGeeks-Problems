package Strings;

public class SubsequenceofAString {
//Total number of subsequences are 2power n
	public static boolean naive(String str1,String str2)
	{
		int i;int j=0;
		for(i=0; i<str1.length() && j<str2.length() ;i++)
		{
			if(str1.charAt(i)==str2.charAt(j))
			{
				j++;
			}
		}
		return (j==str2.length());
	}
	//Recursive
	public static boolean recursive(String str1, String str2,int n,int m)
	{
		if(n==0)
		{
			return false;
		}
		if(m==0)
		{
			return true; //smaller string has become zero in thsi case so return true 
		}
		if(str1.charAt(n-1)==str2.charAt(m-1))
		{
			return recursive(str1, str2, n-1, m-1);
		}
		else
		{
			return recursive(str1, str2, n-1, m);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
