package Strings;

public class CountDistinctVovelsinString {
	 public static int countVowels(String str)
	    {
	        boolean present[]=new boolean[26];
	        int count=0;
	        for(int i=0;i<str.length();i++)
	        {
	            char ch=str.charAt(i);
	            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
	            {
	                if(present[str.charAt(i)-'a']==false)// agar size 26 lenge toh 26 - karna padega 
	                {
	                    count++;
	                    present[str.charAt(i)-'a']=true;
	                }
	            }
	        }
	        return count;
	    }
	 public static void main(String[] args) {
		System.out.println(countVowels("samyakee"));
	}
}
