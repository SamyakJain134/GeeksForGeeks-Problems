package Strings;

import java.util.Arrays;

public class IsomorphicStringS {
	public static boolean isIsomorphic (String str1 ,String str2)
	{
		int n1=str1.length();
		int n2=str2.length();
		if(n1!=n2)
		{
			return false;
		}
		int arr1[]=new int[256];
		int arr2[]=new int[256];
		Arrays.fill(arr1,0);
		Arrays.fill(arr2,0);
		
		for(int i=0;i<n1;i++)
		{
			if((arr1[str1.charAt(i)]!=str1.charAt(i)) && (arr2[str2.charAt(i)]!=str2.charAt(i))) //First occurance of bnoth cahracters
			{
				//System.out.println(str1.charAt(i)+"    "+str2.charAt(i));
				arr1[str1.charAt(i)]=str2.charAt(i);
				arr2[str2.charAt(i)]=str1.charAt(i);
				
				
			}
			else if(arr1[str1.charAt(i)] != str2.charAt(i))
			{
				
				return false;
			}
		}
		return true;
	}
	public static boolean areIsomorphic(String str1,String str2)
    {
        // Your code here
        int l1=str1.length();
        int l2=str2.length();
        if(l1!=l2)
        {
            return false ;
        }
        int []count1=new int[256];
        int []count2=new int[256];
        for(int i=0;i<l1;i++)
        {
            count1[str1.charAt(i)-'a']++;
            count2[str2.charAt(i)-'a']++;
            
            
            
            if(  count1[str1.charAt(i)-'a']!=
            count2[str2.charAt(i)-'a'])
            {
                return false ;
            }
        }
       
       return true ; 
        
        
    }
	public static void main(String args[])
	{
		if(isIsomorphic("rfkqyuqf", "jkxyqvnr"))
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("np");
		}
	}

}
