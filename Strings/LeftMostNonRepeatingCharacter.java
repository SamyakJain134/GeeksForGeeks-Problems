package Strings;

import java.util.Arrays;

public class LeftMostNonRepeatingCharacter {
	public static int leftnonRepeating(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			boolean flag=false;
			for(int j=0;j<str.length();j++)
			{
				if(i!=j && str.charAt(i)==str.charAt(j))
				{
					flag=true;
					break;
				}
			}
			if(flag==false)
			{
				return i;
			}
		}
		return -1;
		
	}
	//Better soliution which requires two traversals
	static final int count=256;
	public static int twotraversal(String str)
	{
		 int arr[]=new int[count];
		 for(int i=0;i<str.length();i++)
		 {
			 arr[str.charAt(i)]++;
		 }
		 for(int i=0;i<arr.length;i++)
		 {
			 if(arr[str.charAt(i)]==1)
			 {
				 return i;
			 }
		 }
		 return -1;
	}
	public static int onetraversal(String str)
	{
		int arr[]=new int[count];
		Arrays.fill(arr,-1);
		int res=Integer.MAX_VALUE;
		for(int i=0;i<str.length();i++)
		{
			int index=arr[str.charAt(i)];
			if(index==-1) //character ka first occurance hai
			{
				arr[str.charAt(i)]=i; 
			}
			else//character ka phle bhi occurance hai
			{
				arr[str.charAt(i)]=-2;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>=0)
			{
				res=Math.min(arr[i], res);
			}
		}
		if(res==Integer.MAX_VALUE)
		{
			return -1;
		}
		else
		{
			return res;
		}
	}
	
}
