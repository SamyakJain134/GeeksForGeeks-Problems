package Strings;

public class CheckifStringsareRotationofEachOherorNot {
	public static boolean areRotations(String s1, String s2 )
    {
        if((s1.length()==s2.length()) && ((s1+s1).contains(s2)))
        {
            return true;
        }
        return false;
    }
}
