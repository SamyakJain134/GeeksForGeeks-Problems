package Strings;

import java.util.HashMap;

public class RemoveCommonCharactersandConcainateTWoStrings {
	 public static String concatenatedString(String s1,String s2)
	    {
	        String str="";
	        HashMap<Character,Integer> map=new HashMap<>();
	        
	        for(int i=0;i<s2.length();i++)
	        {
	            map.put(s2.charAt(i),1);
	        }
	        for(int i=0;i<s1.length();i++)
	        {
	        	if(!map.containsKey(s1.charAt(i)))
	        	{
	        		str=str+s1.charAt(i);
	        	}
	        	else
	        	{
	        		map.put(s1.charAt(i),2);	
	        	}
	        }
	        for(int i=0;i<s2.length();i++)
	        {
	        		if(map.get(s2.charAt(i))==1)
	        		{
	        			str=str+s2.charAt(i);
	        		}
	        }
	        if(str=="")
	        {
	        	return "-1";
	        }
	        else
	        {
	        	return str;
	        }
	    }

}
