package Strings;

import java.util.HashMap;

public class MinimumIndexedCharacter {
	public static int minIndexChar(String str, String patt)
	{
		 int res=Integer.MAX_VALUE;
			HashMap<Character,Integer> map=new HashMap<>();
			for(int i=0;i<str.length();i++)
			{
				if(!map.containsKey(str.charAt(i)))
				{
					map.put(str.charAt(i), i);
				}
			}
			for(int i=0;i<patt.length();i++)
			{
				if(map.containsKey(patt.charAt(i)))
				{
				    if(map.get(patt.charAt(i)) < res)
				    {
				        res= map.get(patt.charAt(i));
				    }
				}
			}
			if(res!=Integer.MAX_VALUE)
			{
			    return res;
			}
			else
			{
			    return -1;
			}
	}
	

}
