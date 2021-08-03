package Strings;

public class KeypadTyping {

	public static String printNumber(String s, int n) 
	{
		String str="";
		for(int i=0;i<n;i++)
		{
			if(s.charAt(i)>='a' && s.charAt(i)<='c')
			{
				str=str+'2';
			}
			else if(s.charAt(i)>='d' && s.charAt(i)<='f')
			{
				str=str+'3';
			}
			else if(s.charAt(i)>='g' && s.charAt(i)<='i')
			{
				str=str+'4';
			}
			else if(s.charAt(i)>='j' && s.charAt(i)<='l')
			{
				str=str+'5';
			}
			else if(s.charAt(i)>='m' && s.charAt(i)<='o')
			{
				str=str+'6';
			}
			else if(s.charAt(i)>='p' && s.charAt(i)<='s')
			{
				str=str+'7';
			}
			else if(s.charAt(i)>='t' && s.charAt(i)<='v')
			{
				str=str+'8';
			}
			else if(s.charAt(i)>='w' && s.charAt(i)<='z')
			{
				str=str+'9';
			}
		}
		return str;
	}
	public static void main(String args[])
	{
		System.out.println(printNumber("amazon", 6));
	}
	
}
