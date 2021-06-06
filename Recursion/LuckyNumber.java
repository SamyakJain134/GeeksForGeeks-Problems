package Recursion;

public class LuckyNumber {
	 public static int counter =2;
	    public static boolean isLucky(int n)
	    {
	        int nextPos=n; //the number iself 
	        if(counter>n) // abhi tak divide nahi hua 
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
	     
	    
	    // Returns 1 if n is a lucky no.
	    // ohterwise returns 0
	      public static int counter1 = 2;  
	         static boolean isLucky2(int n)
	        {
	            
	            int next_position = n;
	            if(counter1 > n)
	                return true;
	            if(n%counter1 == 0)
	                return false;     
	      
	            // calculate next position of input no
	            next_position -= next_position/counter1;
	        
	            counter1++;
	            return isLucky2(next_position);
	        }
	     
	        
	        static boolean isLuckyMain(int n)
	        {
	            counter1=2;
	            return isLucky2(n);
	        }
	    
public static void main(String args[])
{
	System.out.println(isLucky2(74));
}
}
