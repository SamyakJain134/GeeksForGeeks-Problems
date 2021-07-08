package Recursion;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class PrintSubsequenceofString {
	public static ArrayList<String> getSubSequence(String str)
	{
		if(str.length()==0)
		{
			ArrayList<String> baseResult=new ArrayList<>();
			baseResult.add("");
			return baseResult;
		}
		char ch=str.charAt(0);
		 String res=str.substring(1);
		 ArrayList<String> recursionresult=getSubSequence(res);
		 ArrayList<String> myResult=new ArrayList<>();
		 for(String recursionString : recursionresult)
		 {
			 myResult.add(""+recursionString);
			 //myResult.add(ch + recursionString);
		 }
		 for(String recursionString : recursionresult)
		 {
			// myResult.add(""+recursionString);
			 myResult.add(ch + recursionString);
		 }
		 return myResult;
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String str=s.next();
		ArrayList<String> str1=getSubSequence(str);
		for(String str2 : str1)
		{
			System.out.println(str2);
		}
	}
}
