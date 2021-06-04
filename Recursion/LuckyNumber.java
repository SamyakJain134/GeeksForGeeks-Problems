package Recursion;

public class LuckyNumber {
	 public static int counter =2;
	    public static boolean isLucky(int n)
	    {
	        int nextPos=n; //the number iself 
	        if(counter>n)
	        {
	            return true;
	        }
	        if(n%counter==0)
	        {
	            return false;
	        }
	        nextPos=nextPos-nextPos/counter;
	        counter++;
	        return isLucky(nextPos);
	        
	    }
public static void main(String args[])
{
	System.out.println(isLucky(5));
}
}
