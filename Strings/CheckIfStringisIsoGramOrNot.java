package Strings;

import java.util.Arrays;
// An Isogram is a word in which no letter occurs more than once.
public class CheckIfStringisIsoGramOrNot {
	public static boolean isIsogram(String data){
       char arr[]=data.toCharArray();
       Arrays.sort(arr);
       data=new String(arr);
       System.out.println(data);
       if(data.length()==1)
        {
        	return true;
        }
        for (int i=1;i<data.length();i++)
        {
        	if(data.charAt(i)==data.charAt(i-1))
        	{
        		return false;
        	}
        }
        return true;
        
    }
	public static boolean isIsogram2(String data)
	{
		int arr[]=new int[256];
		for(int i=0;i<data.length();i++)
		{
			arr[data.charAt(i)]++;
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>1)
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String args[])
	{

		if(isIsogram("machine"))
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("np");
		}
		if(isIsogram2("machine"))
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("np");
		}
	}

}
