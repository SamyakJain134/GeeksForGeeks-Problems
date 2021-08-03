package Strings;

public class ReverseAString {
	public static String reverseWord(String str)
    {
        String s="";
        for(int i=str.length()-1;i>=0;i--)
        {
            s=s+str.charAt(i);
        }
        return s;
    }

}
