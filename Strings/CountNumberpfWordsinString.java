package Strings;

public class CountNumberpfWordsinString {
	public static int countWords(String str)
    {
        // find and return the number of words 
        // present in the string
		System.out.println(str);
        String []arr = str.split(" ");
        System.out.println(arr);
        int l= arr.length;
        return l ;
    }
public static int countWords1(String str)
	    {
	        //Initializing inital Word count to 1
	        int count = 1; //one word would always be there ;
	        
	        //counting number spaces between words
	        for(int i = 0; i < str.length(); i++)
	        {
	            if(str.charAt(i) == ' ')
	                count++;
	        }
	        
	        //returning the total Word count
	        return count;
	    }
	public static void main(String args[])
	{
		String str="I am geeks";
		System.out.println(countWords1(str));
	}

}
