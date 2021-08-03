package Strings;

import java.util.HashMap;

public class MinimumWindowSubString {
	  public static String smallestWindow(String s, String p)
	    {
	        String ans="";
	        HashMap<Character,Integer> map2=new HashMap<>();
	        for(int i=0;i<p.length();i++)
	        {
	        	map2.put(p.charAt(i), map2.getOrDefault(p.charAt(i), 0)+1); //phle se character padha hai yto uski frequency nikal kar add kr dega 
	        	//varna zero +1 karke dal dega
	        }
	        int matchCount=0;
	        int desiredMatchCount=p.length();
	        HashMap<Character,Integer> map1=new HashMap<>();
	        int i=-1; //for acquiring
	        int j=-1; //for realising
	        
	        while(true)
	        {
	        	boolean f1=false;
		        boolean f2=false;
	        	//acquire in striing jkab tak jatch count sahi nahi jho jata 
	        	while(i<s.length()-1 && matchCount< desiredMatchCount)
	        	{
	        		i++; //acquire hota rahega
	        		map1.put(s.charAt(i), map1.getOrDefault(s.charAt(i), 0) +1);
	        		//agar acquire kakre apki frequency zyada ho gai hai to ye kisi kaam ka mnahi hai 
		        	if(map1.getOrDefault(s.charAt(i), 0) <= map2.getOrDefault(s.charAt(i), 0))
		        	{
		        		//Kaam ka banda acquire kia hai aapne 
		        		matchCount++; 
		        	}
		        	//Matlab agar p  string me kisi ek character ki frequncy 2 hai auur 2 akready s string mil gai toh matchcount badhana hai vrna kaam ka banda nahi hai n
		        	
		        	//collect and release answer
		        	f1=true;
	        	}
	        	
	        	while(j<i &&  matchCount==desiredMatchCount) 
	        	{
	        		//yaha tak valid answer apne paas hai apan batter valid banane ki koshish kar rahe hai
	        		String validAnswer=s.substring(j+1,i+1); 
	        		//ek extra lena padhta hai 
	        		if(ans.length()==0 || validAnswer.length()<ans.length())
	        		{
	        			ans=validAnswer;
	        		}//collect akr liya 
	        		
	        		
	        		//aab release karenge
	        		j++;
	        		//release karenge release karne se frequency kam hogi 
	        		if(map1.get(s.charAt(j))==1)
	        		{
	        			map1.remove(s.charAt(j)); //phle element se delete karenege
	        		}else
	        		{
	        			map1.put(s.charAt(j), map1.get(s.charAt(j)) - 1);
	        		}
	        		if(map1.getOrDefault(s.charAt(j), 0) < map2.getOrDefault(s.charAt(j),0)) {
	        			//kaam ka banda gawaya hai 
	        			matchCount--;
	        		}
	        		f2=true;
	        	}
	        	if(f1==false && f2==false)
	        	{
	        		break;
	        	}
	        }
			return ans; 
	    }
}
