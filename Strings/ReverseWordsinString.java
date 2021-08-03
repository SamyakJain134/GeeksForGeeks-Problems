package Strings;

public class ReverseWordsinString {
public static void ReverseWords(char []str )
{
	int start=0;
	for(int end=0;end<str.length;end++)
	{
		if(str[end]==' ')
		{
			reverseWords(str,start,end-1);
			
			start=end+1;
		}
	}
	reverseWords(str, start, str.length-1); //for reversing last word
	reverseWords(str, 0, str.length-1);
}

private static void reverseWords(char[] str, int start, int end)
{

	while(start<=end)
	{
		char temp=str[start];
		str[start]=str[end];
		str[end]=temp;
		start++;
		end--;
	}
	
}
public static void main (String args[])
{
	String s="Hi Samyak How are you";
	char str[]=s.toCharArray();
	ReverseWords(str);
	System.out.println(str);
	String s1=new String(str);
	
}
}
