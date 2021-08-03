package Strings;

public class UppertoLowerCaseandViceVersa {
	public static String upperCase(String str)
	{
		String s="";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>=65 && str.charAt(i)<=92)
			{
				s=s+(char)(str.charAt(i)+32);
			}
			else
			{
				s=s+(char)(str.charAt(i));
			}
		}
		return s;
	}

}
