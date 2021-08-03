package Strings;

public class NaivePatternSearching {
	public static void naivePatternSearchimg(String text , String Patt)
	{
		int n=text.length();
		int m=Patt.length();
		for(int i=0;i<=n-m;i++)
		{
			int j;
			for(j=0;j<m;j++)
			{
				if(Patt.charAt(j)!=text.charAt(i+j))
				{
					break;
				}
			}
			if(j==m)
			{
				System.out.println(i+" ");	
			}
		}
	}
	//Improved NAive Pattern Searching
	//Pattern has all distinct characters 
	public static void naivePatternSearchimgDistinctElements(String text , String Patt)
	{
		int n=text.length();
		int m=Patt.length();
		for(int i=0;i<=n-m;)
		{
			int j;
			for(j=0;j<m;j++)
			{
				if(Patt.charAt(j)!=text.charAt(i+j))
				{
					break;
				}
			}
			if(j==m)
			{
				System.out.println(i+" ");	
			}
			if(j==0) //first character of pattern didnt match
			{
				i++;
			}
			else
			{
				i=i+j;
			}
		}
	}
	public static void main(String args[])
	{
		naivePatternSearchimg("GeeksForGeeks", "For");
	}

}
