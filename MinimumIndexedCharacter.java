import java.util.HashMap;

public class MinimumIndexedCharacter {
	public static String printMinIndexChar(String str, String patt){
        
        HashMap<Character , Integer> hm = new HashMap<>();
        int minIndex=Integer.MAX_VALUE;
        int m = str.length();
        int n=patt.length();
        for(int i=0;i<m;i++)
    {
        if(!hm.containsKey(str.charAt(i)))
        {
            hm.put(str.charAt(i),i);
        }
    }
    
    for(int i=0;i<n;i++)
    {
        if(hm.containsKey(patt.charAt(i))&&hm.get(patt.charAt(i))<minIndex)
        {
            minIndex=hm.get(patt.charAt(i));
        }
    }
    if(minIndex!=Integer.MAX_VALUE)
    {
        return String.valueOf(str.charAt(minIndex));
    }
    else
    {
        return String.valueOf('$');
    }
    }
	
}
