package Strings;

import java.util.HashMap;

public class LengthofLongestSubstringWithoutRepeatingCharacer {
	int longestUniqueSubsttr(String S){
        int ans=0;
        int i=-1;
        int j=-1;
        HashMap<Character,Integer> map=new HashMap<>();
        while(true)
        {
            //acquire
            //release
            boolean f1=false;
            boolean f2=false;
            while(i<S.length()-1)
            {
                f1=true;
                i++;
                char ch=S.charAt(i);
                map.put(ch,map.getOrDefault(ch,0)+1);
                if(map.get(ch)==2) //invalid ho gai
                {
                    break;
                }
                else //valid hai abhi tak
                {
                    int len=i-j;
                    if(len>ans)
                    {
                        ans=len;
                    }
                }
            }
            //Invalid ho gye to release karna hai 
            while(j<i)
            {
                f1=true;
                j++;
                char ch=S.charAt(j);
                map.put(ch,map.get(ch)-1);
                 if(map.get(ch)==1)
                 {
                     break;
                 }
                 
            }
            if(f1==false && f2==false)
            {
                break;
            }
        }
        return ans;
    }

	
}
