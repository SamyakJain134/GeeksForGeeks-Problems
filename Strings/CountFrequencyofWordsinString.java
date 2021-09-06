package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CountFrequencyofWordsinString {
	public static void countWords(String str)
	{
		String arr[]=str.split(" ");
		HashMap<String,Integer> map=new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			if(map.containsKey(arr[i]))
			{
				map.put(arr[i], map.get(arr[i])+1);
			}
			else
			{
				map.put(arr[i], 1);
			}
		}
		for(Map.Entry<String,Integer> entry :	map.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		
	}
}
