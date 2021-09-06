package Strings;

public class MaximumOccuringCharacter {
	public static char getMaxOccuringChar(String line)
    {
        
        // Your code here
        char result=' ';
        int max=-1 ;
        int []count=new int[256];
        int l = line.length();
        for(int i=0;i<l;i++)
        {
            
            count[line.charAt(i)]++;
        }
        for(int i =97 ;i<122;i++)
        {
   
            if(max<count[i])
            {
                max=count[i];
                result=(char)(i);
            }
        }
        return result;
        
        
        
        
    }
}
