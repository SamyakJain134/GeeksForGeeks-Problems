package Strings;

public class PalindromeString {
	public static boolean usinmgtringBuilder(String str)
	{
		StringBuilder s=new StringBuilder(str);
		s.reverse();
		return str.equals(s.toString());
	}
	//Other MEthod
	public static boolean palindromeCheck(String str)
	{
		//String temp=str;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=str.charAt(str.length()-i-1))
			{
				return false;
			}
			
		}
		return true;
	}
	
	public static void main(String[] args) {
		String s="abbaa";
		System.out.println(usinmgtringBuilder(s));
		System.out.println(palindromeCheck(s));

	}

}
