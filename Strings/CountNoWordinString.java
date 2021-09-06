package Strings;

public class CountNoWordinString {
	public static int countWord(String str) {
		int count=0;
		for(int i=0;i<str.length()-1;i++)
		{
			if(str.charAt(i)==' '&& Character.isLetter(str.charAt(i+1)) && i>0 )
			{
				count++;
			}
		}
		return count+1;
	}
	public static void main(String[] args) {
		String str="Beauty lies in the eyes of beholder";
		System.out.println(countWord(str));
	}

}
