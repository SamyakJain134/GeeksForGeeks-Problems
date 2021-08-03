package Strings;

import java.util.Arrays;

public class LeftMostRepeatingCharacter {
	public static int leftMostNaive(String str)
	{
		for(int i=0;i<str.length();i++)
			
		{
			for(int j=1;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					return i;
				}
			}
		}
		return -1;
	}
	/////////
	static final int count=256;
	public static int lineartimeapproach(String str)
	{
		int arr[]=new int [count];
		for(int i=0;i<str.length();i++)
		{
			arr[str.charAt(i)]++;
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>1)
			{
				return i;
				
			}
		}
		return -1;
		
	}
	///////////////////////////
	//using one traversal only
	public static int usingonetraversal(String str)
	{
		int arr[]=new int [count];
		int res=Integer.MAX_VALUE;
		Arrays.fill(arr,-1);
		for(int i=0;i<str.length();i++)
		{
			int firstIndex=arr[str.charAt(i)];
			if(firstIndex==-1) // not present
			{
				arr[str.charAt(i)]=i;
			}
			else
			{
				res=Math.min(firstIndex, res);
			}
		}
		if(res==Integer.MAX_VALUE)
		{
			return -1;
		}
		else
			return res;
	}
	public static int efficiemt2(String str)
	{
		boolean visited[]=new boolean [count];
		int res=-1;
		for(int i=str.length()-1;i>=0;i--)
		{
			if(visited[str.charAt(i)]) //if true means already character is present
			{
				res=i;
			}
			else
			{
				visited[str.charAt(i)]=true;
			}
		}
		return res;
	}

}
