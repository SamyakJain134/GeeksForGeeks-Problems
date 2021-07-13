package Strings;

import java.util.Arrays;

public class CheckForAnagram {
	public static boolean checkAnagram(String str1,String str2)
	{
		if(str1.length()!=str2.length())
		{
			return false;
		}
		char c1[]=str1.toCharArray();
		Arrays.sort(c1);
		str1=new String(c1);
		
		char c2[]=str2.toCharArray();
		Arrays.sort(c2);
		str2=new String(c2);
		
		return (str1.equals(str2));
		//nlogn
		
	}
	//Method where store the occurace in a couint array and increment the count and decrement accordignly
	static final int count=256;
	
	public static boolean anagramcheck(String str1, String str2)
	{
		if(str1.length()!=str2.length())
		{
			return false;
		}
		int arr[]=new int[count];
		for(int i=0;i<str1.length();i++ )
		{
			arr[str1.charAt(i)]++;
			arr[str2.charAt(i)]--;
		}
		for(int i=0;i<count;i++)
		{
			if(arr[i]!=0)
			{
				return false;
			}
		}
		return true;
	}
	
	public static void main(String args[])
	{
		String str1="abba";
		String str2="baab";
		if(anagramcheck(str1, str2))
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("Not Anagram");
		}
		
	}

}
