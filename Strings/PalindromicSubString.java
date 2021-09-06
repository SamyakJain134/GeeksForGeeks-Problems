package Strings;

public class PalindromicSubString {
	public static void solution (String str)
	{
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<=str.length();j++)
			{
				String ss=str.substring(i,j);
				if(isPalindrome(ss)==true)
				{
					System.out.println(ss);
				}
			}
		}
	}

	private static boolean isPalindrome(String str) {
		int i=0;
		int j=str.length()-1;
		while(i<=j)
		{
			if(str.charAt(i)!=str.charAt(j))
			{
				return false;
			}
			else
			{
				i++;
				j--;
			}
		}
		return true;
	}

}
