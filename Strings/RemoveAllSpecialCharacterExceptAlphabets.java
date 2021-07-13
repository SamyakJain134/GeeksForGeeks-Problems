package Strings;

import java.util.Scanner;

public class RemoveAllSpecialCharacterExceptAlphabets {
	public static void main(String args[])
	{
		String str;
		
		Scanner sc = new Scanner(System.in);

	
		str = sc.nextLine();
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)<'A'||str.charAt(i)>'Z' && str.charAt(i)<'a' || str.charAt(i)>'z')
			{
				str=str.substring(0,i)+str.substring(i+1);
				i--;
			}
			//System.out.println(str);
		}
		System.out.println(str);
		
	}
	
}
