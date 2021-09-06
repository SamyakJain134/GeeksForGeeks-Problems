package Strings;

public class UncommoncharactersOfTwoStrings {
	public static void string(String str1,String str2)
	{
		int present[]=new int[256];
		for(int i=0;i<str1.length();i++)
		{
			present[str1.charAt(i)-'a']=1;
		}
		for(int i=0;i<str2.length();i++)
		{
			if(present[str2.charAt(i)-'a']==1 || present[str2.charAt(i)-'a']==-1)
			{
				present[str2.charAt(i)-'a']=-1;
			}
			else
			{
				present[str2.charAt(i)-'a']=2;
			}
		}
		for(int i=0;i<present.length;i++)
		{
			if(present[i]==1 ||present[i]==2 )
			{
				System.out.println((char)(i+'a') + " ");
			}
		}
	}
	public static void main(String[] args) {
		String str1="characters";
		String str2="alphabets";
		string(str1, str2);
	}
}
