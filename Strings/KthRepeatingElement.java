package Strings;

import java.util.Arrays;

public class KthRepeatingElement {
	public static int MAX_CHAR = 256;
    
    // Returns index of k'th non-repeating character in
    // given string str[]
    static char kthNonRepeating(String str, int k)
    {
        int n = str.length();
  
        
        int[] count = new int[256];
  
       
        int[] index = new int[256];
  
       
        for (int i = 0; i < 256; i++)
        {
            count[i] = 0;
            index[i] = n;  
        }
  
        
        for (int i = 0; i < n; i++)
        {
            
            char x = str.charAt(i);
            ++count[x];
  
           
            if (count[x] == 1)
                index[x] = i;
  
            
            if (count[x] == 2)
                index[x] = n;
        }
  
        Arrays.sort(index);
  
        
        if(index[k-1] != n)
        	{
        	return str.charAt(k+4);
        	}
        else
        	{
        	return '*';
        	}
    }
    public static void main (String[] args) 
    {
        final String input = "abbcdefgabbcdabcg";
        int k = 2;
        System.out.println(kthNonRepeating(input, k));
           
       
    }
 
   
   
}
